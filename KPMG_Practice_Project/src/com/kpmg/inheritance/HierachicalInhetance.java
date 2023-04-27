/**
 * 
 */
package com.kpmg.inheritance;

/**
 * @author Administrator
 *
 */

class Vehicle {
	public void Vehicle() {
		System.out.println("This is class Vehicle");
	}
	
	public void VehicleType() {
		System.out.println("VehicleType: Vehicle");
	}
}

class FourWheeler extends Vehicle {
	public void FourWheeler() {
		System.out.println("This is class FourWheeler");
	}
	
	public void VehicleType() {
		System.out.println("VehicleType: FourWheeler");
	}
}

class TwoWheeler extends Vehicle {
	public void TwoWheeler() {
		System.out.println("This is class TwoWheeler");
	}
	
	public void VehicleType() {
		System.out.println("VehicleType: TwoWheeler");
	}
}

class HierachicalInhetance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		FourWheeler fw = new FourWheeler();
		fw.VehicleType();
		
		TwoWheeler tw = new TwoWheeler();
		tw.VehicleType();
		
	}

}
