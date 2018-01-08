package com.decorator;

/**
 * 调料抽象类
 * @author eric
 * 这里调料继承饮料，仅仅是为了使两者具有相同的类型，并非为了复用父类的行为。
 */
public abstract class Condiment extends Beverage  {

	public abstract String getDescription();
}
