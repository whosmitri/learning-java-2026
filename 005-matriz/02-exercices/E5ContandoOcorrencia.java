package aprendendo_java_2026;

import java.util.Scanner;

public class E5ContandoOcorrencia {
    public static void main(String[] args) {
        // variáveis
        int numEscolhido, numOcorrencia = 0;

        // criando matriz
        int[][] matriz = {
                {1, 2, 1, 3},
                {3, 1, 2, 2},
                {2, 3, 3, 1}
        };

        // criando scanner
        Scanner sc = new Scanner(System.in);

        // imprimindo a matriz para mostrar ao usuário
        System.out.println("Matriz:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%3d]", matriz[i][j]);
            }
            System.out.println();
        }

        // definindo a número a ser contado
        System.out.print("\nEscolha o número para contar as ocorrências dele: ");
        numEscolhido = sc.nextInt();

        // contando as ocorrências desse número
        for (int i = 0; i < matriz.length; i++) { // loop pelas linhas
            for (int j = 0; j < matriz[i].length; j++) { // loop pelas colunas da linha definida pelo usuário
                if (numEscolhido == matriz[i][j]) { // verifica se é a linha indicada
                    numOcorrencia += 1; // acumula o valor
                }
            }
        }

        System.out.printf("%nO número de ocorrências do número %d é: %d", numEscolhido, numOcorrencia);

    }
}
