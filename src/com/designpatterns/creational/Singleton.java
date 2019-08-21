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

	private static volatile Singleton instance = null; 
	
	// private constructor so that instances cannot be created outside.  
	
	private Singleton() {
		
	} 
	
	public static Singleton getInstance() {
		
		// We are not keeping synchronized here, as if intsnace is already created we dont want threads to wait to check this condition.
		
		if(null == instance) {
			synchronized (Singleton.class) {
				// 
				// Implementing double null check as if two threads come into synchronized block,  
				// Consider two threads came at a same time and observed that instance is null, so both of them try to enter
				// synchronized block, So, first thread enters and second one waits. Once first one enters, it creates the object.
				// But second thread waiting will not know, so we are doing another null check inside the  synchronized block .
				
				//still we need to
				// create only one instance.
				if(null == instance) {
					instance = new Singleton();	
				}
			}
		}
		
		return instance;
	}
	
}
