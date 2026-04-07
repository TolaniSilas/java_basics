package code_drill.sorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

public class DrillTest {
    
    @Test
    @DisplayName("Test with positive integers")
    public void testPositiveIntegers() {
        Number[] input = {4, 2, 3, 1};
        Number[] result = Drill.squareArraySorting(input);
        Number[] expected = {1.0, 4.0, 9.0, 16.0};
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with negative numbers")
    public void testNegativeNumbers() {
        Number[] input = {-2, -1, -3};
        Number[] result = Drill.squareArraySorting(input);
        Number[] expected = {1.0, 4.0, 9.0};
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with mixed positive and negative")
    public void testMixedNumbers() {
        Number[] input = {-3, 2, -1, 4};
        Number[] result = Drill.squareArraySorting(input);
        Number[] expected = {1.0, 4.0, 9.0, 16.0};
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with single element")
    public void testSingleElement() {
        Number[] input = {5};
        Number[] result = Drill.squareArraySorting(input);
        Number[] expected = {25.0};
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with zeros")
    public void testWithZeros() {
        Number[] input = {0, 3, 0, 2};
        Number[] result = Drill.squareArraySorting(input);
        Number[] expected = {0.0, 0.0, 4.0, 9.0};
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with already sorted array")
    public void testAlreadySorted() {
        Number[] input = {1, 2, 3, 4};
        Number[] result = Drill.squareArraySorting(input);
        Number[] expected = {1.0, 4.0, 9.0, 16.0};
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with reverse sorted array")
    public void testReverseSorted() {
        Number[] input = {4, 3, 2, 1};
        Number[] result = Drill.squareArraySorting(input);
        Number[] expected = {1.0, 4.0, 9.0, 16.0};
        assertArrayEquals(expected, result);
    }
    
    @Test
    @DisplayName("Test with duplicate values")
    public void testDuplicates() {
        Number[] input = {2, 2, 1, 3};
        Number[] result = Drill.squareArraySorting(input);
        Number[] expected = {1.0, 4.0, 4.0, 9.0};
        assertArrayEquals(expected, result);
    }
}