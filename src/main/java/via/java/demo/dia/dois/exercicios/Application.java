package via.java.demo.dia.dois.exercicios;

public class Application {

    public static void main(String[] args) {

        Relatorio relatorio = new Relatorio();

        relatorio.gerarRelatorio(
                testeSaqueDepositoContaCorrente());

        ContaPoupanca contaPoupanca = testeSaqueDepositoContaPoupanca();
        relatorio.gerarRelatorio(contaPoupanca);

        ContaCorrente contaCorrente = testeSaqueDepositoContaCorrente();

        contaCorrente.transferir(10, contaPoupanca);
        relatorio.gerarRelatorio(contaPoupanca);
        relatorio.gerarRelatorio(contaCorrente);

    }

    private static ContaPoupanca testeSaqueDepositoContaPoupanca() {
        ContaPoupanca contaPoupanca = new ContaPoupanca();

        contaPoupanca.setSaldo(100);
        System.out.println("Saldo 100: " + contaPoupanca.getSaldo());


        contaPoupanca.sacar(199);
        System.out.println("Saldo -99: " + contaPoupanca.getSaldo());


        contaPoupanca.depositar(199);
        System.out.println("Saldo 100: " + contaPoupanca.getSaldo());


        contaPoupanca.depositar(-1);
        System.out.println("Saldo 100: " + contaPoupanca.getSaldo());


        contaPoupanca.sacar(-10);
        System.out.println("Saldo 100: " + contaPoupanca.getSaldo());

        return contaPoupanca;
    }

    private static ContaCorrente testeSaqueDepositoContaCorrente() {

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.setSaldo(100);
        System.out.println("Saldo 100: " + contaCorrente.getSaldo());

        contaCorrente.depositar(11);
        System.out.println("Saldo 101: " + contaCorrente.getSaldo());

        contaCorrente.sacar(20);
        System.out.println("Saldo 71: " + contaCorrente.getSaldo());

        contaCorrente.sacar(2000);
        System.out.println("Saldo 71: " + contaCorrente.getSaldo());

        contaCorrente.depositar(-15);
        System.out.println("Saldo 71: " + contaCorrente.getSaldo());

        return contaCorrente;

    }
}
