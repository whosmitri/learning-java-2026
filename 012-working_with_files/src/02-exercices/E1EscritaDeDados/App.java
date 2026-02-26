package exercicios.E1EscritaDeDados;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    /*
    * Captura de Dados:
    * * Solicite ao usuário que forneça informações como nome, idade e email.
    * * Armazene essas informações em variáveis.
    *
    * Escrita em Arquivo:
    * * Utilize classes do pacote java.io para escrever as informações em um arquivo de texto.
    * * Crie um arquivo chamado dados.txt e escreva as informações capturadas nele.
    *
    * Exibição de Confirmação:
    * * Após escrever no arquivo, exiba uma mensagem confirmando que os dados foram salvos com sucesso.
    */

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Captura de dados
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        System.out.print("Email: ");
        String email = scanner.nextLine();

        // Escrita no arquivo
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("src/02-exercices/E1EscritaDeDados/dados.txt", true));

        bw.write(nome + "," + idade + "," + email);
        bw.newLine();
        bw.close();

        System.out.println("Dados salvos com sucesso!");

        scanner.close();
    }
}
