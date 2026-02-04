import java.util.Scanner;

public class E2LocalizarNaMatriz {
    public static void main(String[] args) {
        // criando constantes
        final int LINHA = 3;
        final int COLUNA = 3;

        // criando variáveis
        int numLocalizar;
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

        // pegando o número a ser localizado
        System.out.println("Digite o número a ser localizado: ");
        numLocalizar = sc.nextInt();

        // localizando na matriz
        for (int i=0 ; i<LINHA ; i++) {
            for (int j=0 ; j<COLUNA ; j++){
                if (matriz[i][j] == numLocalizar) {
                    System.out.printf("[%3d]", matriz[i][j]);
                    System.out.printf("%nEstá na posição: (%d, %d)", i, j);
                }
            }
        }

    }
}
