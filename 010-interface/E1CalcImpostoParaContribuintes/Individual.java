package E1CalcImpostoParaContribuintes;

public class Individual extends Contribuinte {

    private double gastosSaude;

    public Individual(String nome, double rendaAnual, double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto() {

        double imposto;

        if (getRendaAnual() < 20000.0) {
            imposto = getRendaAnual() * 0.15;
        } else {
            imposto = getRendaAnual() * 0.25;
        }

        imposto -= gastosSaude * 0.5;

        if (imposto < 0) {
            imposto = 0;
        }

        return imposto;
    }
}
