package ArrayList.TesteNu02;

import java.util.HashMap;

public class EstudoHashMap04 {
    public static void main(String[] args) {
        HashMap<String, Float> produtos = new HashMap<>();
        produtos.put("Arroz", 25.50f);
        produtos.put("Feijão", 8.90f);
        produtos.put("Macarrão", 5.50f);
        produtos.put("Café", 18.00f);
        float maiorPreco = 0f;
        String produtoMaisCaro = "";


        for(String produto : produtos.keySet()){
            System.out.println(produto + " - " +  produtos.get(produto));
            if (produtos.get(produto) > maiorPreco){
                maiorPreco = produtos.get(produto);
                produtoMaisCaro = produto;
            }
        }
        System.out.println("O produto com maior preço é " + produtoMaisCaro + ", custando: R$" + maiorPreco);
        System.out.println(" ");
        System.out.println("Café está cadastrado? " + produtos.containsKey("Café"));
        System.out.println("Existem algum produto custando R$ 8,90? " + produtos.containsValue(8.90f));
        System.out.println("Qual o preço do arroz? R$" + produtos.get("Arroz"));
        produtos.remove("Macarrão");

        for(String produto : produtos.keySet()){
            System.out.println(produto + " - " + produtos.get(produto));
        }
    }
}
