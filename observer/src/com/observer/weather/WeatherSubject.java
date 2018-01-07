package com.observer.weather;

/**
 * 主题接口
 * @author eric
 *
 */

public interface WeatherSubject {

	public void registerObserver(WeatherObserver observer);

	public void removeObserver(WeatherObserver observer);

	public void notifyObservers();
}
