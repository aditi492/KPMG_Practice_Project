/**
 * 
 */
package com.kpmg.pattern;

/**
 * @author Administrator
 *
 */
public class ClientCall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LazySingleton lazySingleton = LazySingleton.getInstance();
		System.out.println(lazySingleton.sayHello());
	}

}
