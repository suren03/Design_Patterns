package com.designpatterns.creational;

/**
 * Below implementation is a lazy implementation. 
 * 
 * When to Use Singleton Design Pattern
 *
 *	For resources that are expensive to create (like database connection objects)
 *	It’s good practice to keep all loggers as Singletons which increases performance
 *	Classes which provide access to configuration settings for the application
 *	Classes that contain resources that are accessed in shared mode
 *
 * @author surendrakumar
 *
 */
public class Singleton {

	private static Singleton instance = null; 
	
	// private constructor so that instances cannot be created outside.  
	
	private Singleton() {
		
	} 
	
	public static Singleton getInstance() {
		
		if(null == instance) {
			synchronized (Singleton.class) {
				// Implementing double null check as if two threads come into synchronized block, still we need to
				// create only one instance.
				if(null == instance) {
					instance = new Singleton();	
				}
			}
		}
		
		return instance;
	}
	
}
