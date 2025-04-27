package Exejavabasics.DateFormatter1;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatter1 {

    public static OffsetDateTime parseDate(String dateString) {
        return OffsetDateTime.parse(dateString);
    }

    public static String formatDate(OffsetDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("it", "IT"));
        return dateTime.format(formatter);
    }

    public static void main(String[] args) {
        String input = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = parseDate(input);
        String formatted = formatDate(dateTime);
        System.out.println(formatted);  // Output: 01 marzo 2023
    }
}

