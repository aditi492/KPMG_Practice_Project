/**
 * 
 */
package com.kpmg.service;

import com.kpmg.Exception.InsufficientFundsException;

/**
 * @author Administrator
 *
 */
public class BankingService {
	
	private double balance;
	private int number;
	
	public BankingService(int number) {
		this.number=number;
	}
	
	public void deposit(double amount) {
		
		balance += amount;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException {
		
		if(amount<balance) {
			balance -= amount;
		} else {
			double amountNeeded = amount-balance;
			
			throw new InsufficientFundsException(amountNeeded);
		}
		
	}

}
