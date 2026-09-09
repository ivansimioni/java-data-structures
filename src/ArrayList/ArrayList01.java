package ArrayList;

import java.util.ArrayList;
public class ArrayList01 {
    public static void main (String[] args){
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> sobrenomes = new ArrayList<>();
        nomes.add("Ivan");
        nomes.add("Milena");
        nomes.add("Victor");
        nomes.add("Anna");
        sobrenomes.add("Simioni");
        sobrenomes.add("Pinheiro");
        sobrenomes.add("Freitas");
        sobrenomes.add("Ragazzi");
        for (int i = 0; i <nomes.size(); i++){
            System.out.println(nomes.get(i) + " " + sobrenomes.get(i));
        }
        System.out.println("------------------------------------------");
        nomes.set(2, "Paulo");
        sobrenomes.set(2, "Fernandes");
        nomes.set(3, "Vanessa");
        sobrenomes.set(3, "Andrade");
        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i) + " " + sobrenomes.get(i));
        }
        System.out.println("-----------------------------------------");
        System.out.println(nomes.get(1) + " " + sobrenomes.get(1) + " índice 1");
        nomes.remove(1);
        sobrenomes.remove(1);
        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i) + " " + sobrenomes.get(i));
        }
        System.out.println(nomes.get(1) + " " + sobrenomes.get(1) + " novo índice 1");
        System.out.println("---------------------------------------------------");
        System.out.println("Ivan está na lista? " + nomes.contains("Ivan"));
        System.out.println("João está na lista? " + nomes.contains("João"));

    }
}
