import java.util.Scanner;

public class E3MediaDeVetor {
    public static void main(String[] args) {
        /*
         * Crie um vetor para armazenar 5 números
         * inteiros digitados pelo usuário e, em
         * seguida, determine a média dos valores
         * do vetor.
         */

        // criando variáveis
        int vetor[] = new int[5];
        int i, somaNumsVetor=0;
        double media;

        // criando scanner
        Scanner sc = new Scanner(System.in);

        // lendo os números
        for (i=0; i < vetor.length; i++) {
            System.out.printf("Digite aqui um número inteiro [%d/%d]: ", i+1, vetor.length);
            vetor[i] = sc.nextInt();
            somaNumsVetor += vetor[i];
        }

        // calculando média
        media = somaNumsVetor/vetor.length;

        // imprimindo
        System.out.println("Seu vetor:");
        System.out.print("[ ");
        for (i=0; i < vetor.length; i++) {
            System.out.printf("%d", vetor[i]);
            System.out.print(", ");
        }
        System.out.print(" ]");
        System.out.println("A média dos números do seu vetor é: " + media);
    }
}
