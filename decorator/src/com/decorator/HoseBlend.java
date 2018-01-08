package com.decorator;

public class HoseBlend extends Beverage {

	public HoseBlend() {
		description = "Hose Blend Coffee";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.99;
	}

}
