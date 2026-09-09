package ArrayList;

import java.util.ArrayList;
public class PrepNu05 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(10);
        num.add(25);
        num.add(7);
        num.add(30);
        num.add(14);
        num.add(5);
        num.add(22);
        int largNum = num.get(0);
        for (int i = 0; i < num.size(); i++){
            if (num.get(i) > largNum){
                largNum = num.get(i);
            }
        }
        System.out.println("O maior dos números é: " + largNum);
    }
}
