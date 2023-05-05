/**
 * 
 */
package com.kpmg.customThread;

/**
 * @author Administrator
 *
 */
public class Printer {
	
	void PrintTable(int n) {
		
		synchronized (this) {
		
		for(int i=1; i<=5; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(200);
			} catch(Exception ex) {
				System.out.println(ex.getMessage());
				}
			}
		}
	}

}	
