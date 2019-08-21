package com.designpatterns.behavioral.observer.javaImplementation;

import java.util.Observable;
import java.util.Observer;

public class SubscriberThree implements Observer {

	public SubscriberThree(Observable obs) {
		obs.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Subscriber Three  :: Message is - " + (((Message) o).getMessage()));
	}


}
