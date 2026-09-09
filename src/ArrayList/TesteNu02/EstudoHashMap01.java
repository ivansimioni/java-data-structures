package ArrayList.TesteNu02;

import java.util.HashMap;

public class EstudoHashMap01 {
    public static void main(String[] args) {
        HashMap<String, Double> notasAlunos = new HashMap<>();
        notasAlunos.put("Ivan", 10.0);
        notasAlunos.put("Milena", 10.0);
        notasAlunos.put("Victor", 8.5);

        for (String aluno : notasAlunos.keySet()){
            double nota = notasAlunos.get(aluno);
            System.out.println(aluno + " " + nota);
        }

        //System.out.println(notasAlunos.get("Ivan"));

    }
}
