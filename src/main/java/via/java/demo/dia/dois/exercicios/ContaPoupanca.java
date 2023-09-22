package via.java.demo.dia.dois.exercicios;

public class ContaPoupanca extends ContaBancaria implements Imprimivel{

    private double limite = 100;

    @Override
    public boolean sacar(double valor) {
        if(valor > 0){
            if(getSaldo() + limite >= valor ){
                setSaldo( getSaldo() - (valor));
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean depositar(double valor) {
        if(valor > 0){
            setSaldo( getSaldo() + valor);
            return true;
        }
        return false;
    }

    @Override
    public String mostrarDados() {
        return  "ContaPoupanca{" +
                "limite=" + limite +
                ", numeroConta=" + getNumeroConta() +
                ", saldo=" + getSaldo() +
                '}';
    }
}
