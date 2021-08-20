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
        //Nicolas Bayona 
        System.out.println("Probando clase CalculadoraNEBO -- " + calculatorNEBO.about() + '\n' + "5+2="
                + String.valueOf(calculatorNEBO.add(5, 2)) + '\n' + "5-2="
                + String.valueOf(calculatorNEBO.substract(5, 2)) + '\n' + "5*2="
                + String.valueOf(calculatorNEBO.multiply(5, 2)) + '\n' + "10/2="
                + String.valueOf(calculatorNEBO.divide(10, 2)));
        
        //Abril Cano Castro
        CalculadoraACC abril = new CalculadoraACC();
        System.out.println(abril.about());
        System.out.println("Suma: "+ abril.add(17, 6));
        System.out.println("Resta: "+ abril.substract(17, 6));
        System.out.println("Multiplicacion: "+ abril.multiply(17, 6));
        System.out.println("Division: "+ abril.divide(17, 6));
        

        // Juan Pablo Sanchez Gaitan -> JPSG
        pruebaJPSG();
        pruebaNDVO();
        testJMRP();
        // Funcion de Alejandro Sacristan Leal
        pruebaASL();
        // Función de David Palacios
        testDEPG();
        // Función de Steban Vanegas
        testSFVC();
        // Metodo Juan Andres Mejia
        pruebasCalculadoraJAMR();
        //Funcion de Fabian Andres Zapata Bonivento
        pruebaFAZB();
        //Funcion Juan Sebastian Herrera Guaitero
        testJSHG();
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

    // Funcion de Nicolas Vargas
    public static void pruebaNDVO() {

        CalculadoraNDVO Prueba5 = new CalculadoraNDVO();
        double a = 24;
        double b = 6;

        System.out.println("\n" + Prueba5.about());
        System.out.println(a + " + " + b + " = " + Prueba5.add(a, b));
        System.out.println(a + " - " + b + " = " + Prueba5.substract(a, b));
        System.out.println(a + " * " + b + " = " + Prueba5.multiply(a, b));
        System.out.println(a + " / " + b + " = " + Prueba5.divide(a, b));
    }

    // Funcion de Javier Ramirez
    public static void testJMRP() {
        CalculatorJMRP calc = new CalculatorJMRP();
        double a = 20;
        double b = 15;

        System.out.println(calc.about());
        System.out.println("SUMA -> " + a + " + " + b + " = " + calc.add(a, b));
        System.out.println("RESTA -> " + a + " - " + b + " = " + calc.substract(a, b));
        System.out.println("MULTIPLICACION -> " + a + " * " + b + " = " + calc.multiply(a, b));
        System.out.println("DIVISION -> " + a + " / " + b + " = " + calc.divide(a, b));
    }

    // Funcion de Alejandro Sacristan Leal
    public static void pruebaASL() {

        CalculadoraASL ASL = new CalculadoraASL();
        double a = 50;
        double b = 25;
        System.out.println(ASL.about());
        System.out.println("Suma: " + a + " + " + b + " = " + ASL.add(a, b));
        System.out.println("Resta: " + a + " - " + b + " = " + ASL.substract(a, b));
        System.out.println("Multiplicacion: " + a + " * " + b + " = " + ASL.multiply(a, b));
        System.out.println("Division: " + a + " / " + b + " = " + ASL.divide(a, b));
    }

    // Funcion de David Palacios
    public static void testDEPG() {
        CalculatorDEPG calc = new CalculatorDEPG();
        double a = 10;
        double b = 10;

        System.out.println(calc.about());
        System.out.println("Suma:  " + a + " + " + b + " = " + calc.add(a, b));
        System.out.println("Resta: " + a + " - " + b + " = " + calc.substract(a, b));
        System.out.println("Multiplicación: " + a + " * " + b + " = " + calc.multiply(a, b));
        System.out.println("DIvisión: " + a + " / " + b + " = " + calc.divide(a, b));
    }

    // Funcion de Steban Felipe Vanegas Camacho
    public static void testSFVC() {

        CalculatorSFVC calculadora = new CalculatorSFVC();
        double a = 10;
        double b = 2;
        System.out.println(calculadora.about());
        System.out.println("Resultado Suma: " + a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println("Resultado Resta: " + a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println("Resultado Multiplicacion: " + a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println("Resultado Division: " + a + " / " + b + " = " + calculadora.divide(a, b));
    }

    // Metodo Juan Andres Mejia
    public static void pruebasCalculadoraJAMR() {
        double a = 25, b = 5;
        CalculadoraJAMR calculadora = new CalculadoraJAMR();
        System.out.println(calculadora.about());
        System.out.println(a + "+" + b + "=" + calculadora.add(a, b));
        System.out.println(a + "-" + b + "=" + calculadora.substract(a, b));
        System.out.println(a + "*" + b + "=" + calculadora.multiply(a, b));
        System.out.println(a + "/" + b + "=" + calculadora.divide(a, b));
    }

    //Funcion Fabian Zapata Bonivento
    public static void pruebaFAZB(){
        CalculatorFAZB calcu= new CalculatorFAZB();
        double a=9;
        double b=3;
        System.out.println("La suma es:" +a+"+"+b+"="+calcu.add(a,b));
        System.out.println("La resta es:"+a+"-"+b+"="+calcu.substract(a, b));
        System.out.println("La multiplicacion es:"+a+"*"+b+"="+calcu.multiply(a, b));
        System.out.println("La division es:"+a+"/"+b+"="+calcu.divide(a, b));
    }
    //Función Juan Sebastián Herrera Guaitero
    public static void testJSHG() {
        CalculatorJMRP calc = new CalculatorJSHG();
        double a = 20;
        double b = 20;

        System.out.println(calc.about());
        System.out.println("suma -> " + a + " + " + b + " = " + calc.add(a, b));
        System.out.println("resta -> " + a + " - " + b + " = " + calc.substract(a, b));
        System.out.println("mult -> " + a + " * " + b + " = " + calc.multiply(a, b));
        System.out.println("div -> " + a + " / " + b + " = " + calc.divide(a, b));
    }
}
