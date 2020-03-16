package SS09.AutomationTest_TDD.absolute_number_calculator;

import SS9.Automated_Testing_va_TDD.absolute_number_calculator.AbsoluteNumberCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void findAbsolute1() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

    @Test
    void findAbsolute2() {
        int number = 1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }

    @Test
    void findAbsolute3() {
        int number = -1;
        int expected = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expected,result);
    }
}