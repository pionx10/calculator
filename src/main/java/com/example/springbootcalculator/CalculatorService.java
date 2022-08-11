package com.example.springbootcalculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double add(Args args) {
        int a = args.getA();
        int b = args.getB();
        return (double)a+b;
    }

    public double subtract(Args args) {
        int a = args.getA();
        int b = args.getB();
        return (double)a-b;
    }

    public double multiply(Args args) {
        int a = args.getA();
        int b = args.getB();
        return (double)a*b;
    }

    public double divide(Args args) {
        int a = args.getA();
        int b = args.getB();
        return (double)a/b;
    }
}
