package bai3;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Testting")
    void testCalculateAdd() {
        int a = 1;
        int b = 1;
        char o = '+';
        int expected = 2;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected, result);
    }

}