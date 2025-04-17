package Exejavabasics.date4;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MainDate4 {
    public static void main(String[] args) {
        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(dateTime);

        //aggiungi un anno
        OffsetDateTime nextYear = dateTime.plusYears(1);
        System.out.println(nextYear);

        //sottrai un mese
        OffsetDateTime pastMonth = dateTime.minusMonths(1);
        System.out.println(pastMonth);

        //aggiungi 7 giorni
        OffsetDateTime addSevenDays = dateTime.plusDays(7);
        System.out.println(addSevenDays);

        //Stampa il risultato localizzata per l'Italia
        DateTimeFormatter formattedItaly = DateTimeFormatter.ofPattern("d MMMM yyyy HH:mm:ss").withLocale(Locale.ITALY);
        System.out.println(formattedItaly);

        System.out.println(dateTime);
    }
}
