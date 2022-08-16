package com.example.springbootcalculator;


import com.example.springbootcalculator.entity.Args;
import com.example.springbootcalculator.entity.Calculation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class CalculatorServiceTest {
    @Mock
    CalculatorRepository calculatorRepository;
    CalculatorService calculatorService;

    @BeforeEach
    void initService() {
        calculatorService = new CalculatorService(calculatorRepository);
    }

    @Test
    void addPositive() {
        Args args = new Args();
        args.setA(1);
        args.setB(2);
        when(calculatorRepository.save(any(Calculation.class))).then(returnsFirstArg());
        assertEquals(3, calculatorService.add(args));
    }

    @Test
    void addNegative() {
        Args args = new Args();
        args.setA(-1);
        args.setB(-1);
        when(calculatorRepository.save(any(Calculation.class))).then(returnsFirstArg());
        assertEquals(-2, calculatorService.add(args));
    }

    @Test
    void subtractPositive() {
        Args args = new Args();
        args.setA(2);
        args.setB(1);
        when(calculatorRepository.save(any(Calculation.class))).then(returnsFirstArg());
        assertEquals(1, calculatorService.subtract(args));
    }

    @Test
    void subtractNegative() {
        Args args = new Args();
        args.setA(-1);
        args.setB(-1);
        when(calculatorRepository.save(any(Calculation.class))).then(returnsFirstArg());
        assertEquals(0, calculatorService.subtract(args));
    }

    @Test
    void multiplyPositive() {
        Args args = new Args();
        args.setA(4);
        args.setB(2);
        when(calculatorRepository.save(any(Calculation.class))).then(returnsFirstArg());
        assertEquals(8, calculatorService.multiply(args));
    }

    @Test
    void multiplyNegative() {
        Args args = new Args();
        args.setA(-1);
        args.setB(-1);
        when(calculatorRepository.save(any(Calculation.class))).then(returnsFirstArg());
        assertEquals(1, calculatorService.multiply(args));
    }

    @Test
    void dividePositive() {
        Args args = new Args();
        args.setA(8);
        args.setB(2);
        when(calculatorRepository.save(any(Calculation.class))).then(returnsFirstArg());
        assertEquals(4, calculatorService.divide(args));
    }
    @Test
    void divideByZero() {
        Args args = new Args();
        args.setA(10);
        args.setB(0);
        when(calculatorRepository.save(any(Calculation.class))).then(returnsFirstArg());
        assertEquals(Double.POSITIVE_INFINITY, calculatorService.divide(args));
    }
}
