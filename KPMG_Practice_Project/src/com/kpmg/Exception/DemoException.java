/**
 * 
 */
package com.kpmg.Exception;

/**
 * @author Administrator
 *
 */
public class DemoException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 20, b = 0, c;
			c = a/b;
			System.out.println("Output is --> " + c);			
		} catch(ArithmeticException e) {
			System.out.println("Raised by Arithmetic exception" + e.getMessage());
		} finally {
			System.out.println("In Finally Block");
		}

	}

}
