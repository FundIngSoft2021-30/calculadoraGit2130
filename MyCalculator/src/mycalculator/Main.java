/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculator;

/**
 *
 * @author anmontero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CalculatorNEBO calculatorNEBO = new CalculatorNEBO();
        // Create calculator implementation
        System.out.println("Git Calculator!");
        System.out.println("Probando clase CalculadoraNEBO -- "+calculatorNEBO.about()+'\n'+"5+2="+String.valueOf(calculatorNEBO.add(5, 2))+'\n'+"5-2="+String.valueOf(calculatorNEBO.substract(5, 2))+'\n'+"5*2="+String.valueOf(calculatorNEBO.multiply(5, 2))+'\n'+"10/2="+String.valueOf(calculatorNEBO.divide(10, 2))); 
    }

}
