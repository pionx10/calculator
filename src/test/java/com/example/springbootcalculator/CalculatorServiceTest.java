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
        Args args = new Args();
        args.setA(1);
        args.setB(2);
        assertEquals(3, calculatorService.add(args));
    }

    @Test
    void subtract() {
        Args args = new Args();
        args.setA(2);
        args.setB(1);
        assertEquals(1, calculatorService.subtract(args));
    }

    @Test
    void multiply() {
        Args args = new Args();
        args.setA(4);
        args.setB(2);
        assertEquals(8, calculatorService.multiply(args));
    }

    @Test
    void divide() {
        Args args = new Args();
        args.setA(8);
        args.setB(2);
        assertEquals(4, calculatorService.divide(args));
    }
}