/**
 * 
 */
package com.kpmg.pattern;

import javax.management.InstanceAlreadyExistsException;

/**
 * @author Administrator
 *
 */
public class LazySingleton {

	/**
	 * @param args
	 */
	private static volatile LazySingleton instance = null;
	
	private LazySingleton() {
		
	}
	
	public static LazySingleton getInstance() {
		
		if (instance == null) {
			
			synchronized (LazySingleton.class) {
				
				instance = new LazySingleton();
				
			}
			
		}
		
		return instance;
		
	}
	
	public String sayHello() {
		
		return "call from singleton";
		
	}

}
