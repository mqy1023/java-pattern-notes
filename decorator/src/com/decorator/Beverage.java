package com.decorator;

/**
 * 饮料抽象类
 * @author eric
 *
 */
public abstract class Beverage {

	 protected String description = "unknow beverage";
	 
	 public String getDescription() {
		 return this.description;
	 }
	 
	 /**
	  * 获取每种饮料的价格
	  * @return
	  */
	 public abstract double cost();
}
