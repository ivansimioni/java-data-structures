package EstudoHashMap;

import java.util.HashMap;
import java.util.Map;

public class EstudoEntrySet02 {
    public static void main(String[] args) {
        HashMap<String, Float> produtos = new HashMap<>();
        produtos.put("Arroz",25.50f);
        produtos.put("Feijão",8.90f);
        produtos.put("Macarrão",5.50f);
        produtos.put("Café",18.00f);

        for (Map.Entry<String, Float> entrada : produtos.entrySet()){
            if (entrada.getValue() > 10.00f){
                System.out.println(entrada.getKey() + " - " + entrada.getValue());
            }
        }

    }
}
