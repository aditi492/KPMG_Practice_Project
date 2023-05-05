/**
 * 
 */
package com.kpmg.collections;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @author Administrator
 *
 */
public class SetDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// simple array 
		
				int count[]= {34,54,10,22,45,22};
				
				// set manuplutation here 
				
				Set set =new HashSet();
				// exception handling here to handle amny exception in code
				try {
					
				   for(int i=0;i<=5; i++) {
					   
					   set.add(count[i]);
					   
				   }
					System.out.println("collection print here -->" +set);
					
					// Set can be implement by the hasset / treeSet  the role of hasset is 
					// take the value randomly in collection but in Tree it will take value in sorted order 
					
					TreeSet<Integer> sortedSet=new TreeSet<Integer>(set);
					System.out.println("the Sorted Colletion here -->" +sortedSet);
					
					System.out.println("other methods of tree set here -->");
					System.out.println("The first elememnt of collection here -->" +sortedSet.first());
					System.out.println("The Last Element of Colllection here --." +sortedSet.last());
					
					
				}catch(Exception ex) {
					
					System.out.println("exception here --->" +ex.getMessage());;
				}
			

	}

}
