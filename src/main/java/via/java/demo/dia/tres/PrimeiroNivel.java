package via.java.demo.dia.tres;

public class PrimeiroNivel {

    PrimeiroNivel() throws Exception {
        int valor = 12;
        try {
            new SegundoNivel(valor);
        } catch (ValorMaximoException e){
            new SegundoNivel(valor - e.diferenca);
        }
        catch (Exception e) {
            System.out.println("Houve um erro no segundo nível: " + e.getMessage());
            e.printStackTrace(); // Display de cada linha executada
            throw new Exception("Erro no segundo nível"); // Exemplo de exception não tratada
        }
    }
}
