package NextDayCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {


    @Test
    void NextDay01() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";

        String result = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected,result);
    }

    @Test
    void NextDay02() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";

        String result = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected,result);
    }

    @Test
    void NextDay03() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1/5/2018";

        String result = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected,result);
    }

    @Test
    void NextDay04() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";

        String result = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected,result);
    }

    @Test
    void NextDay05() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1/3/2020";

        String result = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected,result);
    }

    @Test
    void NextDay06() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1/1/201";

        String result = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected,result);
    }
}