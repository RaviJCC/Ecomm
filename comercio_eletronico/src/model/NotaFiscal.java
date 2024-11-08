package model;

import java.util.List;
// import java.util.stream.Collectors; later //
// import java.util.stream.Stream; later //

public class NotaFiscal {
    private List<Produto> produtos;

    public NotaFiscal(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double calcularValorTotal() {
        return produtos.stream()
                .mapToDouble(produto -> produto.getpreco() * produto.getquantidade())
                .sum();
    }

    public void realizarPagamento(Pagamento pagamento) {
        double valorTotal = calcularValorTotal();
        pagamento.processarPagamento(valorTotal); // Passa o valor total da nota fiscal para o pagamento
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
