package model;

public class Produto {
    private int idProduto;
    private String nome;
    private String categoria;
    private String descricao;
    private double preco;
    private int quantidade;


    public Produto(int idProduto, String nome, String categoria, String descricao, double preco, int quantidade) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }


    public int getidProduto() {
        return idProduto;
    }
    public void setidProduto(int idProduto) {
        this.idProduto= idProduto;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getcategoria() {
        return categoria;
    }

    public void setcategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getdescricao() {
        return descricao;
    }

    public void setdescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getpreco (){
        return this.preco;
    }

    public void setpreco(double preco) {
        this.preco = preco;
    }

    public int getquantidade() {
        return this.quantidade;
    }

    public void setquantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}


