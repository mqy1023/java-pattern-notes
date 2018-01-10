package com.factory.abstr;

public class Car implements Moveable {

	@Override
	public void run(double speed) {
		// TODO Auto-generated method stub
		System.out.println("我是汽车，我目前的速度为：" + speed + "千米/小时");  
	}

}
