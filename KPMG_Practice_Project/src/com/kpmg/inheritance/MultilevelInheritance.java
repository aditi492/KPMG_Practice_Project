/**
 * 
 */
package com.kpmg.inheritance;

/**
 * @author Administrator
 *
 */

class Animal {
	public Animal() {
		System.out.println("This is class Animal");
	}
	public void soundType() {
		System.out.println("Sound Type: Animal");
		}
}

class Dog extends Animal {
	public Dog() {
		System.out.println("Inside class Dog");
	}
	public void dogSound() {
		System.out.println("Dog Sound: Bark");
		}
}

class Cat extends Dog {
	public Cat() {
		System.out.println("Inside class Cat");
	}
	public void catSound() {
		System.out.println("Cat Sound: Meow");
		}
}

public class MultilevelInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.soundType();
		cat.dogSound();
		cat.catSound();
	}

}
