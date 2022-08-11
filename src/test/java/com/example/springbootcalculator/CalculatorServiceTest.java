package com.example.springbootcalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    CalculatorService calculatorService;
    @BeforeEach
    void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    void add() {
        assertEquals(3, calculatorService.add(1, 2));
    }

    @Test
    void subtract() {
        assertEquals(1, calculatorService.subtract(2, 1));
    }

    @Test
    void multiply() {
        assertEquals(8, calculatorService.multiply(4, 2));
    }

    @Test
    void divide() {
        assertEquals(4, calculatorService.divide(8, 2));
    }
}