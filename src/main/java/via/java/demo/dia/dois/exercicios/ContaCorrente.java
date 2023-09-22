package via.java.demo.dia.dois.exercicios;

public class ContaCorrente extends ContaBancaria implements Imprimivel {

    private double taxaDeOperacao = 10;

    @Override
    public boolean sacar(double valor) {
        if(valor > 0){
            if(getSaldo() >= (valor + taxaDeOperacao) ){
                setSaldo( getSaldo() - (valor + taxaDeOperacao));
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean depositar(double valor) {
        if(valor > 0 && valor > taxaDeOperacao){
            setSaldo( getSaldo() + (valor - taxaDeOperacao));
            return true;
        }
        return false;
    }

    @Override
    public String mostrarDados() {
        return "ContaCorrente{" +
                "taxaDeOperacao=" + taxaDeOperacao +
                ", numeroConta=" + getNumeroConta() +
                ", saldo=" + getSaldo() +
                '}';
    }

}
