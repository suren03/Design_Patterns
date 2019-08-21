package com.designpatterns.behavioral.observer;

/**
 * 
 * This is a state object.
 * So, it should be immuatble object so that no observer can set or change the state. 
 * 
 * 
 * 
 * @author surendrakumar
 *
 */
public class Message {

	public String message;

	public Message(String message) { 
		
		this.message = message;
	} 
	
	
	public String getMessage() {
		return message;
	}

	
}
