package com.decorator;

/**
 * 调料3(调料[装饰者]子类3) —— 奶泡
 * @author eric
 *
 */
public class Whip extends Condiment {
	
	private Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Whip";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.69 + beverage.cost();
	}

}
