/**
 * 
 */
package com.kpmg.client;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Administrator
 *
 */
public class CrudOperationWithHashSet {
	
	private int empID;
    private String empName;
    private String empAddress;
   
    public CrudOperationWithHashSet() {
        System.out.println("-----------------------------------------------");
        System.out.println("        CRUD OPERATION USING ARRAY LIST        ");
        System.out.println("-----------------------------------------------");
    }

    public CrudOperationWithHashSet(int empID, String empName, String empAddress) {
        this.empID = empID;
        this.empName = empName;
        this.empAddress = empAddress;
    }

    public int getEmpID() {
        return empID;
    }

    public String toString() {
        return " " + empID + " " + empName + " " + empAddress;
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set set = new HashSet();
		
		

	}

}
