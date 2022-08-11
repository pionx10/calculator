package com.example.springbootcalculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api")
public class CalculatorController{
    @Autowired
    private CalculatorService calculatorService;

    @PostMapping("add")
    public double add(@RequestBody Args args) {
        return this.calculatorService.add(args);
    }

    @PostMapping("subtract")
    public double subtract(@RequestBody Args args) {
        return this.calculatorService.subtract(args);
    }

    @PostMapping("multiply")
    public double multiply(@RequestBody Args args) {
        return this.calculatorService.multiply(args);
    }

    @PostMapping("divide")
    public double divide(@RequestBody Args args) {
        return this.calculatorService.divide(args);
    }
}
