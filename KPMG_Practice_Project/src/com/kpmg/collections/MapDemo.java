/**
 * 
 */
package com.kpmg.collections;

import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map.Entry;

/**
 * @author Administrator
 *
 */
public class MapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare the map collection here 
		
				HashMap<Integer, String> hm1=new HashMap<Integer,String>();
				
				
				TreeMap<Integer, String> hm2=new TreeMap<Integer,String>();
				
				hm1.put(101, "Delhi");
				hm1.put(102, "Mumbai");
				hm1.put(103, "Bangalore");
				hm1.put(104, "Chennai");
				hm1.put(101, "New York");
				
				
				hm2.put(101, "Tamato");
				hm2.put(102, "Potato");
				hm2.put(103, "Lady Finger");
				hm2.put(104, "Cucumber");
				hm2.put(101, "Brinjal");
				
				
				
				// iterate with for loop of this map collection 
				
				for(Entry m:hm1.entrySet()) {
					
					System.out.println("Value of collection here --> " +m.getKey() + " " +m.getValue());
					
							}
				
				
				for(Entry m:hm2.entrySet()) {
					
					System.out.println("Value of collection here --> " +m.getKey() + " " +m.getValue());
					
							}

	}

}
