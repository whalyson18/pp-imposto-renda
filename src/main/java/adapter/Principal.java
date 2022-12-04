package adapter;

public class Principal {
    public static void main(String[] args) {
        PessoaFisica pessoaFisica = new PessoaFisica(1, "Whalyson", 3000, 2, 221.89, 500);
        PessoaJuridica pessoaJuridica = new PessoaJuridica(1, "Vmoraes", 30000);
        ImpostoDeRenda imposto = new PessoaFisicaAdapter();
        imposto.calcularImpostoDeRenda(pessoaFisica);

        imposto = new PessoaJuridicaAdapter();
        imposto.calcularImpostoDeRenda(pessoaJuridica);


    }
}
