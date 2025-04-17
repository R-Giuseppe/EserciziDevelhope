package date4;

import java.time.OffsetDateTime;
import java.time.ZoneId;

public class MainDate4 {
    public static void main(String[] args) {
        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(dateTime);

        //aggiungi un anno
        int nextYear = (dateTime.getYear() + 1);
        System.out.println(nextYear);

        //sottrai un mese
        int pastMonth = dateTime.getMonthValue() - 1;
        System.out.println(pastMonth);

        //aggiungi 7 giorni
        int addSevenDays = dateTime.getDayOfMonth() + 7;
        System.out.println(addSevenDays);

        //Stampa il risultato localizzata per l'Italia
        System.out.println(dateTime.atZoneSimilarLocal(ZoneId.of("Europe/Rome")));

    }
}
