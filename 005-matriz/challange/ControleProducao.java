package challange;

import java.util.Scanner;

public class ControleProducao {
    // total produzido no dia
    public static int totalProduzidoDia(int[][] matriz) {
        int soma=0;

        // somando os itens da linha
        for (int i = 0; i < matriz.length; i++) { // loop pelas linhas
            for (int j = 0; j < matriz[i].length; j++) { // loop pelas colunas da linha definida pelo usuário
                soma += matriz[i][j]; // acumula o valor
            }
        }

        return soma;
    }

    public static int[] totalProduzidoTurno(int[][] matriz) {
        int soma = 0;
        int totalTurno[] = new int[3];

        // somando os itens de cada linha
            for (int i = 0; i < matriz.length; i++) { // loop pelas linhas
                soma = 0;
                for (int j = 0; j < matriz[i].length; j++) { // loop pelas colunas
                    soma += matriz[i][j]; // acumula o valor
                }
                System.out.println(soma);
                totalTurno[i] = soma;
            }

        return totalTurno;
    }

    public static int totalProduzidoProduto(int[][] matriz, int numCol) {
        int soma=0;

        // somando todos os turnos
        for (int i=0 ; i < matriz.length ; i++) {
            soma += matriz[i][numCol];
        }

        return soma;
    }

    public static int contarValor(int[][] matriz, int num) {
        int numOcorrencia = 0;
        // contando as ocorrências desse número
        for (int i = 0; i < matriz.length; i++) { // loop pelas linhas
            for (int j = 0; j < matriz[i].length; j++) { // loop pelas colunas
                if (num == matriz[i][j]) { // verifica se é o valr escolhido e o valor nessa posição d amatriz é igual
                    numOcorrencia += 1; // acumula o valor
                }
            }
        }

        return numOcorrencia;
    }

    public static void main(String[] args) {
        // variáveis
        int escolha;

        // criando matriz
        int[][] matriz = {
                {10, 5, 8, 6},
                {7, 9, 4, 10},
                {6, 3, 12, 5}
        };

        // criando scanner
        Scanner sc = new Scanner(System.in);

        // imprimindo a matriz para mostrar ao usuário
        System.out.printf("%11s [ A ][ B ][ C ][ D ]", "|");
        System.out.print("\n---------------------------------");
        for (int i = 0; i < matriz.length; i++) {
            switch (i) {
                case 0:
                    System.out.printf("%n[ Manhã ] | ");
                    break;
                case 1:
                    System.out.printf("%n[ Tarde ] | ");
                    break;
                case 2:
                    System.out.printf("%n[ Noite ] | ");
                    break;
            }
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%3d]", matriz[i][j]);
            }
        }


        // gravando decisão do usuário
        System.out.println("\n\nMENU \n[1] - Verificar total produzido no dia \n[2] - Verificar total produzido em caa turno \n[3] - Verificar total produzido de cada produto \n[4] - Verificar qual turno produziu mais \n[5] - Verificar qual produto foi mais fabricado \n[6] Escolher um valor para verificar sua ocorrência");
        System.out.print("\nDigite o que deseja fazer: ");
        escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                int totalDia = totalProduzidoDia(matriz);
                System.out.printf("O total produzido hoje foi: %d", totalDia);
                break;
            case 2:
                //int totalTurno[] = new int[3];
                int totalTurno[] = totalProduzidoTurno(matriz);
                System.out.print("\nO total produzido em cada turno:");
                // imprime a coleção inteira
                for (int i = 0; i < totalTurno.length; i++) {
                    System.out.printf("%nTurno %-3d: %-4d", i, totalTurno[i]);
                }
                break;
        }


    }
}
