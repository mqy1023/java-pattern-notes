package com.factory.abstr;

public class Bus implements Moveable {

	@Override
	public void run(double speed) {
		// TODO Auto-generated method stub
		System.out.println("我是大巴，我目前的速度为：" + speed + "千米/小时");  
	}

}
