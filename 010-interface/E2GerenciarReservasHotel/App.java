package E2GerenciarReservasHotel;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // variáveis
        String inputDataCheckIn, inputDataCheckOut;
        // dataCheckIn, dataCheckOut
        int numQuarto;

        // criando uma lista para armazenar
        ArrayList<Reservas> reservas = new ArrayList<>();

        // criando scanner
        Scanner sc = new Scanner(System.in);

        // solicitando dados
        System.out.print("Número do quarto: ");
        numQuarto = sc.nextInt();
        System.out.print("Data de entrada (DD/MM/AAAA): ");
        inputDataCheckIn = sc.next();
        System.out.print("Número de saída (DD/MM/AAAA): ");
        inputDataCheckOut = sc.next();

        // transformando string em datas
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataCheckIn = LocalDate.parse(inputDataCheckIn, dtf);
        // System.out.println(dataCheckIn.format(dtf));
        LocalDate dataCheckOut = LocalDate.parse(inputDataCheckOut, dtf);
        // System.out.println(dataCheckOut.format(dtf));

        // calculando período de tempo
        Period periodo = Period.between(dataCheckIn, dataCheckOut);

        // guardando no array de datas
        reservas.add(new Reservas(numQuarto, dataCheckIn, dataCheckOut));
        reservas.get(0);

        // 1. Nova Reserva | 2. Listar Reservas | 3. Sair
    }
}
