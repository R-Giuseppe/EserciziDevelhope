package Exejavabasics.DateInfoExtractor;
import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateInfoExtractor {

    public static OffsetDateTime parseDate(String dateString) {
        return OffsetDateTime.parse(dateString);
    }

    public static int getYear(OffsetDateTime dateTime) {
        return dateTime.getYear();
    }

    public static int getMonth(OffsetDateTime dateTime) {
        return dateTime.getMonthValue();
    }

    public static int getDay(OffsetDateTime dateTime) {
        return dateTime.getDayOfMonth();
    }

    public static String getDayOfWeek(OffsetDateTime dateTime) {
        return dateTime.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("it", "IT"));
    }

    public static void main(String[] args) {
        String input = "2023-03-01T13:00:00Z";
        OffsetDateTime dateTime = parseDate(input);

        System.out.println("Anno: " + getYear(dateTime));
        System.out.println("Mese: " + getMonth(dateTime));
        System.out.println("Giorno: " + getDay(dateTime));
        System.out.println("Giorno della settimana: " + getDayOfWeek(dateTime));
    }
}

