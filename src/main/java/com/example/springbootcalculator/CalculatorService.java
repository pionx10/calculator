package com.example.springbootcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double add(int a, int b) {
        return (double)a+b;
    }

    public double subtract(int a, int b) {
        return (double)a-b;
    }

    public double multiply(int a, int b) {
        return (double)a*b;
    }

    public double divide(int a, int b) {
        return (double)a/b;
    }
}
