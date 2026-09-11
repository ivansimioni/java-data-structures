package EstudoHashMap;

import java.util.HashMap;

public class EstudoHashMap06 {
    public static void main(String[] args) {
        HashMap<String, Integer> estoque = new HashMap<>();
        estoque.put("Arroz", 10);
        estoque.put("Feijão", 0);
        estoque.put("Macarrão", 15);
        estoque.put("Café", 0);
        estoque.put("Açúcar", 8);
        int contagem = 0;

        for(String produto : estoque.keySet()){
            if (estoque.get(produto) > 5){
                System.out.println(produto + " - " + estoque.get(produto));
                contagem++;
            }
        }
        System.out.println("Quantidade de produtos com mais de 5 unidades em estoque: " + contagem);
    }
}

