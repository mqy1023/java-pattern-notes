package com.observer.weather;

/**
 * 观察者接口
 * @author eric
 *
 */
public interface WeatherObserver {

	public void update(WeatherType type);  
	
}
