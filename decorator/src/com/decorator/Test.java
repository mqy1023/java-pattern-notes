package com.decorator;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + ", $" + beverage.cost());
		Beverage beverage2 = new HoseBlend();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + ", $" + beverage2.cost());
		Beverage beverage3 = new DarkRoast();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + ", $" + beverage3.cost());
	}

}
