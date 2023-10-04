package via.java.demo.dia.tres;

public class SegundoNivel {

    SegundoNivel(int valor) throws Exception {
        checaValorMaximo(valor);
        checaSeValorImpar(valor);
    }

    private void checaValorMaximo(int valor) throws ValorMaximoException {
        if(valor > 9){
            throw new ValorMaximoException("Valor esta acima do máximo", valor - 9);
        }
    }

    private void checaSeValorImpar(int valor) throws Exception {
        if(valor % 2 == 0){
            throw new Exception("Este valor é par");
        }
        else {
            System.out.println("Valor é impar: " + valor);
        }

        System.out.println("Metodo terminado com sucesso");
    }
}
