package Exejavabasics.DateInfoExtractor;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class DateInfoExtractorTest {

    OffsetDateTime dateTime = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    public void testGetYear() {
        assertEquals(2023, DateInfoExtractor.getYear(dateTime));
    }

    @Test
    public void testGetMonth() {
        assertEquals(3, DateInfoExtractor.getMonth(dateTime));
    }

    @Test
    public void testGetDay() {
        assertEquals(1, DateInfoExtractor.getDay(dateTime));
    }

    @Test
    public void testGetDayOfWeek() {
        assertEquals("mercoledì", DateInfoExtractor.getDayOfWeek(dateTime));
    }
}

