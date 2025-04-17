package Exejavabasics.date5;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MainDate5 {
    public static void main(String[] args) {
        //Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
        OffsetDateTime dateTime1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        //Crea un secondo oggetto data da questa stringa 2024-03-01T13:00:00Z
        OffsetDateTime dateTime2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");

        //formatto per rendere le date più leggibili
        String dateTime1String = dateTime1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("dateTime1String: " + dateTime1String);

        String dateTime2String = dateTime1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("dateTime2String: " + dateTime2String);

        //Verificare che la prima data è precedente alla seconda
        if (dateTime1.isBefore(dateTime2)){
            System.out.println("la data1: " + dateTime1 + "è precedente alla data2: " + dateTime2);
        }
        //Verificare che la seconda data è successiva alla prima
        if (dateTime2.isAfter(dateTime1)){
            System.out.println("la data2: " + dateTime2 + "è successiva alla data1" + dateTime1);
        }
        //Verificare che le due date sono uguali a ora
        if (dateTime1.isEqual(dateTime2)){
            System.out.println("la data1: " + dateTime1 + "è uguale alla data2: " + dateTime2);
        }
        else System.out.println("le due date non sono uguali");
        // Stampa il risultato
    }
}
