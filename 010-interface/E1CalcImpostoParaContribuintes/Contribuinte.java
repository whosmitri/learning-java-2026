package E1CalcImpostoParaContribuintes;

public abstract class Contribuinte implements Imposto {

    private String nome;
    private double rendaAnual;

    // método construtor
    public Contribuinte(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }

    // métodos GET
    public String getNome() {
        return nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    // método de calcular imposto
    @Override
    public abstract double imposto();
}