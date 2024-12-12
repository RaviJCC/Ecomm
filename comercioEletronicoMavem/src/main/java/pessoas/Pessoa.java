package pessoas;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="pessoa")
public class Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcliente")
    private Integer id;

    @Column(name="nome")
    private String nome;

    @Column(name="email")
    private String email;

    // Construtor padrão (sem parâmetros)
    public Pessoa() {
    }

    // Construtor com parâmetros (já existente)
    public Pessoa(Integer id, String nome, String email) {
        super();
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    public Integer getID() {
        return id;
    }

    public void setID(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
    }
}
