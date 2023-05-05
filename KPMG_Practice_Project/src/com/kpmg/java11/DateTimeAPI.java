/**
 * 
 */
package com.kpmg.java11;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author Administrator
 *
 */
public class DateTimeAPI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		displayCurrentDateBefore8to11();

	}
	
	private static void displayCurrentDateBefore8to11() {
		
		Date currentDate = new Date();
		
		LocalDate localDate = LocalDate.now();
		LocalTime localTime = LocalTime.now();
		LocalDateTime localDateTime = LocalDateTime.now();
		
		System.out.println(localDate);
		System.out.println(localTime);
		System.out.println(localDateTime);
		
		System.out.println(localDate.getYear());
		System.out.println(localDate.getMonth());
		System.out.println(localDate.getDayOfMonth());
	}

}
