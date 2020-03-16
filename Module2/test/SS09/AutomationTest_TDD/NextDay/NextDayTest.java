package SS09.AutomationTest_TDD.NextDay;

import SS9.Automated_Testing_va_TDD.NextDay.NextDay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayTest {

    @Test
    void nextDay1() {
        int day = 1;
        int month = 1;
        int year = 2020;
        String expected = "2/1/2020";
        String result = NextDay.nextDay(day,month,year);
        assertEquals(expected,result);

    }
    @Test
    void nextDay2() {
        int day = 31;
        int month = 1;
        int year = 2020;
        String expected = "1/2/2020";
        String result = NextDay.nextDay(day,month,year);
        assertEquals(expected,result);

    }
    @Test
    void nextDay3() {
        int day = 31;
        int month = 12;
        int year = 2020;
        String expected = "1/1/2021";
        String result = NextDay.nextDay(day,month,year);
        assertEquals(expected,result);

    }
}