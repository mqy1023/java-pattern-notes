package com.decorator;

/**
 * 调料2(调料[装饰者]子类2) —— 豆浆
 * @author eric
 *
 */
public class Soy extends Condiment {
	
	private Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.31 + beverage.cost();
	}

}
