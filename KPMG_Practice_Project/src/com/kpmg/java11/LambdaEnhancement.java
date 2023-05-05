/**
 * 
 */
package com.kpmg.java11;

import javax.validation.constraints.*;

/**
 * @author Administrator
 *
 */
 
 interface AddInterface{
		
		// method for Addtion in Lambda syntax 
		
		public int addTwoNumbers(int a, int b);
	}

 
public class LambdaEnhancement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		beforeJava11();
		
		System.out.println("---------------------------------------------------");
		FromJava11();

	}
	
	// before java 11 syntax @ lambda implementation !
	
	private static void beforeJava11() {
			
		AddInterface addInterface=(a,b) -> (a+b);
		int sum=addInterface.addTwoNumbers(100, 100);
		System.out.println("before java 11---> addtion of 2 numbers -->" +sum );
			
	}
		
		
		
	  private static void FromJava11() {
			
		AddInterface addInterface=(@Min(value=10) var a,@Max(value=1) var b) -> (a+b);
		int sum=addInterface.addTwoNumbers(100, 100);
		System.out.println("from java 11---> addtion of 2 numbers -->" +sum );
			
	}

}
