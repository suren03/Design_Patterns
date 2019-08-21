package com.designpatterns.behavioral.observer;

public interface Subject {
	
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyAll(Message m);

}
