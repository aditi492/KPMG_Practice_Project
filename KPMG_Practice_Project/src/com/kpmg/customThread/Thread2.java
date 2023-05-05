/**
 * 
 */
package com.kpmg.customThread;

/**
 * @author Administrator
 *
 */
public class Thread2 extends Thread {
	
Printer pr;
	
	public Thread2(Printer t2) {
		
		this.pr = t2;
	}
	
	public void run() {	
		pr.PrintTable(100);
	}


}
