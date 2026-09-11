package EstudoHashMap;

import java.util.HashMap;
import java.util.Map;

public class EstudoEntrySet {
    public static void main(String[] args) {
        HashMap<String, Integer> notas = new HashMap<>();
        notas.put("Ivan", 8);
        notas.put("Carlos",6);
        notas.put("Maria",9);

        for (Map.Entry<String, Integer> entrada : notas.entrySet()){
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }

    }

}
