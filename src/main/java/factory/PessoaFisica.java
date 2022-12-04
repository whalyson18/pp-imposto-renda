package factory;

public class PessoaFisica extends Pessoa{
    private double salario;
    private int dependentes;
    private double valorSaude;
    private double valorEducacao;

    public PessoaFisica(long id, String nome, double salario, int dependentes, double valorSaude, double valorEducacao) {
        super(id, nome);
        this.salario = salario;
        this.dependentes = dependentes;
        this.valorSaude = valorSaude;
        this.valorEducacao = valorEducacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public double getValorSaude() {
        return valorSaude;
    }

    public void setValorSaude(double valorSaude) {
        this.valorSaude = valorSaude;
    }

    public double getValorEducacao() {
        return valorEducacao;
    }

    public void setValorEducacao(double valorEducacao) {
        this.valorEducacao = valorEducacao;
    }
}
