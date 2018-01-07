package com.observer.java;

import java.util.Observable;
import java.util.Observer;

/**
 * Orcs 观察者
 * @author eric
 *
 */
public class Orcs implements Observer {
	
	private Observable subject;
	
	public Orcs(Observable subject) {
		this.subject = subject;
		subject.addObserver(this);
	}

	@Override
	public void update(Observable obs, Object arg) {
		// TODO Auto-generated method stub
		if (obs instanceof Weather) {
			Weather mWeather = (Weather) obs;
//			System.out.println("Orcs  -->" + mWeather.getWeatherType());
			System.out.println("Orcs  -->" + arg);
		}
	}

}
