package com.factory.abstr;

public class Factory2 extends AbstractFactory {

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
