package com.observer.java;

public class Test {

	public static void main(String[] args) {
		// 模拟一个天气主题
		Weather weatherSubject = new Weather();
		// 两个观察者
		Orcs observer1 = new Orcs(weatherSubject);
		Hobbits observer2 = new Hobbits(weatherSubject);

		weatherSubject.timePasses(WeatherType.SUNNY);
		weatherSubject.timePasses(WeatherType.WINDY);
	}
}
