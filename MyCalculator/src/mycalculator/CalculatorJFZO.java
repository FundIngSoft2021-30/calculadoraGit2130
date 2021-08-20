/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculator;

/**
 *
 * @author Jose Fernando Zuluaga
 */
public class CalculatorJFZO implements ICalculator {
     @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        return a / b;
    }

    @Override
    public double substract(double a, double b) {
        return a - b;
    }

    @Override
    public String about() {
        return "Calculator implemented by " + Authors.JFZO;
    }
}
