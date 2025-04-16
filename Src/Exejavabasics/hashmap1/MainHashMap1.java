package Exejavabasics.hashmap1;
import java.util.HashMap;
import java.util.Map;


public class MainHashMap1 {
    public static void main(String[] args) {
        //Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.
        // 1° Hashmap con metodo classico
        HashMap<Integer, String> studentiMap = new HashMap<>();

        studentiMap.put(1, "Piero");
        studentiMap.put(2, "Pietro");
        studentiMap.put(3, "Pasquale");

        // per stampare bisogna sempre ciclare
        for (Map.Entry<Integer, String> coppia: studentiMap.entrySet()){
            Integer key = coppia.getKey();
            String value = coppia.getValue();

            System.out.println("ID: " + key + "\n" + "Nome: " + value);
        }


        // 2° Hashmap con metodo DOPPIE PARENTESI
        HashMap<Integer, String> docentiMap = new HashMap<>() {{
            put(5, "Marco");
            put(6, "Manuel");
            put(7, "Carmelo");
        }};

        for (Map.Entry<Integer, String> coppia: docentiMap.entrySet()){
            Integer key = coppia.getKey();
            String value = coppia.getValue();

            System.out.println("\n" + "ID: " + key + "\nNome: " + value);
        }

    }
}
