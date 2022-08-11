package com.example.springbootcalculator;

import com.example.springbootcalculator.entity.Args;
import com.example.springbootcalculator.entity.Calculation;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CalculatorService {
    @Autowired
    private CalculatorRepository calculatorRepository;

    public Iterable<Calculation> findAll() {
        return calculatorRepository.findAll();
    }

    public boolean save(String str) {
        try {
            Calculation cal = new Calculation();
            cal.setOperation(str);
            this.calculatorRepository.save(cal);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public double add(Args args) {
        int a = args.getA();
        int b = args.getB();
        Double ans = (double)a+b;
        save(a + " + " + b + " = " + ans);
        return ans;
    }

    public double subtract(Args args) {
        int a = args.getA();
        int b = args.getB();
        Double ans = (double)a-b;
        save(a + " - " + b + " = " + ans);
        return ans;
    }

    public double multiply(Args args) {
        int a = args.getA();
        int b = args.getB();
        Double ans = (double)a*b;
        save(a + " * " + b + " = " + ans);
        return ans;
    }

    public double divide(Args args) {
        int a = args.getA();
        int b = args.getB();
        Double ans = (double)a/b;
        save(a + " / " + b + " = " + ans);
        return ans;
    }
}
