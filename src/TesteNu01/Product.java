package TesteNu01;
import java.util.ArrayList;

public class Product {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        products.add("Mouse");
        products.add("Keyboard");
        products.add("Monitor");
        products.add("PC");
        products.add("Headset");
        products.add("USB");
        int count = 0;
        System.out.println("The products with names with more than 5 characters is: ");
        for (int i = 0; i < products.size(); i++){
            if (products.get(i).length() > 5){
                count++;
                System.out.println(products.get(i) + " ");
            }
        }
        System.out.println("count: " + count);
    }

}
