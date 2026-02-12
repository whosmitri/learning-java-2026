package aprendendo_java_2026;

import java.util.Scanner;

public class E1CalcPagamentoColaboradores {
    public static class Colaborador {
        String nome;
        int hora;
        double valorPorHora;

        // construtor
        public Colaborador (String nome, int hora, double valorPorHora) {
            setNome(nome);
            setHora(hora);
            setValorPorHora(valorPorHora);
        }

        // métodos SET
        public void setNome(String nome) {
            this.nome = nome;
        }
        public void setHora(int hora) {
            this.hora = hora;
        }
        public void setValorPorHora(double valorPorHora) {
            this.valorPorHora = valorPorHora;
        }

        // métodos GET
        public String getNome() {
            return this.nome;
        }
        public int getHora() {
            return this.hora;
        }
        public double getValorPorHora() {
            return this.valorPorHora;
        }

        // métodos gerais
        public double pagamento() {
            // totalPagar
            return getHora() * getValorPorHora();
        }

        // métodos da classe
        @Override
        public String toString() {
            return "----- Colaborador:" +
            "\nNome: " + nome +
            "\nHoras trabalhadas: " + hora +
            "\nValor por hora: " + valorPorHora;
        }
    }

    public static class ColaboradorTerceirizado extends Colaborador {
        double custoAdicional;

        public ColaboradorTerceirizado (String nome, int hora, double valorPorHora, double custoAdicional) {
            super(nome, hora, valorPorHora);
            setCustoAdicional(custoAdicional);
        }

        // métodos SET
        public void setCustoAdicional(double custoAdicional) {
            this.custoAdicional = custoAdicional;
        }

        // métodos GET
        public double getCustoAdicional() {
            return this.custoAdicional;
        }

        // métodos gerais
        public double calcBonus() {
            // bonus
            return getCustoAdicional() * 10/100;
        }
        @Override
        public double pagamento() {
            double totalPagar = getHora() * getValorPorHora() + custoAdicional + calcBonus();
            return totalPagar;
        }

        // métodos da classe
        @Override
        public String toString() {
            return "----- Colaborador:" +
                    "\nNome: " + nome +
                    "\nHoras trabalhadas: " + hora +
                    "\nValor por hora: " + valorPorHora +
                    "\nCusto adicional: " + custoAdicional;
        }
    }

    public static void main(String[] args) {
        // variáveis
        int qtdColaboradores, i, tipoColab;

        // criando scanner
        Scanner sc = new Scanner(System.in);

        // pedindo e guardando quantidade de colaboradores
        System.out.print("Informa a quantidade de colaboradores: ");
        qtdColaboradores = sc.nextInt();

        // lista de objetos
        Colaborador colaboradores[] = new Colaborador[qtdColaboradores];

        for (i=0; i<qtdColaboradores; i++) {
            System.out.printf("%nDados do colaborador %d %n: ", i+1);
            System.out.print("\nColaborador terceirizado? [1-Sim / 2-Não]: ");
            tipoColab = sc.nextInt();

            System.out.print("\nNome: ");
            String nome = sc.next();
            System.out.print("\nHoras trabalhadas: ");
            int horas = sc.nextInt();
            System.out.print("\nValor por hora: ");
            double valor = sc.nextDouble();

            if (tipoColab == 1) {
                System.out.print("\nCusto adicional: ");
                double custo = sc.nextDouble();
                colaboradores[i] = new ColaboradorTerceirizado(nome, horas, valor, custo);
            } else {
                colaboradores[i] = new Colaborador(nome, horas, valor);
            }
        }

        for (int index = 0; index < 3; index++) {
            System.out.println(colaboradores[index]);
        }

    }
}
