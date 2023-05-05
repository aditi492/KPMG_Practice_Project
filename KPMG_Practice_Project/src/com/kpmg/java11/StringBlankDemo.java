/**
 * 
 */
package com.kpmg.java11;

/**
 * @author Administrator
 *
 */
public class StringBlankDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		beforeJava11();
		fromJava11();

	}
	
	// before java 11 Sting manuplutation 
	
		private static void beforeJava11() {
			
			String str="";
			//String str=" ";
			
			if(str.length()==0) {
				
				System.out.println("String is blank-->");
			}
			if(str.equals("")) {
				System.out.println("String is blank--");
			}
			if(str.isEmpty()) {
				
				System.out.println("String is empty-->");
			}
				
		}
		
		
		private static void fromJava11() {
			
			System.out.println("from java 11 changes");
			
			String str="";
			
			if(str.isBlank()) {
				
				System.out.println("String is blank");
			}else {
				
				System.out.println("not blank");
			}
		}

}
