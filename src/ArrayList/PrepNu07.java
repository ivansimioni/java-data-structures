package ArrayList;

import java.util.ArrayList;
public class PrepNu07 {
    public static void main(String[] args) {
        ArrayList<String> nome = new ArrayList<>();
        nome.add("Ivan");
        nome.add("Milena");
        nome.add("Victor");
        nome.add("Anna");
        nome.add("Paulo");
        for (int i = 0; i < nome.size(); i++){
            if (nome.get(i).length() > 5){
                System.out.println(nome.get(i));
            }
        }
    }
}
