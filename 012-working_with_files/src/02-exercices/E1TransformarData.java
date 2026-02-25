package exercicios;

import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class E1TransformarData {
    public static void main(String[] args) throws Exception {
        // trazendo o arquivo para o programa
        File arquivo = new File("src/arquivos/clientes.csv");
        Scanner sc = new Scanner(arquivo);

        // imprimindo as linhas
        while (sc.hasNext()) {
            String[]linha = sc.nextLine().strip().split(",");
            // String data = linha[1];

            // transformando a data (string) em data de acordo com a
            DateTimeFormatter formatISO = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate data = LocalDate.parse(linha[1], formatISO);
            System.out.println(data);

            // formatando no estilo ABNT
            DateTimeFormatter formatABTN = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            data = data.withYear(2026);

            System.out.println(linha[0] + " | " + data.format(formatABTN));
        }
    }
}
