package EstudoHashMap;

import java.util.HashMap;

public class EstudoHashMap03 {
    public static void main(String[] args) {
        HashMap <String, Integer> nomes = new HashMap<>();
        nomes.put("Ivan", 30);
        nomes.put("Carlos", 22);
        nomes.put("Maria", 30);
        nomes.put("João", 25);
        System.out.println("Existe o nome Ivan na coleção? " + nomes.containsKey("Ivan"));
        System.out.println("Alguém da lista tem 22 anos? " + nomes.containsValue(22));
        //nomes.remove("Ivan");
        //System.out.println("Existe o nome Ivan na coleção? " + nomes.containsKey("Ivan"));
        for (String nome : nomes.keySet()){
            System.out.println(nome + " - " + nomes.get(nome));
        }
        System.out.println(nomes.keySet());


    }
}
