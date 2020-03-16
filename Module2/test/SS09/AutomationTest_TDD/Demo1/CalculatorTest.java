package SS09.AutomationTest_TDD.Demo1;

import SS9.Automated_Testing_va_TDD.Demo1.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    @Test
    public void testAdd(){
        int x = 1;
        int y = 1;
        Calculator instance = new Calculator();
        int expResult =2;
        int result = instance.add(x,y);
        assertEquals(expResult, result);
    }

    @Test
    public void testAdd2() {
        int x = Integer.MAX_VALUE;
        int y = 1;
        Calculator instance = new Calculator();
        try {
            int result = instance.add(x, y);
            assertFalse(true);
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    public void testAdd3() {
        int x = Integer.MIN_VALUE;
        int y = -1;
        Calculator instance = new Calculator();
        try {
            int result = instance.add(x, y);
            assertFalse(true);
        } catch (Exception e) {
            assertTrue(true);
        }
    }
}
