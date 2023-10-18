package via.java.demo.dia.quatro;

public class ApplicationArray {

    public static void main(String[] args){

        int variavelUm = 1;
        System.out.println(variavelUm);

        int listaComValoresNaDeclaracao[] = new int[]{12,34,21,33,22,55};
        int[] listaUm = new int[3];

        listaUm[0] = 2;
        listaUm[2] = 200;

        System.out.println(listaUm[2]);

        for (int val : listaUm){
            System.out.println(val);
        }

        metodoDeReferencia(listaUm);

        for (int val : listaUm){
            System.out.println(val);
        }

        loopsTeste(listaUm);
    }

    private static void loopsTeste(int[] listaUm) {

        System.out.println("Loops");

        for(int i = 0; i < listaUm.length; i++){
            System.out.println(listaUm[i]);
        }

        for(int valor : listaUm){
            System.out.println(valor);
        }

    }

    private static void metodoDeReferencia(int[] listaUm) {
        listaUm[1] = 3;
    }

}
