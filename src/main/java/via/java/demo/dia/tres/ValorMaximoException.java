package via.java.demo.dia.tres;

public class ValorMaximoException extends Exception {

    int diferenca;

    public ValorMaximoException(String message, int i) {
        super(message);
        this.diferenca = i;
    }
}
