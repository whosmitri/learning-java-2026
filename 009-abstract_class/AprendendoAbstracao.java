import java.util.ArrayList;

public class AprendendoAbstracao {

    public static abstract class Animal {
        private String nome, raca, especie;

        public Animal(String nome, String raca, String especie) {
            setNome(nome);
            setRaca(raca);
            setEspecie(especie);
        }

        // métodos SET
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setRaca(String raca) {
            this.raca = raca;
        }
        public void setEspecie(String especie) {
            this.especie = especie;
        }

        // métodos GET
        public String getNome() {
            return nome;
        }
        public String getRaca() {
            return raca;
        }
        public String getEspecie() {
            return especie;
        }
    }

    public static class Gato extends Animal {
        public Gato(String nome, String raca, String especie) {
            super(nome, raca, especie);
        }
    }

    public static class Cachorro extends Animal {
        public Cachorro(String nome, String raca, String especie) {
            super(nome, raca, especie);
        }
    }

    public static void main(String[] args) {
        Gato g = new Gato("", "", "");
        Cachorro c = new Cachorro("", "", "");
        ArrayList<Animal>animais = new ArrayList<>();
        animais.add(g);
        animais.add(c);

        // jeito padrão de pegar
        for (int i=0 ; i < animais.size() ; i++) {
            System.out.println(animais.get(i));
        }

        for (Animal a : animais) {
            System.out.println(a.getNome());
        }
    }
}
