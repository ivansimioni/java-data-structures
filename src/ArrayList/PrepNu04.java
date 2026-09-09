package ArrayList;

import java.util.ArrayList;
public class PrepNu04 {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(7);
        num.add(12);
        num.add(5);
        num.add(20);
        num.add(15);
        num.add(3);
        num.add(18);
        int totalSum = 0;
        int count = 0;
        System.out.println("Os números maiores que 10 são: ");
        for (int i = 0; i < num.size(); i++){
            if (num.get(i) > 10){
                System.out.print(num.get(i) + " ");
                totalSum = totalSum + num.get(i);
                count = count + 1;
            }
        }
        System.out.println("totalizando " + count + " números ");
        System.out.println("e a soma deles é " + totalSum);
    }
}
