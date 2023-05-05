/**
 * 
 */
package com.kpmg.java11;

import java.util.Arrays;
import java.util.List;

import com.mysql.jdbc.RowDataStatic;

/**
 * @author Administrator
 *
 */
public class DemoForEachLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		withoutForEach();
		withForEach();
		
		}
	
	private static void withoutForEach() {
		
		System.out.println("Without Foe Each Loop --> ");
		List<Integer> inList = Arrays.asList(1,2,3,4,5,6, 7,8,9,9,9);
		for(int i: inList) {
			System.out.println("Output --> "+ i);
		}
	}
		
		// Java 8/11 
		
	private static void withForEach() {
		System.out.println("Without Foe Each Loop --> ");
		List<Integer> inList = Arrays.asList(1,2,3,4,5,6, 7,8,9,9,9);
		inList.forEach(System.out::println);
	}
	

}
	
