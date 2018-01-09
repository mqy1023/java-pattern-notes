package com.factory.simple;

public abstract class Pizza {

	protected String name;

	public void prepare() {
		System.out.println("prepare Pizza");
	}

	public void bake() {
		System.out.println("bake Pizza");
	}

	public void cut() {
		System.out.println("cut Pizza");
	}
	
	public void box() {
		System.out.println("box Pizza");
	}

}
