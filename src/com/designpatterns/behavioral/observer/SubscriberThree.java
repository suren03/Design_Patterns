package com.designpatterns.behavioral.observer;

public class SubscriberThree implements Observer {

	@Override
	public void update(Message m) {
		System.out.println("SubscriberThree :: Message is - " + m.getMessage());

	}

}
