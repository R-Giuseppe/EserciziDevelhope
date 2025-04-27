package Exejavabasics.DateManipulator;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateManipulator {

    public static OffsetDateTime parseDate(String input) {
        return OffsetDateTime.parse(input);
    }

    public static OffsetDateTime manipulateDate(OffsetDateTime dateTime) {
        return dateTime.plusYears(1).minusMonths(1).plusDays(7);
    }

    public static String formatDateLocalized(OffsetDateTime dateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", new Locale("it", "IT"));
        return dateTime.format(formatter);
    }

    public static void main(String[] args) {
        String input = "2023-03-01T13:00:00Z";
        OffsetDateTime parsedDate = parseDate(input);
        OffsetDateTime manipulatedDate = manipulateDate(parsedDate);
        String formatted = formatDateLocalized(manipulatedDate);

        System.out.println("Data risultante: " + formatted); // Output previsto: "08 febbraio 2024"
    }
}
