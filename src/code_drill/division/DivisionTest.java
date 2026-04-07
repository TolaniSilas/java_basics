package code_drill.division;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class DivisionTest {
    
    @Test
    @DisplayName("Normal division: 10 / 2 = 5")
    public void testNormalDivision() {
        int result = Division.divide(10, 2);
        assertEquals(5, result, "10 / 2 should equal 5");
    }
    
    @Test
    @DisplayName("Division with remainder: 20 / 3 = 6")
    public void testDivisionWithRemainder() {
        int result = Division.divide(20, 3);
        assertEquals(6, result, "20 / 3 should equal 6 (truncated)");
    }
    
    @Test
    @DisplayName("Exact division: 15 / 5 = 3")
    public void testExactDivision() {
        int result = Division.divide(15, 5);
        assertEquals(3, result, "15 / 5 should equal 3");
    }
    
    @Test
    @DisplayName("Division with remainder: 7 / 2 = 3")
    public void testAnotherDivisionWithRemainder() {
        int result = Division.divide(7, 2);
        assertEquals(3, result, "7 / 2 should equal 3 (truncated)");
    }
    
    @Test
    @DisplayName("Divisor is zero: 10 / 0 = 0")
    public void testDivisorIsZero() {
        int result = Division.divide(10, 0);
        assertEquals(0, result, "Division by zero should return 0");
    }
    
    @Test
    @DisplayName("Divisor less than 1: 100 / -5 = 0")
    public void testDivisorLessThanOne() {
        int result = Division.divide(100, -5);
        assertEquals(0, result, "Divisor less than 1 should return 0");
    }
    
    @Test
    @DisplayName("Negative dividend: -10 / 2 = -5")
    public void testNegativeDividend() {
        int result = Division.divide(-10, 2);
        assertEquals(-5, result, "-10 / 2 should equal -5");
    }
    
    @Test
    @DisplayName("Negative divisor: 10 / -2 = 0")
    public void testNegativeDivisor() {
        int result = Division.divide(10, -2);
        assertEquals(0, result, "Negative divisor (< 1) should return 0");
    }
    
    @Test
    @DisplayName("Both negative: -10 / -2 = 0")
    public void testBothNegative() {
        int result = Division.divide(-10, -2);
        assertEquals(0, result, "Negative divisor (< 1) should return 0");
    }
    
    @Test
    @DisplayName("Dividend smaller than divisor: 3 / 10 = 0")
    public void testDividendSmallerThanDivisor() {
        int result = Division.divide(3, 10);
        assertEquals(0, result, "3 / 10 should equal 0 (truncated)");
    }
    
    @Test
    @DisplayName("Dividend is zero: 0 / 5 = 0")
    public void testDividendIsZero() {
        int result = Division.divide(0, 5);
        assertEquals(0, result, "0 / 5 should equal 0");
    }
    
    @Test
    @DisplayName("Large numbers: 1000 / 7 = 142")
    public void testLargeNumbers() {
        int result = Division.divide(1000, 7);
        assertEquals(142, result, "1000 / 7 should equal 142 (truncated)");
    }
    
    @Test
    @DisplayName("Same numbers: 5 / 5 = 1")
    public void testSameNumbers() {
        int result = Division.divide(5, 5);
        assertEquals(1, result, "5 / 5 should equal 1");
    }
    
    @Test
    @DisplayName("Dividend is 1: 1 / 5 = 0")
    public void testDividendIsOne() {
        int result = Division.divide(1, 5);
        assertEquals(0, result, "1 / 5 should equal 0 (truncated)");
    }
}