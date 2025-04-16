package Exejavabasics.date2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class MainDate2 {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(data);
        //Formatta la data ottenuta in FULL, MEDIUM e SHORT
        String dataString = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("DataString : " + dataString);
    }
}

