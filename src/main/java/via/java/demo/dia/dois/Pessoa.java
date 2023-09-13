package via.java.demo.dia.dois;

public class Pessoa {

    public static void main(String[] args) {

        new Cachorro(); // Isso aqui é instanciar uma classe (Gerar em memória)

        Cachorro bob = new Cachorro("Bob", "Branco", "Puddle", 2, 1.1F);
        Cachorro maximus = new Cachorro("Maximus", "Preto e Marrom", "Pastor Alemão", 1, 3F);
        Cachorro princesa = new Cachorro("Princesa", "Branco", "Rotwailer", 1, 2.5F);
        Cachorro tibumbu = new Cachorro("Tibumbu", "Caramelo", "São Bernardo", 0, 1F);

        bob.late();

        bob.corre();
        maximus.corre();
        princesa.corre();
        tibumbu.corre();

        bob.cor = "Branco";

        chamarCachorroPeloNome(bob);
        chamarCachorroPeloNome(maximus);
        chamarCachorroPeloNome(princesa);
        chamarCachorroPeloNome(tibumbu);

    }

    protected static void chamarCachorroPeloNome(Cachorro cachorro) {
        System.out.println("Vem " + cachorro.getNome());
    }
}
