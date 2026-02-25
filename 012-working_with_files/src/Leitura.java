import java.io.File;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) throws Exception {
        // trazendo o arquivo para o programa
        File arquivo = new File("src/arquivos/clientes.csv");
        Scanner sc = new Scanner(arquivo);

        // imprimindo as linhas
        while (sc.hasNext()) {
            String[]linha = sc.nextLine().strip().split(",");
            System.out.println(linha[0] + " | " + linha[1]);

            // transformando a data (string) em data
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            LocalDate data = LocalDate.parse(linha[1], dtf);
            System.out.println(data);

            // for
            DateTimeFormatter dataf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            System.out.println(data.format(dataf));
        }
    }
}
