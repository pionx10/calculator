package com.example.springbootcalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api")
public class CalculatorController{
    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("add")
    public double add(int a, int b) {
        return this.calculatorService.add(a, b);
    }

    @PostMapping("subtract")
    public double subtract(int a, int b) {
        return this.calculatorService.subtract(a, b);
    }

    @PostMapping("multiply")
    public double multiply(int a, int b) {
        return this.calculatorService.multiply(a, b);
    }

    @PostMapping("divide")
    public double divide(int a, int b) {
        return this.calculatorService.divide(a, b);
    }
}
