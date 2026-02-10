package aprendendo_java_2026;

public class E2ContaBancaria {
    /*
    *  Crie uma classe "Conta Bancária" que tenha como atributos
    * o número da conta, o nome do titular, o saldo, a agência e
    * o tipo de conta, e como métodos saque e depósito.
    */

    public static class ContaBancaria {
        private int numeroConta, agencia;
        private String nomeTitular, tipoConta;
        private double saldo = 0;

        public void ContaBancaria(int numeroConta, int agencia, String nomeTitular, String tipoConta) {
            setNumConta(numeroConta);
            setAgencia(agencia);
            setNomeTitular(nomeTitular);
            setTipoConta(tipoConta);
        }

        // métodos SET
        public void setNumConta(int numeroConta) {
            this.numeroConta = numeroConta;
        }
        public void setAgencia(int agencia) {
            this.agencia = agencia;
        }
        public void setNomeTitular(String nomeTitular) {
            this.nomeTitular = nomeTitular;
        }
        public void setTipoConta(String tipoConta) {
            this.tipoConta = tipoConta;
        }
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        // métodos GET
        public int getNumConta() {
            return this.numeroConta;
        }
        public int getAgencia() {
            return this.agencia;
        }
        public String getNomeTitular() {
            return this.nomeTitular;
        }
        public String getTipoConta() {
            return this.tipoConta;
        }
        public double getSaldo() {
            return this.saldo;
        }

        // métodos gerai
        public void depositar(double qtd) {
            this.saldo += qtd;
        }

        public void sacar(double qtd) {
            this.saldo -= qtd;
        }

        public void imprimirDados() {
            System.out.printf("""
                    Nome do Titular: $s
                    Número da Conta: %d
                    Agência: %d
                    Tipo de Conta: %s
                    Saldo: %.2f""", getNomeTitular(), getNumConta(), getAgencia(), getTipoConta(), getSaldo());
        }
    }

    public static void main(String[] args) {
         ContaBancaria c1 = new ContaBancaria();
    }
}
