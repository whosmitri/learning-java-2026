package E1CalcImpostoParaContribuintes;

public class Empresa extends Contribuinte {

    private int numeroFuncionarios;

    public Empresa(String nome, double rendaAnual, int numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double imposto() {

        if (numeroFuncionarios <= 10) {
            return getRendaAnual() * 0.16;
        } else {
            return getRendaAnual() * 0.14;
        }
    }
}