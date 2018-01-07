package com.observer.extend;

import com.observer.extend.generic.GHobbits;
import com.observer.extend.generic.GOrcs;
import com.observer.extend.generic.GWeather;

public class App {
	public static void main(String[] args) {

		Weather weather = new Weather();
		weather.addObserver(new Orcs());
		weather.addObserver(new Hobbits());

		weather.timePasses();
		weather.timePasses();
		weather.timePasses();
		weather.timePasses();

		// Generic observer inspired by Java Generics and Collection by Naftalin &
		// Wadler
		System.out.println("--Running generic version--");
		GWeather gWeather = new GWeather();
		gWeather.addObserver(new GOrcs());
		gWeather.addObserver(new GHobbits());

		gWeather.timePasses();
		gWeather.timePasses();
		gWeather.timePasses();
		gWeather.timePasses();
	}
}
