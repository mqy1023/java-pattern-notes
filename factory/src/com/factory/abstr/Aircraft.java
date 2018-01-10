package com.factory.abstr;

public class Aircraft implements Flyable {

	@Override
	public void fly(int height) {
		// TODO Auto-generated method stub
		System.out.println("我是飞机，我目前的飞行高度为：" + height + "千米");  
	}

}
