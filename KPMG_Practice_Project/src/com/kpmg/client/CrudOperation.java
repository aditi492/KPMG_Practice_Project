/**
 * 
 */
package com.kpmg.client;

import java.util.*;

/**
 * @author Administrator
 *
 */
public class CrudOperation {
	
	HashMap<Integer, String> hm1=new HashMap<Integer,String>();
	
	private int empID;
    private String empName;
    private String empAddress;
   
    public CrudOperation() {
        System.out.println("-----------------------------------------------");
        System.out.println("        CRUD OPERATION USING ARRAY LIST        ");
        System.out.println("-----------------------------------------------");
    }

    public CrudOperation(int empID, String empName, String empAddress) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<CrudOperation> e = new ArrayList<CrudOperation>();
        CrudOperation co = new CrudOperation();
        int ch, empID;
        String empName, empAddress;
        boolean found = false;

        do {
            System.out.println("");
            System.out.println("--------");
            System.out.println("1.CREATE");
            System.out.println("2.READ");
            System.out.println("3.UPDATE");
            System.out.println("4.DELETE");
            System.out.println("------------------");
            System.out.println("ENTER YOUR CHOICE:");
            System.out.println("------------------");
            ch = sc.nextInt();
            System.out.println("");
            switch (ch) {
                case 1:
                    System.out.println("-------------");
                    System.out.println("ENTER EMP ID:");
                    System.out.println("-------------");
                    empID = sc.nextInt();
                    System.out.println("---------------");
                    System.out.println("ENTER EMP NAME:");
                    System.out.println("---------------");
                    empName = sc.next();
                    System.out.println("-----------------");
                    System.out.println("ENTER EMP ADDRESS:");
                    System.out.println("-----------------");
                    empAddress = sc.next();
                    e.add(new CrudOperation(empID, empName, empAddress));
                    break;
                case 2:
                    System.out.println("");
                    Iterator i = e.iterator();
                    while (i.hasNext()) {
                    	CrudOperation e1 = (CrudOperation) i.next();
                        System.out.println("Employee ID " + "Employee Name " + "Empolyee Address ");
                        System.out.println(e1);
                       
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("-----------------------");
                    System.out.println("Enter EMP ID TO UPDATED");
                    System.out.println("-----------------------");
                    empID = sc.nextInt();
                    System.out.println("------------------------");
                    ListIterator<CrudOperation> li = e.listIterator();
                    while (li.hasNext()) {
                    	CrudOperation e1 = li.next();
                        if (e1.getEmpID() == empID) {
                            System.out.println("");
                            System.out.println("-------------------");
                            System.out.println("Enter Name:");
                            System.out.println("-------------------");
                            empName = sc.next();
                            System.out.println("---------------------");
                            System.out.println("Enter Address :");
                            System.out.println("---------------------");
                            empAddress = sc.next();
                            System.out.println("--------------------");
                           
                            li.set(new CrudOperation(empID, empName, empAddress));
                            found = true;
                        }

                    }
                    if (!found) {
                        System.out.println("-----------------");
                        System.out.println("RECORD NOT FOUND!");
                        System.out.println("-----------------");
                    } else {
                        System.out.println("------------------------------");
                        System.out.println("RECORD IS UPDATED SUCESSFULLY!");
                        System.out.println("------------------------------");
                    }
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("-----------------------");
                    System.out.println("Enter EMP ID TO DELETED");
                    System.out.println("-----------------------");
                    empID = sc.nextInt();
                    Iterator<CrudOperation> i2 = e.iterator();
                    while (i2.hasNext()) {
                    	CrudOperation e1 = i2.next();
                        if (e1.getEmpID() == empID) {
                            i2.remove();
                            found = true;
                        }

                    }
                    if (!found) {
                        System.out.println("-----------------");
                        System.out.println("RECORD NOT FOUND!");
                        System.out.println("-----------------");
                    } else {
                        System.out.println("-------------------------------");
                        System.out.println("RECORD IS DELELTED SUCESSFULLY!");
                        System.out.println("-------------------------------");
                    }
                    break;
                case 5:

                    System.out.println("");
                    System.out.println("----------------------");
                    System.out.println("Enter EMP ID TO SEARCH");
                    System.out.println("----------------------");
                    empID = sc.nextInt();
                    System.out.println("");
                    Iterator<CrudOperation> i3 = e.iterator();
                    while (i3.hasNext()) {
                    	CrudOperation e1 = i3.next();
                        if (e1.getEmpID() == empID) {
                            System.out.println("-----------------------------------------------------------------------------------------------------");
                            System.out.println("Employee No " + "Employee Name " + "Empolyee Salary " );
                            System.out.println(e1);
                            System.out.println("-----------------------------------------------------------------------------------------------------");

                        }
                        found = true;
                    }
                    if (!found) {
                        System.out.println("-----------------");
                        System.out.println("RECORD NOT FOUND!");
                        System.out.println("-----------------");
                    } else {
                        System.out.println("-----------------------------");
                        System.out.println("RECORD IS SEARCH SUCESSFULLY!");
                        System.out.println("-----------------------------");
                    }
                    break;
                default:
                    System.out.println("-----------------------");
                    System.out.println("USER ENTER WRONG INPUT:");
                    System.out.println("-----------------------");
            }

        } while (ch != 0);
    }
    

}
