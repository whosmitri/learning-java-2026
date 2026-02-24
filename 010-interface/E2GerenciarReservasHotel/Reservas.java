package E2GerenciarReservasHotel;

import java.time.LocalDate;

// classe que armazena
public class Reservas {
    // variáveis internas
    private int numQuarto;
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;

    // métodos construtores
    public Reservas(int numQuarto, LocalDate dataCheckIn, LocalDate dataCheckOut) {
        setNumQuarto(numQuarto);
        setDataCheckIn(dataCheckIn);
        setDataCheckOut(dataCheckOut);
    };

    // métodos SET
    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }
    public void setDataCheckIn(LocalDate dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }
    public void setDataCheckOut(LocalDate dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    // métodos GET
    public int getNumQuarto() {
        return numQuarto;
    }
    public LocalDate getDataCheckIn() {
        return dataCheckIn;
    }
    public LocalDate getDataCheckOut() {
        return dataCheckOut;
    }
}
