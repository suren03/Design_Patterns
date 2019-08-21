package com.designpatterns.behavioral.observer.javaImplementation;

import java.util.Observer;

public class ObserverPatternTest {

	public static void main(String[] args) {
		Message message = new Message("Test One");
		
		
		Observer obs1 = new SubscriberOne(message);
		Observer obs2 = new SubscriberTwo(message);
		
		System.out.println("Testing One and Two. "); 
		
		message.notifyObservers();
		
		System.out.println("testing 1");
		message.deleteObserver(obs2); 
		message.notifyObservers(); 
		
		System.out.println("Testing One, Two and Threee. "); 
		
		message.addObserver(obs2);
		message.addObserver(new SubscriberThree(message)); 
		
		message.notifyObservers(); 
	}
}
