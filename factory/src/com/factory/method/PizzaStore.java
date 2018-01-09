package com.factory.method;

public abstract class PizzaStore {

	public abstract Pizza createPizza(String type);  
	
	private Pizza orderPizza(String type) {
		Pizza pizza = null;
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;

	}
}
