public class CaracteristicasObjetos {
    public static class Cachorro {
        private String nome;
        private int idade;
        private String raca;


        //GET para pegar os dados
        //SET para colocar dados nas variaveis
        public String getNome(){
            return this.nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }

        public int getIdade(){
            return this.idade;
        }

        public void setIdade(int idade){
            if (idade >0 && idade <=20){
                this.idade = idade;
            }else {
                System.err.println("Idade não permitida.");
            }
        }

        public String getRaca(){
            return  this.raca;
        }

        public void setRaca(String raca){
            this.raca = raca;
        }

        public void imprimirDados(){
            System.out.printf(
                    """
                            Nome: %s
                            Idade: %d
                            Raça: %s
                            """,nome, idade, raca
            );
        }
    }

    public static class Tutor {
        private String nome;
        private Cachorro cachorro;

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Cachorro getCachorro() {
            return this.cachorro;
        }

        public void setCachorro(Cachorro cachorro){
            this.cachorro = cachorro;
        }

        public void imprimirDados(){
            System.out.printf("""
                Nome do tutor: %s
                Cão: %s
                """, nome, cachorro.getNome());
        }
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Totó");
        cachorro.setIdade(10);
        cachorro.setRaca("Boxer");

        Tutor tutor = new Tutor();
        tutor.setNome("Hebe");
        tutor.setCachorro(cachorro);

        tutor.imprimirDados();
        cachorro.imprimirDados();
    }
}
