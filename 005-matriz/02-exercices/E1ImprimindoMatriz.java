import java.util.Scanner;

public class E1ImprimindoMatriz {
    public static void main(String[] args) {
        // criando constantes
        final int LINHA = 3;
        final int COLUNA = 3;

        // criando a matriz 3x3
        int matriz[][] = new int[LINHA][COLUNA];

        // criando scanner
        Scanner sc = new Scanner(System.in);

        // lendo e guardando dados nas posições da matriz
        for (int i=0 ; i<LINHA ; i++) {
            for (int j=0 ; j<COLUNA ; j++){
                System.out.printf("Digite a posição [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        // imprimindo a matriz
        for (int i=0 ; i<LINHA ; i++) {
            for (int j=0 ; j<COLUNA ; j++){
                System.out.printf("[%3d]", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
