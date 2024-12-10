package Model.produtosetor;

public class ProdutoConcreto extends Produto {
    // O construtor repassa os parâmetros para a classe base (Produto)
    public ProdutoConcreto(int idProduto, String nome, String categoria, String descricao, double preco, int quantidade) {
        super(idProduto, nome, categoria, descricao, preco, quantidade);
    }

    @Override
    public double calcularDesconto() {
        return 0;
    }


}
