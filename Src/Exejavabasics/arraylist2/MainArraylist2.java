package Exejavabasics.arraylist2;

import java.util.ArrayList;
import java.util.Collections;

public class MainArraylist2 {
    public static void main(String[] args) {
        int n = 5; // Numero di elementi da inserire
        ArrayList<String> list = new ArrayList<>();

        list.add("Studente1");
        list.add("Studente2");
        list.add("Studente11");
        list.add("Studente6");
        list.add("Studente7");
        list.add("Studente8");
        list.add("Studente5");
        list.add("Studente10");
        list.add("Studente9");
        list.add("Studente3");
        list.add("Studente12");
        list.add("Studente4");

        // Stampa gli elementi
        System.out.println("Elementi prima:");
        for (String item : list) {
            System.out.println(item);
        }

        Collections.sort(list);

        System.out.println("Elementi ordinati:");
        for (String item : list) {
            System.out.println(item);
        }
    }
}
