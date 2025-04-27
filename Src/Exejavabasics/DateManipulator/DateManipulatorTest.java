package Exejavabasics.DateManipulator;
import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class DateManipulatorTest {

    @Test
    public void testManipulateDate() {
        OffsetDateTime original = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime result = DateManipulator.manipulateDate(original);

        assertEquals(2024, result.getYear());
        assertEquals(2, result.getMonthValue()); // febbraio
        assertEquals(8, result.getDayOfMonth());
    }

    @Test
    public void testFormatDateLocalized() {
        OffsetDateTime date = OffsetDateTime.parse("2024-02-08T13:00:00Z");
        String formatted = DateManipulator.formatDateLocalized(date);
        assertEquals("08 febbraio 2024", formatted);
    }
}

