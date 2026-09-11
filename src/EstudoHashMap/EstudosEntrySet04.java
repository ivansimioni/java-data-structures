package EstudoHashMap;

import java.util.HashMap;
import java.util.Scanner;

public class EstudosEntrySet04 {
    public static void main(String[] args) {
        HashMap<String, Integer> notas = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        notas.put("Ivan",8);
        notas.put("Carlos",5);
        notas.put("Maria",9);
        notas.put("João",6);
        notas.put("Ana",10);

        System.out.print("Digite o nome do aluno(a): ");
        String aluno = sc.nextLine();

            if (notas.containsKey(aluno)){
                System.out.println("O aluno(a) " + aluno + " tirou nota: " + notas.get(aluno));
            } else {
                System.out.println("Aluno(a) " + aluno + " não está cadastrado.");
            }
    }
}
