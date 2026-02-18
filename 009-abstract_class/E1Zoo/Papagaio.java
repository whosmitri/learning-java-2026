package E1Zoo;

public class Papagaio extends Passaro {
    String nome;

    // método construtor
    public Papagaio(String nome) {
        setNome(nome);
    }

    // métodos SET
    public void setNome(String nome) {
        this.nome = nome;
    }

    // métodos GET
    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void imprimir() {

    }
}
