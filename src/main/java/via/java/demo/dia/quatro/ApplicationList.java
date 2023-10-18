package via.java.demo.dia.quatro;

import java.util.*;

public class ApplicationList {

    public static void main(String[] args){

        ArrayList list = new ArrayList<Integer>();

        list.add("Olá");

        System.out.println(list.get(0));

        list.remove(0);
        list.remove("Olá");


        // Uso ideal para listas que variam muito de tamanho
        LinkedList listLinked = new LinkedList<String>();
        listLinked.add("Adoleta");

        metodoSET();

        metodoHashMap();
    }

    private static void metodoHashMap() {

        System.out.println("Método Hash \n\n");
        Map<String, String> map = new HashMap<>();

        map.put("Dadalti", "Homem, 2 filhas, branco, alto");
        map.put("Lucas", "Homem, 6 gatos, branco, alto, lindo, maravilhoso");

        System.out.println(map.get("Dadalti"));
        System.out.println(map.get("Lucas"));

    }

    private static void metodoSET() {

        // Não aceita duplicidade

        Set<String> a = new HashSet();

        a.add("a");
        a.add("b");
        a.add("a");
        a.add("c");

        for(String val : a){
            System.out.println(val);
        }

        a.contains("a");
    }

}
