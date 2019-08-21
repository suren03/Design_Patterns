package com.designpatterns.behavioral.observer.javaImplementation;

import java.util.Observable;
import java.util.Observer;

public class SubscriberTwo implements Observer {

	public SubscriberTwo(Observable obs) {
		obs.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Subscriber Two :: Message is - " + (((Message) o).getMessage()));
	}


}
