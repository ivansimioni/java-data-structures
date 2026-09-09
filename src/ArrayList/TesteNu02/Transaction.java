package ArrayList.TesteNu02;
import java.util.ArrayList;

public class Transaction {
    public static boolean addValue(ArrayList<Integer> transactions, Integer value) {
        if (transactions == null){
            return false;
        }
        transactions.add(value);
        return true;
        }

    public static void main(String[] args) {
        ArrayList<Integer> transactions = new ArrayList<>();
        addValue(transactions,100);
        addValue(transactions, 50);
        addValue(transactions,25);
        addValue(transactions,200);
        int total = 0;
        for (int i = 0; i < transactions.size(); i++){
            System.out.println(transactions.get(i));
            total = total + transactions.get(i);
        }
        System.out.println("------------");
        System.out.println(total);

    }
    }