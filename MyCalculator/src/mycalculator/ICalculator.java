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
public interface ICalculator {
    
        public double add(double a, double b);
	public double multiply(double a, double b);
	public double divide(double a, double b);
	public double substract(double a, double b);
	public String about();
    
}
