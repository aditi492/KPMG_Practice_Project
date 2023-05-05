/**
 * 
 */
package com.kpmg.customThread;

/**
 * @author Administrator
 *
 */
public class AccessPrinterClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Printer p = new Printer();
		Thread1 thread1 = new Thread1(p);
		Thread2 thread2 = new Thread2(p);
		
		thread1.start();
		thread2.start();
	}

}
