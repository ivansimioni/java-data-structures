package ArrayList.TesteNu02;

import java.util.HashMap;

public class EstudoHashMap02 {
    public static void main(String[] args) {
        HashMap<String, Integer> idades = new HashMap<>();
        idades.put("Ivan", 30);
        idades.put("Milena", 22);
        idades.put("Victor", 30);
        int idadeIvan = idades.get("Ivan");
        System.out.println("O Ivan tem " + idadeIvan + " anos.");
        if (idades.containsKey("Victor")){
            System.out.println("Victor está cadastrado.");
        } else {
            System.out.println("Victor não está cadastrado.");
        }

    }
}
