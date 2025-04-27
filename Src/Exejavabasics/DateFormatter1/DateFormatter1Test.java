package Exejavabasics.DateFormatter1;

import Exejavabasics.DateFormatter1.DateFormatter1;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class DateFormatter1Test {

    @Test
    public void testParseDate() {
        String input = "2023-03-01T13:00:00Z";
        OffsetDateTime result = DateFormatter1.parseDate(input);
        assertEquals(2023, result.getYear());
        assertEquals(3, result.getMonthValue());
        assertEquals(1, result.getDayOfMonth());
        assertEquals(13, result.getHour());
    }

    @Test
    public void testFormatDate() {
        OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String formatted = DateFormatter1.formatDate(dateTime);
        assertEquals("01 marzo 2023", formatted);
    }
}

