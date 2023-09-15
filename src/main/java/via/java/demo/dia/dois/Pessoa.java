package via.java.demo.dia.dois;

import via.java.demo.dia.dois.base.Animal;
import via.java.demo.dia.dois.base.Pet;

public class Pessoa {

    public static void main(String[] args) {

//        new Cachorro(); // Isso aqui é instanciar uma classe (Gerar em memória)

        Cachorro bob = new Cachorro("Bob", "Branco", "Puddle", 2, 1.1F);
        Cachorro maximus = new Cachorro("Maximus", "Preto e Marrom", "Pastor Alemão", 1, 3F, "Medroso");
        Cachorro princesa = new Cachorro("Princesa", "Branco", "Rotwailer", 1, 2.5F, "Pesadelo");
        Cachorro tibumbu = new Cachorro("Tibumbu", "Caramelo", "São Bernardo", 0, 1F, "Doidinho");
        Cachorro anonimo = new Cachorro("", "Caramelo", "São Bernardo", 0, 1F);

        bob.late();

        //chamarCachorroPeloNome(null);

        bob.corre();
        maximus.corre();
        princesa.corre();
        tibumbu.corre();
        anonimo.corre();

        bob.cor = "Branco";

        chamarAnimalPeloNome(bob);
        chamarAnimalPeloNome(maximus);
        chamarAnimalPeloNome(princesa);
        chamarAnimalPeloNome(tibumbu);
        chamarAnimalPeloNome(anonimo);

        Peixe nemo = new Peixe("Nemo", "Laranja", "Peixe-Palhaço", 1, 0.3F);
        Peixe anonimoNaAgua = new Peixe("", "Laranja", "Peixe-Palhaço", 1, 0.3F);

        chamarAnimalPeloNome(nemo);

        chamarAnimalPeloNome(nemo);
        chamarAnimalPeloNome(princesa);
        chamarAnimalPeloNome(anonimoNaAgua);
//        chamarAnimalPeloNome(gatos);
//        chamarAnimalPeloNome(lagartixa);


        chamarPetPeloApelido(princesa);
        chamarPetPeloApelido(bob);
        chamarPetPeloApelido(maximus);
    }


    protected static void chamarAnimalPeloNome(Animal animal) {
        System.out.println("Vem " + animal.getNome());
    }


    protected static void chamarPetPeloApelido(Pet pet) {
        System.out.println("Vem " + pet.getApelido());
    }


}
