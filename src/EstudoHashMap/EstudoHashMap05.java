package EstudoHashMap;

import java.util.HashMap;

public class EstudoHashMap05 {
    public static void main(String[] args) {
        HashMap<String, Integer> estoque = new HashMap<>();
        estoque.put("Arroz", 10);
        estoque.put("Feijão", 0);
        estoque.put("Macarrão", 15);
        estoque.put("Café", 0);
        estoque.put("Açúcar", 8);
        int contagem = 0;
        int totProdutos = 0;

        for(String produto : estoque.keySet()){
            totProdutos = totProdutos + estoque.get(produto);
            if (estoque.get(produto) == 0){
                System.out.println(produto + " - sem estoque");
                contagem++;
            }
        }
        System.out.println("Total de produtos em estoque: " + totProdutos);
        System.out.println("Quantidade de produtos sem estoque: " + contagem);
    }
}
