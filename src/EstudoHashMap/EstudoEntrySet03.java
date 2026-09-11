package EstudoHashMap;

import java.util.HashMap;
import java.util.Map;

public class EstudoEntrySet03 {
    public static void main(String[] args) {
        HashMap<String, Integer> notas = new HashMap<>();
        notas.put("Ivan",8);
        notas.put("Carlos", 5);
        notas.put("Maria",9);
        notas.put("João",6);
        notas.put("Ana",10);
        int aprovados = 0;

        System.out.println("Aprovados: ");
        for (Map.Entry<String, Integer> entrada : notas.entrySet()){
            if (entrada.getValue() >= 7){
                System.out.println(entrada.getKey() + " - " + entrada.getValue());
                aprovados++;
            }
        }
        System.out.println("Total de alunos aprovado: " + aprovados);

    }
}
