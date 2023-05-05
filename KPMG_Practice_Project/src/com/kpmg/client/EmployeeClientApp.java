/**
 * 
 */
package com.kpmg.client;

import com.kpmg.Exception.EmployeeNotUpdatedException;
import com.kpmg.service.EmployeeService;

/**
 * @author Administrator
 *
 */
public class EmployeeClientApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// create the instance of the Employee class here
		
		EmployeeService service = new EmployeeService();
		service.createEmployee();
		service.deleteEmployee(101);
		
		
		try {
			service.updateEmployee(105);
		} catch (EmployeeNotUpdatedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		service.listEmployee();
	}
}
