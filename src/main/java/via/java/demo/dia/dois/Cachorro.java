package via.java.demo.dia.dois;
// Todo objeto é um substantivo
public class Cachorro { // Toda classe segue o padrão PascalCase

    // Caracteristicas

    public String cor; // Toda variável e método segue o padrão camelCase (casoCamelo)
    private String raça;
    private String nome;
    private int idade;
    private String dataAniversario;
    private float velocidade;
    private boolean precisaCuidadoEspecial;

    public Cachorro(String nome, String cor, String raça, int idade, float velocidade) {
        this.setNome(nome);
        this.cor = cor;
        this.raça = raça;
        this.idade = idade;
        this.velocidade = velocidade;
    }

    // O contrutor sem argumentos é implicito até que você crie seu proprio construtor
    public Cachorro(){}

    // Ações / Verbos

    public void late() { // Toda variável e método segue o padrão camelCase (casoCamelo)
        System.out.println("Au au Au au Au au Au au Au au");
    }

    public void corre() {
        if(idade <= 15){
            System.out.println("Corre: " + this.velocidade + " m/s" );
        }
        else
            System.out.println("Corre: 0.5 m/s" );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome.isBlank()){
            this.nome = "Cachorro";
        } else {
            this.nome = nome;
        }
    }
}