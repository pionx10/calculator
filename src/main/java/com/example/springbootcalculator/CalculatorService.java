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

    /**
     * @return all past operations in Calculator
     */
    public Iterable<Calculation> findAll() {
        return calculatorRepository.findAll();
    }

    /**
     * @param str calculator operation
     * @return boolean was save successful
     */
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

    /**
     *
     * @param args object containing two integers
     * @return add a and b
     */
    public double add(Args args) {
        int a = args.getA();
        int b = args.getB();
        Double ans = (double)a+b;
        save(a + " + " + b + " = " + ans);
        return ans;
    }

    /**
     *
     * @param args object containing two integers
     * @return subtract b from a
     */
    public double subtract(Args args) {
        int a = args.getA();
        int b = args.getB();
        Double ans = (double)a-b;
        save(a + " - " + b + " = " + ans);
        return ans;
    }

    /**
     *
     * @param args object containing two integers
     * @return multiply a and b
     */
    public double multiply(Args args) {
        int a = args.getA();
        int b = args.getB();
        Double ans = (double)a*b;
        save(a + " * " + b + " = " + ans);
        return ans;
    }

    /**
     *
     * @param args object containing two integers
     * @return divide a by b
     */
    public double divide(Args args) {
        int a = args.getA();
        int b = args.getB();
        Double ans = (double)a/b;
        save(a + " / " + b + " = " + ans);
        return ans;
    }
}
