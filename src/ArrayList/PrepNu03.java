package ArrayList;

import java.util.ArrayList;
public class PrepNu03 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(4);
        num.add(15);
        num.add(8);
        num.add(22);
        num.add(10);
        num.add(17);
        num.add(3);
        int totalSum = 0;
        for (int i = 0; i < num.size(); i++){
            if (num.get(i) > 10){
                totalSum = totalSum + num.get(i);
            }
        }
        System.out.println("A soma dos números maiores que 10 é: " + totalSum);

    }
}
