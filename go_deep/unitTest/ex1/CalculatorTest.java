package com.example.github.unitTest.ex1;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.add(3, 5);

        // Assert
        assertEquals(8, result); // The expected value is 8
    }
}
