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
        System.out.println("Probando clase CalculadoraNEBO -- " + calculatorNEBO.about() + '\n' + "5+2="
                + String.valueOf(calculatorNEBO.add(5, 2)) + '\n' + "5-2="
                + String.valueOf(calculatorNEBO.substract(5, 2)) + '\n' + "5*2="
                + String.valueOf(calculatorNEBO.multiply(5, 2)) + '\n' + "10/2="
                + String.valueOf(calculatorNEBO.divide(10, 2)));

        // Juan Pablo Sanchez Gaitan -> JPSG
        pruebaJPSG();
        pruebaNDVO();
    }

    // funcion de juan pablo sanchez gaitan
    public static void pruebaJPSG() {

        CalculatorJPSG jps = new CalculatorJPSG();
        double a = 80;
        double b = 69;
        System.out.println(jps.about());
        System.out.println("Suma: " + a + " + " + b + " = " + jps.add(a, b));
        System.out.println("Resta: " + a + " - " + b + " = " + jps.substract(a, b));
        System.out.println("Multiplicacion: " + a + " * " + b + " = " + jps.multiply(a, b));
        System.out.println("Division: " + a + " / " + b + " = " + jps.divide(a, b));
    }

    //Funcion de Nicolas Vargas
    public static void pruebaNDVO() {

        CalculadoraNDVO Prueba5 = new CalculadoraNDVO();
        double a=24;
        double b=6;

        System.out.println("\n"+Prueba5.about());
        System.out.println(a + " + " + b + " = " + Prueba5.add(a, b));
        System.out.println(a + " - " + b + " = " + Prueba5.substract(a, b));
        System.out.println(a + " * " + b + " = " + Prueba5.multiply(a, b));
        System.out.println(a + " / " + b + " = " + Prueba5.divide(a, b));
    }

}
