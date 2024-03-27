import org.example.DateUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DateUnitTest {
    @Test
    public void testIsLeapYear() {
        DateUtils dateUtils = new DateUtils();
        boolean result = dateUtils.isLeapYear(2020);
        assertTrue(result);
    }

    @Test
    public void testIsLeapYear2() {
        DateUtils dateUtils = new DateUtils();
        boolean result = dateUtils.isLeapYear(2019);
        assertTrue(result);
    }

    @Test
    public void testGetDaysInMonth() {
        DateUtils dateUtils = new DateUtils();
        int result = dateUtils.getDaysInMonth(2020, 2);
        assertTrue(result == 29);
    }

    @Test
    public void testGetDaysInMonth2() {
        DateUtils dateUtils = new DateUtils();
        int result = dateUtils.getDaysInMonth(2020, 3);
        assertTrue(result == 29);
    }
}
