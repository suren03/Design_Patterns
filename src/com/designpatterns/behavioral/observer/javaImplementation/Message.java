package com.designpatterns.behavioral.observer.javaImplementation;

import java.util.Observable;
import java.util.Observer;

public class Message extends Observable {

	public String message;
	
	public Message(String message) { 
		this.message = message;
	}

	public String getMessage() {
		return message;
	}


	
}
