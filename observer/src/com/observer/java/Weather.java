package com.observer.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Weather 主题
 * @author eric
 *
 */
public class Weather extends Observable {

	private WeatherType type;
	
	public Weather() {}
	
	public void timePasses(WeatherType type) {
		if(this.type != type){
			this.type = type;
			setChanged(); // 【must】自带的,用来设置一个内部标志位注明数据发生了变化
			notifyObservers(this.type); // java.util自带
		}
	}
	
//	public WeatherType getWeatherType() {
//		return this.type;
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.type.toString();
	}

}
