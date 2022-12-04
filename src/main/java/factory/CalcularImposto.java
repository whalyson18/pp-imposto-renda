package factory;

public class CalcularImposto {
    public void calcular(Pessoa pessoa) {
        CalculoImpostoDeRenda calculoImpostoDeRenda = ImpostoFactory.impostoFactory(pessoa);
        calculoImpostoDeRenda.calcularImpostoDeRenda();
    }
}
