package ArrayList;

import java.util.ArrayList;
public class PrepNu06 {
    public static void main(String[] args) {
      ArrayList<Integer> num = new ArrayList<>();
      num.add(18);
      num.add(7);
      num.add(25);
      num.add(3);
      num.add(14);
      num.add(9);
      int smallest = num.get(0);
      for (int i = 0; i < num.size(); i++){
          if (num.get(i) < smallest){
              smallest = num.get(i);
          }
      }
        System.out.println("O menor número da lista é: " + smallest);
    }
}
