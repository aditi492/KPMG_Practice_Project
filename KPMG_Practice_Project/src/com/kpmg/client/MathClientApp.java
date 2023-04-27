package com.kpmg.client;

import com.kpmg.service.BasicCalService;
import com.kpmg.service.SciCalService;

public class MathClientApp {
	
	public static void main(String args[]) {
		
		//Access all the methods of the class after creating the instance of the class
		
		BasicCalService basicService = new BasicCalService();
		
		System.out.println("Addition of the numbers:" + basicService.addition(10, 10));
		System.out.println("Substraction of the numbers:" + basicService.addition(20, 10));
		System.out.println("Multiplication of the numbers:" + basicService.addition(10, 10));
		System.out.println("Division of the numbers:" + basicService.addition(10, 10));
	
		// Instance of the SciCal here
	
		SciCalService sciService = new SciCalService();
	
		System.out.println("SQRT of the math number:" + basicService.sqrtMethod(4));
		System.out.println("Sin of the math number:" + basicService.sinx(6));
		
		// ExtensionAnstract extabs = new ExtensionAbstract();
		
		SciCalService cal = new SciCalService();
		System.out.println("Call the extension Methods ----> " + cal.cosx(10));
		System.out.println("Call the other method of the extension class ---> " + cal.tanx(10));
	}
		

}
