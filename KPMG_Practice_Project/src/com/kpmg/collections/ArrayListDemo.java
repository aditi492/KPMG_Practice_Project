/**
 * 
 */
package com.kpmg.collections;

import java.util.List;
import java.util.ArrayList;
/**
 * @author Administrator
 *
 */
public class ArrayListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		
		System.out.println("Complete Size of the application --> " + list.size());
		
		list.add("Kolkata");
		list.add("Mumbai");
		list.add("BAnGalOre");
		list.add("Nagpur");
		list.add(101);
		
		System.out.println("Complete Size of the application --> " + list.size());

	}

}
