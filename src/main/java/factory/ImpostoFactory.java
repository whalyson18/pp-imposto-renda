package factory;

public class ImpostoFactory {
    private ImpostoFactory(){}

    static CalculoImpostoDeRenda impostoFactory(Pessoa pessoa){
        if (pessoa.getClass().equals(PessoaFisica.class)){
            return new CalcularImpostoDeRendaPessoaFisica(pessoa);
        }
        else{
            return new CalcularImpostoDeRendaPessoaJuridica(pessoa);
        }
    }
}
