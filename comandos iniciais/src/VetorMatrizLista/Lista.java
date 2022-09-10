package VetorMatrizLista;

// Aula 4

import java.util.ArrayList;
import java.util.Collections;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Integer> notas = new ArrayList<>();

        notas.add(120);

        notas.clear();

        if (notas.isEmpty()){
            System.out.println("Lista vazia");
        }

        notas.add(10);
        notas.add(5);
        notas.add(3);
        notas.add(12);

        notas.remove(notas.size()-1);

        System.out.println(notas);

        for (int nota : notas){
            System.out.println(nota);
        }

        notas.forEach(nota -> {
            System.out.println(nota);
        });

        System.out.println(Collections.max(notas));
        System.out.println(Collections.min(notas));
        
        Collections.sort(notas);
        System.out.println(notas);
        
        Collections.reverse(notas);
        System.out.println(notas);
        
    }
}
