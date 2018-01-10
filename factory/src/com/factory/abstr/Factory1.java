package com.factory.abstr;

public class Factory1 extends AbstractFactory {

	@Override
	public Flyable createFlyable() {
		// TODO Auto-generated method stub
		return new Aircraft();
	}

	@Override
	public Moveable createMoveable() {
		// TODO Auto-generated method stub
		return new Car();
	}

}
