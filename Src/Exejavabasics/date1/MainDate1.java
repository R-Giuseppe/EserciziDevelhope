package Exejavabasics.date1;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MainDate1 {
    //Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(data);
        //Formatta la data ottenuta in FULL, MEDIUM e SHORT
        String dataString = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        String dataString1 = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        String dataString2 = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));

        //Stampa le varie versioni
        System.out.println("DataString : " + dataString);
        System.out.println("DataString1 : " + dataString1);
        System.out.println("DataString2 : " + dataString2);
    }
}
