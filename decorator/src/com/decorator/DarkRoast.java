package com.decorator;

/**
 * 深焙咖啡
 * @author eric
 *
 */
public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "DarkRoast";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.19;
	}

}
