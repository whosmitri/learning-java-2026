package aprendendo_java_2026;

import java.util.Scanner;

public class E3SomandoNaColuna {
    public static void main(String[] args) {
        // variáveis
        int numColParaSomar, somaDaCol=0;

        // criando matriz
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // criando scanner
        Scanner sc = new Scanner(System.in);

        // imprimindo a matriz para mostrar ao usuário
        System.out.println("Escolha a coluna: \n[ 0 ][ 1 ][ 2 ]");
        System.out.println("---------------");
        for (int i=0 ; i<3 ; i++) {
            for (int j=0 ; j<3 ; j++){
                System.out.printf("[%3d]", matriz[i][j]);
            }
            System.out.println();
        }

        // definindo a coluna a ser somanda
        System.out.print("Digite qual coluna você deseja somar: ");
        numColParaSomar = sc.nextInt();

        // somando
        for (int i=0 ; i < matriz.length ; i++) {
            somaDaCol += matriz[i][numColParaSomar];
        }

        // exibindo a soma para o usuário
        System.out.println("Soma: " + somaDaCol);

    }
}
