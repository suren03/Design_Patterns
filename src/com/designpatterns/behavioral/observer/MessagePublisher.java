package com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Subject {

	List<Observer> observers = new ArrayList<>();
	
	public void register(Observer o) {

		observers.add(o);
	}

	public void unregister(Observer o) {
		observers.remove(o);
	}

	public void notifyAll(Message m) {
		for(Observer o : observers)
			o.update(m);
	}

}
