package model;

public class Cliente {
    private int idCliente;
    private String nome;
    private String cpf;
    private String endereco;
    private String email;

    public Cliente(int idCliente, String nome, String cpf, String endereco, String email) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
    }


    public int getidCliente() {
        return idCliente;
    }
    public void setidCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getcpf() {
        return cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }

    public String getendereco() {
        return endereco;
    }

    public void setendereco(String endereco) {
        this.endereco = endereco;
    }

    public String getemail (String email) {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
}

