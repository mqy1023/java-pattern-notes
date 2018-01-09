package com.factory.simple;

public class PizzaStore {

	private SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	private Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = factory.createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;

	}
}
