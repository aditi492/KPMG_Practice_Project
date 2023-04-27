/**
 * 
 */
package com.kpmg.service;

/**
 * @author Administrator
 *
 */
//basic cal service here contains the basic method implementation
public class BasicCalService extends SciCalService {
	
	// methods and behavior of the class
	
	public int addition(int x,int y) {
		
		return x+y;
	}
	
	public int substract(int x,int y) {
		
		return x-y;
	}
	

	public int multiply(int x,int y) {
		
		return x*y;
	}
	

	public int division(int x,int y) {
		
		return x/y;
	}
	
}
