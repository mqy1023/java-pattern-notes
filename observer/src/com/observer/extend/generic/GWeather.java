package com.observer.extend.generic;

import com.observer.extend.WeatherType;

public class GWeather extends Observable<GWeather, Race, WeatherType> {

	  private WeatherType currentWeather;

	  public GWeather() {
	    currentWeather = WeatherType.SUNNY;
	  }

	  /**
	   * Makes time pass for weather
	   */
	  public void timePasses() {
	    WeatherType[] enumValues = WeatherType.values();
	    currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
	    System.out.println("The weather changed to {}." + currentWeather);
	    notifyObservers(currentWeather);
	  }
	}
