package day5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertThrows;



// package test.day5;

// import day5.LCMCalculator;
// import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.*;

public class LCMCalculatorTest {

    @Test
    void testTwoNumbers() {
        assertEquals(12, LCMCalculator.calculateLCM(new int[]{4, 6}));
    }

    @Test
    void testThreeNumbers() {
        assertEquals(24, LCMCalculator.calculateLCM(new int[]{4, 6, 8}));
    }

    @Test
    void testPrimeNumbers() {
        assertEquals(15, LCMCalculator.calculateLCM(new int[]{3, 5}));
    }

    @Test
    void testSameNumbers() {
        assertEquals(6, LCMCalculator.calculateLCM(new int[]{6, 6}));
    }

    @Test
    void testForNumberZero() {
        assertEquals(0, LCMCalculator.calculateLCM(new int[]{0, 0}));
    }

    @Test
    void negativeNumbers() {
        assertEquals(0, LCMCalculator.calculateLCM(new int[]{-6, 66}));
    }
}