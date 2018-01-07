package com.observer.weather;

/**
 * Hobbits 观察者
 * @author eric
 *
 */
public class Hobbits implements WeatherObserver {
	
	private WeatherSubject subject;
	
	public Hobbits(WeatherSubject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	@Override
	public void update(WeatherType type) {
		// TODO Auto-generated method stub
		System.out.println("Hobbits  -->" + type);
	}

}
