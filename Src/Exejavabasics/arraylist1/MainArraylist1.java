package Exejavabasics.arraylist1;
import java.util.ArrayList;
//Creare un ArrayList con n elementi e stamparlo in console.
public class MainArraylist1 {

        public static void main(String[] args) {
            int n = 5; // Numero di elementi da inserire
            ArrayList<String> list = new ArrayList<>();

            // Popola l'ArrayList con degli elementi
            for (int i = 1; i <= n; i++) {
                list.add("Elemento " + i);
            }

            // Stampa gli elementi
            System.out.println("Elementi nell'ArrayList:");
            for (String item : list) {
                System.out.println(item);
            }
        }
}
