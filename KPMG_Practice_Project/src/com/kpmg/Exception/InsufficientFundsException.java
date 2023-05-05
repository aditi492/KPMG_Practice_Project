/**
 * 
 */
package com.kpmg.Exception;

/**
 * @author Administrator
 *
 */
public class InsufficientFundsException extends Exception {
	
	private double amount;
	
	public InsufficientFundsException(double amount) {
		this.amount = amount;
		
	}
	
	// custom method
	public double getAmount() {
		return amount;
		
	}

}
