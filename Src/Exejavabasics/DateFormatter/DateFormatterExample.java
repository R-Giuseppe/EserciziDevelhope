package Exejavabasics.DateFormatter;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateFormatterExample {
    public static void main(String[] args) {
        // 1. Creazione OffsetDateTime dalla stringa
        String input = "2002-03-01T13:00:00Z";
        OffsetDateTime dateTime = OffsetDateTime.parse(input);

        // 2. Formattatori
        DateTimeFormatter fullFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)
                .withLocale(Locale.ITALY);
        DateTimeFormatter mediumFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                .withLocale(Locale.ITALY);
        DateTimeFormatter shortFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                .withLocale(Locale.ITALY);

        // 3. Stampa
        System.out.println("FULL: " + fullFormatter.format(dateTime));
        System.out.println("MEDIUM: " + mediumFormatter.format(dateTime));
        System.out.println("SHORT: " + shortFormatter.format(dateTime));
    }
}

