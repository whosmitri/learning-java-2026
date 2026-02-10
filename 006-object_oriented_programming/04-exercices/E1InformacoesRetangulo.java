package aprendendo_java_2026;

public class E1InformacoesRetangulo {
    /*
    * Crie uma classe "Retângulo" que tenha como atributos
    * a altura, a largura, a cor e o material do retângulo,
    * e como métodos a área, volume e o perímetro.
    */

    public static class Retangulo {
        private double altura, largura, comprimento;
        private String cor, material;

        // métodos SET
        public void setAltura(double altura){
            this.altura = altura;
        }
        public void setLargura(double largura){
            this.largura = largura;
        }
        public void setComprimento(double comprimento){
            this.comprimento = comprimento;
        }
        public void setCor(String cor){
            this.cor = cor;
        }
        public void setMaterial(String material){
            this.material = material;
        }

        // métodos GET
        public double getAltura(){
            return this.altura;
        }
        public double getLargura(){
            return this.largura;
        }
        public double getComprimento(){
            return this.comprimento;
        }
        public String getCor(){
            return this.cor;
        }
        public String getMaterial(){
            return this.material;
        }

        // métodos gerais
        public void imprimirDados() {
            System.out.printf("""
                    Altura: %.2f
                    Largura: %.2f
                    Comprimento: %.2f
                    Cor: %s
                    Material: %s""", getAltura(), getLargura(), getComprimento(), getCor(), getMaterial());
        }

        public double calcArea() {
            double area = getAltura() * getLargura();
            return area;
        }

        public double calcVolume() {
            double volume = this.getComprimento() * getAltura() * getLargura();
            return volume;
        }

        public double calcPertimetro() {
            double perimetro = 2*getAltura() + 2*getLargura();
            return perimetro;
        }
    }


    public static void main(String[] args) {
        Retangulo retangulo1 = new Retangulo();
        retangulo1.setAltura(4);
        retangulo1.setLargura(2);
        retangulo1.setComprimento(2);
        retangulo1.setCor("Verde");
        retangulo1.setMaterial("Plástico");

        retangulo1.imprimirDados();

        double area = retangulo1.calcArea();
        double perimetro = retangulo1.calcPertimetro();
        double volume = retangulo1.calcVolume();
        System.out.printf("""
                %n%nÁrea: %.3f
                Perímetro: %.3f
                Volume: %.3f""", area, perimetro, volume);
    }

}
