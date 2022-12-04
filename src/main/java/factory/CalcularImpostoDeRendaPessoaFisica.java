package factory;

public class CalcularImpostoDeRendaPessoaFisica implements CalculoImpostoDeRenda{
    private Pessoa pessoa;

    public CalcularImpostoDeRendaPessoaFisica(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public void calcularImpostoDeRenda() {
        PessoaFisica pessoaFisica = (PessoaFisica) pessoa;

        double alicotaIRPF = 0;

        if (pessoaFisica.getSalario() <= 1100){
            alicotaIRPF = 0.075;
        }

        if (pessoaFisica.getSalario() > 1100 && pessoaFisica.getSalario() <= 2203.48){
            alicotaIRPF = 0.09;
        }

        if (pessoaFisica.getSalario() > 2203.48 && pessoaFisica.getSalario() <= 3305.22){
            alicotaIRPF = 0.12;
        }

        if (pessoaFisica.getSalario() > 3305.22){
            alicotaIRPF = 0.14;
        }

        double INSS = pessoaFisica.getSalario() * 0.1;

        double valorPorDependente = 189.59;

        double IR = ((pessoaFisica.getSalario() - (valorPorDependente * pessoaFisica.getDependentes()) - INSS) * alicotaIRPF) + (pessoaFisica.getValorSaude() + pessoaFisica.getValorEducacao());

        System.out.printf("factory.Pessoa Fisica: O valor dos impostos ficou em: R$%s", IR);

    }
}
