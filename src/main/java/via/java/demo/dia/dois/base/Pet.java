package via.java.demo.dia.dois.base;
// Todo objeto é um substantivo
public class Pet extends Animal { // Toda classe segue o padrão PascalCase

    // Caracteristicas

    private String apelido;

    public Pet(String nome, String cor, String raça, int idade, String apelido) {
        super(nome, cor, raça, idade);
        this.apelido = apelido;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
}