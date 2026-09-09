package ArrayList;

import java.util.ArrayList;
public class PrepNu {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(5);
        num.add(12);
        num.add(8);
        num.add(20);
        num.add(3);
        num.add(15);
        for (int i = 0; i < num.size(); i++){
            if (num.get(i) > 10){
                System.out.println(num.get(i));
            }
        }
    }

}
