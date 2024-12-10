package Model.carrinho;

import Interface.EstoqueProdutosGeral;
import Interface.Pagamento;
import Model.produtosetor.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Produto> produtos;
    private EstoqueProdutosGeral estoqueProdutos; // Repositório de produtos cadastrados

    public CarrinhoCompras(EstoqueProdutosGeral estoqueProdutos) {
        this.produtos = new ArrayList<>();
        this.estoqueProdutos = estoqueProdutos;
    }

    // Adicionar produto ao carrinho pelo ID
    public void adicionarProdutoPorId(int idProduto) {
        Produto produto = estoqueProdutos.buscarProdutoPorId(idProduto);
        if (produto != null) {
            produtos.add(produto);
            System.out.println("Produto adicionado ao carrinho: " + produto.getNome());
        } else {
            System.out.println("Produto com ID " + idProduto + " não encontrado no estoque.");
        }
    }

    // Remover produto do carrinho pelo ID
    public void removerProdutoPorId(int idProduto) {
        Produto produto = produtos.stream()
                .filter(p -> p.getIdProduto() == idProduto)
                .findFirst()
                .orElse(null);

        if (produto != null) {
            produtos.remove(produto);
            System.out.println("Produto removido do carrinho: " + produto.getNome());
        } else {
            System.out.println("Produto com ID " + idProduto + " não encontrado no carrinho.");
        }
    }

    // Listar produtos no carrinho
    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Carrinho vazio.");
        } else {
            System.out.println("Produtos no carrinho:");
            produtos.forEach(System.out::println);
        }
    }

    // Calcular o valor total do carrinho
    public double calcularValorTotal() {
        return produtos.stream()
                .mapToDouble(produto -> produto.getpreco() * produto.getquantidade())
                .sum();
    }

    // Finalizar a compra e processar pagamento
    public void realizarPagamento(Pagamento pagamento) {
        double valorTotal = calcularValorTotal();
        System.out.println("Valor total da compra: R$ " + valorTotal);
        pagamento.processarPagamento(valorTotal);
        produtos.clear(); // Esvazia o carrinho após o pagamento
    }
}
