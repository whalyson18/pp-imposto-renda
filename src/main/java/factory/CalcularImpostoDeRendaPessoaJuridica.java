package factory;

public class CalcularImpostoDeRendaPessoaJuridica implements CalculoImpostoDeRenda{
    private Pessoa pessoa;

    public CalcularImpostoDeRendaPessoaJuridica(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public void calcularImpostoDeRenda() {
        PessoaJuridica pessoaJuridica = (PessoaJuridica) pessoa;
        double impostoValorExcedente = 0;

        if (pessoaJuridica.getRendimento() > 20000)
            impostoValorExcedente = (pessoaJuridica.getRendimento() - 20000) * 0.1;

        double IR = pessoaJuridica.getRendimento() * 0.15;
        double CSLL = pessoaJuridica.getRendimento() * 0.09;
        double ICMS = pessoaJuridica.getRendimento() * 0.05;

        System.out.printf("factory.Pessoa Juridica. O valor dos impostos ficou em: R$%s", (impostoValorExcedente + IR + CSLL + ICMS));

    }
}
