package ArrayList.TesteNu02;

import java.util.ArrayList;

public class RevisaoForEach {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(5);
        numeros.add(8);
        numeros.add(20);
        numeros.add(3);
        int soma = 0;
        int quantidadeMaiores = 0;
        for (Integer numero : numeros){
            System.out.println(numero);
            soma = soma + numero;
            if (numero > 7){
                quantidadeMaiores++;
            }
        }
        System.out.println("a soma de todos os números é " + soma);
        System.out.println("são " + quantidadeMaiores + " números maiores que 7");
    }
}
