package via.java.demo.dia.dois.base;
// Todo objeto é um substantivo
public class Animal { // Toda classe segue o padrão PascalCase

    // Caracteristicas

    public String cor; // Toda variável e método segue o padrão camelCase (casoCamelo)
    private String raça;
    private String nome;
    private int idade;
    private String dataNascimento;
    private boolean precisaCuidadoEspecial;

    public Animal(String nome, String cor, String raça, int idade) {
        this.setNome(nome);
        this.cor = cor;
        this.raça = raça;
        this.idade = idade;
    }

    // O contrutor sem argumentos é implicito até que você crie seu proprio construtor
    public Animal(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.isBlank()){
            this.nome = "Blublub";
        } else {
            this.nome = nome;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaça() {
        return raça;
    }

    public void setRaça(String raça) {
        this.raça = raça;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isPrecisaCuidadoEspecial() {
        return precisaCuidadoEspecial;
    }

    public void setPrecisaCuidadoEspecial(boolean precisaCuidadoEspecial) {
        this.precisaCuidadoEspecial = precisaCuidadoEspecial;
    }
}