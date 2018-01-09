package com.factory.method;

public class SZStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese11")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoniPizza11")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clamPizza11")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggiePizza11")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}

}
