package Exejavabasics.DateFormatter;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterExampleTest {

    private final OffsetDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z");

    @Test
    public void testFullFormat() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL)
                .withLocale(Locale.ITALY);
        String result = formatter.format(dateTime);
        assertTrue(result.contains("1 marzo 2002"));
    }

    @Test
    public void testMediumFormat() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                .withLocale(Locale.ITALY);
        String result = formatter.format(dateTime);
        assertTrue(result.contains("1 mar 2002"));
    }

    @Test
    public void testShortFormat() {
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)
                .withLocale(Locale.ITALY);
        String result = formatter.format(dateTime);
        assertTrue(result.matches("\\d{2}/\\d{2}/\\d{2}, \\d{2}:\\d{2}"));
    }
}
