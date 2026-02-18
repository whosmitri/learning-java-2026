package E1Zoo;

public class BemTeVi extends Passaro {
    String nome;

    // método construtor
    public BemTeVi(String nome) {
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

    // métodos gerais
    @Override
    public void imprimir() {

    }
}
