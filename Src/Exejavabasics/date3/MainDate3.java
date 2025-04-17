package Exejavabasics.date3;

import java.time.OffsetDateTime;

public class MainDate3 {
    public static void main(String[] args) {
        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(dateTime);

        //ottieni l'anno
        System.out.println("anno: " + dateTime.getYear());

        //ottieni il mese
        System.out.println("mese: " + dateTime.getMonth());

        //ottieni il giorno
        System.out.println("giorno: " + dateTime.getDayOfMonth());

        //ottieni il giorno della settimana
        System.out.println("giorno della settimana: " + dateTime.getDayOfWeek());

        //Stampa i risultati sulla console
    }





}
