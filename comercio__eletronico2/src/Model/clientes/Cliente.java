package Model.clientes;

public abstract class Cliente {
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

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método abstrato para ações específicas de clientes
    public abstract void registrarCompra(double valor);

    @Override
    public String toString() {
        return "Cliente ID: " + idCliente + ", Nome: " + nome + ", CPF: " + cpf + ", Endereço: " + endereco + ", Email: " + email;
    }
}
