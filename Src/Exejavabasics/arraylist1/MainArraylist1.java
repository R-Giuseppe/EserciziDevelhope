package Exejavabasics.arraylist1;
import java.util.ArrayList;
//Creare un ArrayList con n elementi e stamparlo in console.
public class MainArraylist1 {

        public static void main(String[] args) {
            int n = 5; // Numero di elementi da inserire
            ArrayList<String> list = new ArrayList<>();

            list.add("Studente1");
            list.add("Studente2");
            list.add("Studente3");
            list.add("Studente4");

            // Stampa gli elementi
            System.out.println("Elementi nell'ArrayList:");
            for (String item : list) {
                System.out.println(item);
            }
        }
}
