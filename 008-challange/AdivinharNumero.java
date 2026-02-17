import java.util.Scanner;

public class AdivinharNumero {

    public static void main(String[] args) {
        // variáveis
        int soma=0;
        int resposta;

        // criando scanner
        Scanner sc = new Scanner(System.in);

        // matrizes
        int[][] m1 = {
            {1, 3, 5, 7},
            {9, 11, 13, 15},
            {17, 19, 21, 23},
            {25, 27, 29, 31},
            {33, 35, 37, 39},
            {41, 43, 45, 47},
            {49, 51, 53, 55},
            {57, 59, 61, 63}
        };

        int[][] m2 = {
            {2, 3, 6, 7},
            {10, 11, 14, 15},
            {18, 19, 22, 23},
            {26, 27, 30, 31},
            {34, 35, 38, 39},
            {42, 43, 46, 47},
            {50, 51, 54, 55},
            {58, 59, 62, 63}
        };

        int[][] m3 = {
            {4, 5, 6, 7},
            {12, 13, 14, 15},
            {20, 21, 22, 23},
            {28, 29, 30, 31},
            {36, 37, 38, 39},
            {44, 45, 46, 47},
            {52, 53, 54, 55},
            {60, 61, 62, 63}
        };

        int[][] m4 = {
            {8, 9, 10, 11},
            {12, 13, 14, 15},
            {24, 25, 26, 27},
            {28, 29, 30, 31},
            {40, 41, 42, 43},
            {44, 45, 46, 47},
            {56, 57, 58, 59},
            {60, 61, 62, 63}
        };

        int[][] m5 = {
            {16, 17, 18, 19},
            {20, 21, 22, 23},
            {24, 25, 26, 27},
            {28, 29, 30, 31},
            {48, 49, 50, 51},
            {52, 53, 54, 55},
            {56, 57, 58, 59},
            {60, 61, 62, 63}
        };

        int[][] m6 = {
            {32, 33, 34, 35},
            {36, 37, 38, 39},
            {40, 41, 42, 43},
            {44, 45, 46, 47},
            {48, 49, 50, 51},
            {52, 53, 54, 55},
            {56, 57, 58, 59},
            {60, 61, 62, 63}
        };

        // armazenando as matrizes
        int[][][] matrizes = {m1, m2, m3, m4, m5, m6};

        // percorrendo as matrizes
        for (int m = 0; m < matrizes.length; m++) {
            System.out.println("\nMatriz " + (m + 1) + ":");
            
            for (int i=0 ; i<matrizes[m].length ; i++) {
                for (int j=0 ; j<matrizes[m][i].length ; j++){
                    System.out.printf("[%3d]", matrizes[m][i][j]);
                }
                System.out.println();
            }

            if (m==0) {
                // pedindo para escolher um número e perguntando se já escolheu
                System.out.print("Escolha qualquer número dessa matriz. \nPressione ENTER quando estiver pronto!!");
                sc.nextLine();
            }

            System.out.print("O seu número está nessa matriz? [1-sim / 2-não] ");
            resposta = sc.nextInt();

            if (resposta==1) {
                soma += matrizes[m][0][0];
            }
        }

        System.out.println("\nO número que você pensou era: " + soma);
        sc.close();
    }
}
