public class AprendendoHeranca {

    public class Animal {

        //atributos
        private String nome;
        private int idade;

        //contrutores
        public Animal(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public Animal() {
        }

        // métodos SET
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setIdade(int idade) {
            this.idade = idade;
        }

        // métodos GET
        public String getNome() {
            return nome;
        }
        public int getIdade() {
            return idade;
        }

        //métodos da classe
        @Override
        public String toString() {
            return "Animal{" +
                    "nome='" + nome + '\'' +
                    ", idade=" + idade +
                    '}';
        }
    }

    public class Gato extends Animal {
        @Override
        public String toString() {
            return "Gato{" +
                    "nome='" + super.getNome() + '\'' +
                    ", idade=" + super.getIdade() +
                    '}';
        }
    }

    public class Cobra extends Animal {
        private String tipoVeneno;

        public Cobra(String nome, int idade, String tipoVeneno) {
            super(nome, idade);
            setTipoVeneno(tipoVeneno);
        }

        public void setTipoVeneno(String tipoVeneno) {
            this.tipoVeneno = tipoVeneno;
        }

        public String getTipoVeneno() {
            return this.tipoVeneno;
        }
    }

    public class App {
        public void main(String[] args) {

            Gato g = new Gato();
            g.setNome("Lili");
            g.setIdade(5);

            Animal a = new Cobra("Celeste",5,"Mortal");
            Animal animais[] = new Animal[10];

            animais[0] = g;
            animais[1] = a;

            for (int i = 0; i < 2; i++) {
                System.out.println(animais[i]);
            }
        }
    }
}
