import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now(); // retorna data do sistema
        System.out.println(d1); // saída no formato: AAAA-MM-DD (ISO8601)

        LocalDate d2 = d1.plusDays(15); // pega a data atual e conta 15 dias para frente
        System.out.println(d2);

        LocalDate d3 = d1.plusMonths(3); // pega a data atual e conta 3 meses para frente
        System.out.println(d3);

        LocalDate d4 = d1.minusDays(3); // pega a data atual e conta 3 meses para trás
        System.out.println(d4);

        Instant d5 = Instant.now(); // cria um "carimbo" de tempo com data e horário
        System.out.println(d5);

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("d/M/Y"); // formata o formato de apresentação da data
        System.out.println(dtf1.format(d1));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/YYYY"); // formata o formato de apresentação da data
        System.out.println(dtf2.format(d1));

        LocalDateTime d6 = LocalDateTime.now(); // outro jeito de criar um "carimbo" de tempo com data e horário
        System.out.println(d6);
    }
}
