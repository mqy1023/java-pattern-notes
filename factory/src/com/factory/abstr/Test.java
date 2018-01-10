package com.factory.abstr;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory factory = new Factory1();  
        Flyable flyable = factory.createFlyable();  
        flyable.fly(1589);  
          
        Moveable moveable = factory.createMoveable();  
        moveable.run(87.6);  
        
        AbstractFactory factory2 = new Factory2();  
        Flyable flyable2 = factory.createFlyable();  
        flyable2.fly(1234);  
          
        Moveable moveable2 = factory.createMoveable();  
        moveable2.run(67.6);  
	}

}
