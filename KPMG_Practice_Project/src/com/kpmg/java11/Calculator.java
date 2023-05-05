/**
 * 
 */
package com.kpmg.java11;

/**
 * @author Administrator
 *
 */
public interface Calculator {
	
	// define all services here for Calc implementation
	
	default public int addition(int a, int b) {
		return a+b;
	}
	public int substraction(int a, int b);
	public int multiplication(int a, int b);
	public int division(int a, int b);
	

}
