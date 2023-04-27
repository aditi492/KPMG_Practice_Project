/**
 * 
 */
package com.kpmg.inheritance;

/**
 * @author Administrator
 *
 */
class A
{
	int a, b; 
	void display() {
		System.out.println("Inside Class A ---> " + a + " " + b);
	}
}

class B extends A {
	int c;
	void show() {
		System.out.println("Inside class B ---> " + a + " " + b + " " +c);
	}
}

class SingleInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		B obj = new B();
		obj.a = 10;
		obj.b = 20;
		obj.c = 30;
		obj.display();
		obj.show();
			
	}

}
