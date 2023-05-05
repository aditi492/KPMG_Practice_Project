/**
 * 
 */
package com.kpmg.java11;

/**
 * @author Administrator
 *
 */
public class ChinaCalculator implements Calculator {

//	@Override
//	public int addition(int a, int b) {
//		// TODO Auto-generated method stub
//		return a+b;
//	}

	@Override
	public int substraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b+2;
	}

	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
		return a*b+2;
	}

	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b+2;
	}

}
