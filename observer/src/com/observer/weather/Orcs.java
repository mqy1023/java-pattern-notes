package com.observer.weather;

/**
 * Orcs 观察者
 * @author eric
 *
 */
public class Orcs implements WeatherObserver {
	
	private WeatherSubject subject;
	
	public Orcs(WeatherSubject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	@Override
	public void update(WeatherType type) {
		// TODO Auto-generated method stub
		System.out.println("Orcs  -->" + type);
	}

}
