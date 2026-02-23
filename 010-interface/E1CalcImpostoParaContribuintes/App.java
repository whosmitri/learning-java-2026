package E1CalcImpostoParaContribuintes;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // variáveis
        int numC, tipoC;

        // criando scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de contribuintes: ");
        numC = sc.nextInt();

        Contribuinte[] contribuintes = new Contribuinte[numC];

        for (int i = 0; i < numC; i++) {

            System.out.printf("%nDados do contribuinte %d %n", i + 1);
            System.out.print("Individual ou empresa? [1-Indivisual / 2-Empresa]: ");
            tipoC = sc.nextInt();

            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Renda anual: ");
            double renda = sc.nextDouble();

            if (tipoC == 1) {
                System.out.print("Gastos com saúde: ");
                double gastos = sc.nextDouble();
                contribuintes[i] = new Individual(nome, renda, gastos);

            } else {
                System.out.print("Número de funcionários: ");
                int funcionarios = sc.nextInt();
                contribuintes[i] = new Empresa(nome, renda, funcionarios);
            }
        }

        double total = 0;

        System.out.println("\nIMPOSTOS PAGOS:");

        for (int i = 0; i < numC; i++) {
            double imposto = contribuintes[i].imposto();
            System.out.printf("%s: R$ %.2f%n", contribuintes[i].getNome(), imposto);
            total += imposto;
        }

        System.out.printf("TOTAL DE IMPOSTO: R$ %.2f %n", total);

        sc.close();
    }
}