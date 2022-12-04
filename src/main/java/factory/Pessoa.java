package factory;

public class Pessoa {
    private long id;

    public Pessoa(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    private String nome;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
