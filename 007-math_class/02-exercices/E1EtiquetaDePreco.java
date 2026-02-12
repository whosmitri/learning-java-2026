package aprendendo_java_2026;

import java.util.Scanner;

public class E1EtiquetaDePreco {

    public static class Produto {
        String nome;
        double preco;

        // método construtor
        public Produto(String nome, double preco) {
            setNome(nome);
            setPreco(preco);
        }

        // métodos SET
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setPreco(double preco) {
            this.preco = preco;
        }

        // métodos GET
        public String getNome() {
            return nome;
        }
        public double getPreco() {
            return preco;
        }

        // métodos gerais

        @Override
        public String toString() {
            return "Nome do produto: " + nome +
                    "Preço: R$" + preco;
        }
    }

    public static class ProdutoImportado extends Produto {
        double taxaAlfandega;

        // método construtor
        public ProdutoImportado(double taxaAlfandega) {
            setTaxaAlfandega(taxaAlfandega);
        }

        // métodos SET
        public void setTaxaAlfandega(double taxaAlfandega) {
            this.taxaAlfandega = taxaAlfandega;
        }

        // métodos GET

        public double getTaxaAlfandega() {
            return taxaAlfandega;
        }
    }


    public static void main(String[] args) {
        // variáveis

        // criando scanner
        Scanner sc = new Scanner(System.in);

        // lendo quantidade de produtos
        System.out.print("Informe a quantidade de produtos: ");
        int qtdProduto = sc.nextInt();
    }
}
