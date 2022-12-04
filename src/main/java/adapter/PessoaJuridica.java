package adapter;

public class PessoaJuridica extends Pessoa {
    private double rendimento;

    public PessoaJuridica(long id, String nome, double rendimento) {
        super(id, nome);
        this.rendimento = rendimento;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
}
