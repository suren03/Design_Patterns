package com.designpatterns.behavioral.observer;


public class SubscriberTwo implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("SubscriberTwo :: Message is - " + m.getMessage());
		
	}



}
