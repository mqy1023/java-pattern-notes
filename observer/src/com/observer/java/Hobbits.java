package com.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * Hobbits 观察者
 * @author eric
 *
 */
public class Hobbits implements Observer {
	
	private Observable subject;
	
	public Hobbits(Observable subject) {
		this.subject = subject;
		subject.addObserver(this);
	}

	@Override
	public void update(Observable obj, Object arg) {
		// TODO Auto-generated method stub
		if (obj instanceof Weather) {
			Weather mWeather = (Weather) obj;
			System.out.println("Hobbits  -->" + arg);
		}
	}

}
