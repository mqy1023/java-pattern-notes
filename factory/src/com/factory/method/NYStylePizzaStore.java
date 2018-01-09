package com.factory.method;

public class NYStylePizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoniPizza")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clamPizza")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggiePizza")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}

}
