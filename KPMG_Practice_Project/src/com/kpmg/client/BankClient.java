/**
 * 
 */
package com.kpmg.client;

import com.kpmg.Exception.InsufficientFundsException;
import com.kpmg.service.BankingService;

/**
 * @author Administrator
 *
 */
public class BankClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create the instance of the service class
		BankingService service = new BankingService(101);
		System.out.println("Depositing $500 --> ");
		service.deposit(500.00);
		
		try {
			
			System.out.println("Withdraw $100  --> ");
			service.withdraw(100.00);
			
			System.out.println("Withdraw $600 --> ");
			service.withdraw(600.00);
		}catch(InsufficientFundsException ex){
		
		System.out.println("Sorry! You have insufficient funds --> " + ex.getAmount());

	}
	
	}

}
