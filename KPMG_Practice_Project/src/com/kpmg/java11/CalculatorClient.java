/**
 * 
 */
package com.kpmg.java11;

/**
 * @author Administrator
 *
 */
public class CalculatorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IndianCalculator ic = new IndianCalculator();
		System.out.println("Indian Addition --> " + ic.addition(10,10));
		System.out.println("Indian Substraction --> " + ic.addition(10,8));
		System.out.println("Indian Multiplication --> " + ic.addition(10,10));
		System.out.println("Indian Division --> " + ic.addition(10,10));
		System.out.println("--------------------------------");
		
		ChinaCalculator cc = new ChinaCalculator();
		System.out.println("Chinese Addition --> " + cc.addition(10,10));
		System.out.println("Chinese Substraction --> " + cc.addition(10,8));
		System.out.println("Chinese Multiplication --> " + cc.addition(10,10));
		System.out.println("Indian Division --> " + cc.addition(10,10));

	}

}
