package com.kpmg.service;

public class SciCalService extends ExtensionAbstract{
	
	public double sqrtMethod(double y) {
		
		return Math.sqrt(y);
		
	}
	
	public double sinx(double y) {
		
		return Math.asin(y);
	}

	@Override
	public double cosx(double x) {
		// TODO Auto-generated method stub
		return Math.acos(x);
	}

}
