package Exejavabasics.hashmap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class MainHashmap2 {
    public static void main(String[] args) {

        //creo la mappa
        HashMap<Integer, String> alunniMap = new HashMap<>();
        //aggiungo gli elementi
        alunniMap.put(1, "Piero");
        alunniMap.put(4, "Pietro");
        alunniMap.put(3, "Pasquale");
        alunniMap.put(2, "Marco");
        alunniMap.put(6, "Manuel");
        alunniMap.put(5, "Carmelo");

        System.out.println(alunniMap);

        //creo un ArrayList dove metto dentro i valori(Piero, Pietro, ecc)
        List<String> sortedValue = new ArrayList<>(alunniMap.values());

        //uso una libreria che ordina in modo alfabetico i valori dati
        Collections.sort(sortedValue);

        //eseguo un ciclo for sull'ArrayList che ho appena ordinato (sortedValue)
        for (String elementoCorrente : sortedValue){
            System.out.println(elementoCorrente);
        }
    }
}
