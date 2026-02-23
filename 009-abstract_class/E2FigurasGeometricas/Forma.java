package E2FigurasGeometricas;

public abstract class Forma {
    private Cor cor;

    // método construtor
    public Forma(Cor cor) {
        this.cor = cor;
    }

    public Forma() {

    }

    // métodos
    public abstract double area();
    public abstract double perimetro();
    public abstract double volume();
    public abstract double peso();
}
