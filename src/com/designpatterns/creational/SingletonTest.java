package com.designpatterns.creational;



public class SingletonTest {
	
	public static void main(String[] args) {
		
		// cannot create instance as constructor is private
//		Singleton singleObj = new Singleton();
		
		Singleton singleObj = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(singleObj.equals(obj2))
			System.out.println("Both Objects are equal.");
	}
}