/**
 * 
 */
package com.kpmg.service;

import com.kpmg.bean.Employee;

/**
 * @author Administrator
 *
 */
public class EmployeeService {
	
	// All the service must be delcare here 
	
		// creation of custom array in this emplloyee code !
		
		Employee myEmployees[]=new Employee[] {new Employee(), new Employee(), new Employee()};
		
		
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
		
		
		}

		
		
		public void deleteEmployee(int empID) {
			
			System.out.println("employee deleted here by id-->" +empID);
			
		}
		
		
		public void updateEmployee() {
			
			
			System.out.println("Employee is updated -->");
		}
		
		public void listEmployee() {
			
			
			System.out.println("list of em[ployee here e-->");
			
			// morden Java loop for iterate the collection & Array object
			
			for(Employee emp: myEmployees) {
				
				System.out.println("Employees Details with list-->" +emp.getEmpId() + "--" +emp.getEmpName() +"--" +emp.getEmpAddress() );
			}
		}
}
