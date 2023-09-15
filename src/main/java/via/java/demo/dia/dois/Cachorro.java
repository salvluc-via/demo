package via.java.demo.dia.dois;

import via.java.demo.dia.dois.base.Animal;
import via.java.demo.dia.dois.base.Pet;

// Todo objeto é um substantivo
public class Cachorro extends Pet { // Toda classe segue o padrão PascalCase

    // Caracteristicas
    private float velocidade;

    public Cachorro(String nome, String cor, String raça, int idade, float velocidade) {
        super(nome, cor, raça, idade, "Cachorro");
        this.velocidade = velocidade;
    }

    public Cachorro(String nome, String cor, String raça, int idade, float velocidade, String apelido) {
        super(nome, cor, raça, idade, apelido);
        this.velocidade = velocidade;
    }

    // Ações / Verbos

    public void late() { // Toda variável e método segue o padrão camelCase (casoCamelo)
        System.out.println("Au au Au au Au au Au au Au au");
    }

    public void corre() {
        if(getIdade() <= 15){
            System.out.println("Corre: " + this.velocidade + " m/s" );
        }
        else
            System.out.println("Corre: 0.5 m/s" );
    }

    @Override
    public void setNome(String nome) {
        if(nome.isBlank()){
            super.setNome("Cachorro");
        } else {
            super.setNome(nome);
        }
    }
}