/**
 * 
 */
package com.kpmg.customThread;

/**
 * @author Administrator
 *
 */
public class Thread1 extends Thread {
	
	Printer pr;
	
	public Thread1(Printer t1) {
		
		this.pr = t1;
	}
	
	public void run() {	
		pr.PrintTable(5);
	}

}
