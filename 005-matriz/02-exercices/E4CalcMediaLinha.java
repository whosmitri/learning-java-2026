package aprendendo_java_2026;

import java.util.Scanner;

public class E4CalcMediaLinha {
    public static void main(String[] args) {
        // variáveis
        int numLinhaParaSomar, somaLinha=0;
        double media=0;

        // criando matriz
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // criando scanner
        Scanner sc = new Scanner(System.in);

        // imprimindo a matriz para mostrar ao usuário
        System.out.print("Escolha a Linha:");
        for (int i=0 ; i<3 ; i++) {
            System.out.printf("%n[ %d ] | ", i);
            for (int j=0 ; j<3 ; j++){
                System.out.printf("[%3d]", matriz[i][j]);
            }
        }

        // definindo a coluna a ser somanda
        System.out.print("\nDigite qual linha você deseja somar: ");
        numLinhaParaSomar = sc.nextInt();

        // somando os itens da linha
        for (int i = 0; i < matriz.length; i++) { // loop pelas linhas
            for (int j = 0; j < matriz[i].length; j++) { // loop pelas colunas da linha definida pelo usuário
                if (numLinhaParaSomar == i) { // verifica se é a linha indicada
                    somaLinha += matriz[numLinhaParaSomar][j]; // acumula o valor
                }
            }
        }

        // calculando média
        media = somaLinha/matriz[numLinhaParaSomar].length;

        // exibindo a soma para o usuário
        System.out.printf("%nA média da linha %d é %.3f", numLinhaParaSomar, media);

    }
}
