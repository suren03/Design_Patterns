package com.designpatterns.behavioral.observer;

public class ObserverTest {

	public static void main(String[] args) { 
		
		Observer obs1 = new SubscriberOne();
		Observer obs2 = new SubscriberTwo();
		Observer obs3 = new SubscriberThree();
	
		
		Subject publisher = new MessagePublisher(); 
		publisher.register(obs1);
		publisher.register(obs3); 
		
		Message message = new Message("Testing 1 or  3");
		
		System.out.println("Expected Subscriber One and Three .");
		publisher.notifyAll(message);
		
		publisher.unregister(obs3);
		System.out.println("\n\nExpected Subscriber One only.");

		publisher.notifyAll(message);
		
		publisher.register(obs3);
		publisher.register(obs2); 
		
		System.out.println("\n\nExpected Subscriber One, Two and Three.");
		publisher.notifyAll(message);
		
		
	}
}
