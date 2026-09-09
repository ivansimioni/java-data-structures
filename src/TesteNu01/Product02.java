package TesteNu01;
import java.util.ArrayList;

public class Product02 {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Monitor");
        products.add("PC");
        products.add("Headset");
        products.add("USB");
        products.add("");
        products.add(null);
        int count = 0;
        int totalChar = 0;
        float average;
        String longest = "";
        String search = "Headset";
        boolean found = false;
        int searchIndex = -1;
        boolean removed = false;

        for (int i = 0; i < products.size(); i++) {
            if (products.get(i) != null && products.get(i).length() > 5) {
                count++;
                totalChar = totalChar + products.get(i).length();
            }
            if (products.get(i) != null && products.get(i).length() > 5 && products.get(i).equals(search)){
                found = true;
                searchIndex = i;
            }
            if (products.get(i) != null && products.get(i).length() > 5 && products.get(i).length() > longest.length()){
                longest = products.get(i);
            }
        }
        if (searchIndex != -1){
            products.remove(searchIndex);
            removed = true;
        }
        if (count > 0){
            average = (float) totalChar/count;
        } else {
            average = 0;
            longest = "None";
        }


        System.out.println("Count: " + count);
        System.out.println("Total Characters: " + totalChar);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Longest: " + longest);
        System.out.println(search + " is in the list? " + found);
        System.out.println("Index: " + searchIndex);
        System.out.println(products);

    }
}

