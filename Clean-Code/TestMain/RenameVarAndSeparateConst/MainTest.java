package RenameVarAndSeparateConst;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd(Main calculate) {
        int a = 1;
        int b = 1;
        char o = '+';
        int expected = 2;

        int result = calculate.calculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub(Main calculate) {
        int a = 2;
        int b = 1;
        char o = '-';
        int expected = 1;

        int result = calculate.calculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul(Main calculate) {
        int a = 2;
        int b = 2;
        char o = '*';
        int expected = 4;

        int result = calculate.calculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv(Main calculate) {
        int a = 6;
        int b = 3;
        char o = '/';
        int expected = 2;

        int result = calculate.calculate(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero(Main calculate) {
        int a = 2;
        int b = 0;
        char o = '/';

        assertThrows(RuntimeException.class,
                ()-> {calculate.calculate(a, b, o);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator(Main calculate) {
        int a = 2;
        int b = 0;
        char o = '=';

        assertThrows(RuntimeException.class,
                ()-> {calculate.calculate(a, b, o);});
    }


}