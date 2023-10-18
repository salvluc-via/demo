package via.java.demo.dia.dois;

import via.java.demo.dia.dois.base.Animal;
import via.java.demo.dia.dois.base.AnimalComCauda;

// Todo objeto é um substantivo
public class Peixe extends Animal implements AnimalComCauda { // Toda classe segue o padrão PascalCase

    // Caracteristicas
    private float velocidade;

    public Peixe(String nome, String cor, String raça, int idade, float velocidade) {
        super(nome, cor, raça, idade);
        this.velocidade = velocidade;
    }

    // O contrutor sem argumentos é implicito até que você crie seu proprio construtor
    public Peixe(){}

    public void nada() {
        if(getIdade() <= 5){
            System.out.println("Nada: " + this.velocidade + " m/s" );
        }
        else
            System.out.println("Nada: 0.5 m/s" );
    }

    @Override
    public void moverCauda() {
        System.out.println("Nada");
    }
}