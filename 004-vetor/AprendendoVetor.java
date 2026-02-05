package aprendendo_java_2026;

import java.util.Scanner;

public class AprendendoVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome[] = new String[3];
		int idade[] = new int[3];
		
		nome[0] = "Dmitri";
		nome[1] = "Miguel";
		nome[2] = "Haydeen";
		
		// não imprime a coleção inteira
		System.out.println(nome);
		// imprime um índice da coleção
		System.out.println(nome[1]); // Miguel
		
		// guardar dados no vetor
		for (int indice = 0; indice < 3; indice++) {
			System.out.printf("Digite um nome [%d/3]: ", indice+1);
			nome[indice] = sc.next();
			System.out.printf("Digite a idade [%d/3]: ", indice+1);
			idade[indice] = sc.nextInt();
		}
		
		// imprime a coleção inteira
		for (int indice = 0; indice < 3; indice++) {
			System.out.printf("%nNome: %-30s | Idade: %-3d", nome[indice], idade[indice]);
		}

	}
}
