package com.iterator;

public class MenuItem {
	private String name = null;

	private double price = 0.0;

	public MenuItem(String _name, double _price) {
		this.name = _name;
		this.price = _price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "(" + name + ", " + price + ")";
	}
}
