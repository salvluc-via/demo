package via.java.demo.dia.quatro.exercicios;

import via.java.demo.dia.dois.exercicios.ContaCorrente;

public class TestaArrays {

    public static void main(String[] args){
        ContaCorrente[] contas = new ContaCorrente[10];

        for(int i = 0; i < 10; i++){
            ContaCorrente novaConta = new ContaCorrente();
            novaConta.depositar(i * 100L);

            contas[i] = novaConta;
        }

        for(int i = 0; i < 10; i++){
            System.out.println(contas[i].getSaldo());
        }
    }

}
