package com.observer.weather;

import java.util.ArrayList;
import java.util.List;

/**
 * Weather 主题
 * @author eric
 *
 */
public class Weather implements WeatherSubject {
	
	private List<WeatherObserver> observers = new ArrayList<WeatherObserver>();

	private WeatherType type;
	
	@Override
	public void registerObserver(WeatherObserver observer) {
		// TODO Auto-generated method stub
		observers.add(observer);
	}

	@Override
	public void removeObserver(WeatherObserver observer) {
		// TODO Auto-generated method stub
		int index = observers.indexOf(observer);
		if (index >= 0) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (WeatherObserver observer : observers) {
			observer.update(type);
		}
	}
	
	public void timePasses(WeatherType type) {
		this.type = type;
		notifyObservers();
	}

}
