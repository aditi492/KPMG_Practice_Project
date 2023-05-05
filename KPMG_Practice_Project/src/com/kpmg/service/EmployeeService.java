/**
 * 
 */
package com.kpmg.service;

import java.util.Iterator;

import com.kpmg.Exception.EmployeeIdNotFoundException;
import com.kpmg.Exception.EmployeeNotUpdatedException;
import com.kpmg.bean.Employee;

/**
 * @author Administrator
 *
 */
public class EmployeeService {
	
	// All the service must be delcare here 
	
		// creation of custom array in this employee code !
		
		Employee myEmployees[]=new Employee[] {new Employee(), new Employee(), new Employee(), new Employee()};
		
		
		// done
			
		public void createEmployee() {
			
			
			System.out.println("employee is created -->");
			
			// Record first 
			
			myEmployees[0].setEmpId(101);    // end used by io oject or scanner class
			myEmployees[0].setEmpName("nupur");
			myEmployees[0].setEmpAddress("blore");
			
			myEmployees[1].setEmpId(102);
			myEmployees[1].setEmpName("adarsh");
			myEmployees[1].setEmpAddress("blore");

			myEmployees[2].setEmpId(103);
			myEmployees[2].setEmpName("komal");
			myEmployees[2].setEmpAddress("Delhi");
			
			myEmployees[3].setEmpId(104);
			myEmployees[3].setEmpName("Sonam");
			myEmployees[3].setEmpAddress("Agra");
			
			
			System.out.println("_________________________________________________________________");
		
		
		}

		
		
		public void deleteEmployee(int empID) {    
			
			
			System.out.println("employee deleted here by id-->" +empID);
			
			System.out.println("_________________________________________________________________");
			
		}
		
		
		public void updateEmployee(int empID) throws EmployeeNotUpdatedException {
				
		
			System.out.println("Employee list after updating -->");
			for(Employee emp: myEmployees) {
				
				System.out.println("Employees Details with list-->" +emp.getEmpId() + "--" +emp.getEmpName() +"--" +emp.getEmpAddress() );
			}
			
			System.out.println("_________________________________________________________________");
		}
		
		
		
		public void listEmployee() {
			
			
			System.out.println("list of emlployee here e-->");
			
			// morden Java loop for iterate the collection & Array object
			
			for(Employee emp: myEmployees) {
				
				System.out.println("Employees Details with list-->" +emp.getEmpId() + "--" +emp.getEmpName() +"--" +emp.getEmpAddress() );
			}
		}
}
