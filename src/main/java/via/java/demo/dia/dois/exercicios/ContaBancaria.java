package via.java.demo.dia.dois.exercicios;

public abstract class ContaBancaria {

    private long numeroConta;
    private double saldo;

    /* Long numeroConta;
        Double saldo;

        Tipos complexos são utilizados quando as variáveis podem assumir valores nulos
     */

    // BigDecimal geralmente é utilizado para valores $$

    public abstract boolean sacar(double valor);
    public abstract boolean depositar(double valor);

    public void transferir(double valor, ContaBancaria destino){
        if(this.sacar(valor))
            destino.depositar(valor);
    };

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
