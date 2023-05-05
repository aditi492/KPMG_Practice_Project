/**
 * 
 */
package com.kpmg.java11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class StreamDemoWithLambda {
	
static List<Integer> inList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
	// the way with stram API impl code 
	
	private static void beforeJava11(){
		
		List<Integer> evenList=new ArrayList<Integer>();
		
		for(int i :inList) {
			
			if(i%2==0) {
				
				evenList.add(i);
			}
		}
		
		System.out.println("print of even List --> " +evenList);
				
		
	}
	
	
	//  use the Stream & Lambda Expression same code Implementation here 
	
	private static void fromjava11() {
		
		
		System.out.println(
			"Even List using Stream API-->" +inList.stream().filter(i -> i%2 == 0).collect(Collectors.toList()));
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Call both methods here 
		
		beforeJava11();
		fromjava11();
	}
}
