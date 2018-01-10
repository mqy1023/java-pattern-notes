#### 一、简单工厂模式

* 1、Pizza基类上扩展具体的Pizza种类(CheesePizza、PepperoniPizza、ClamPizza、VeggiePizza)
* 2、简单工厂类SimplePizzaFactory，根据不同类别生产不同的Pizza
* 3、商店类PizzaStore，可以随便添加什么种类的Pizza，删除什么种类的Pizza都和商店PizzaStore无关了，PizzaStore只负责卖Pizza 这就是简单工厂模式.

#### 二、工厂方法模式
定义一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法模式把类实例化的过程推迟到子类。

store商店类具体实例化放到具体Pizza分店，具体不同Pizza店生产什么种类/卖什么种类Pizza都根据自己的需求来做.

* 1、public abstract Pizza createPizza(String type); 

#### 三、抽象工厂模式

提供一个接口，用于创建相关的或依赖对象的家族，而不需要明确指定具体类.

确保产品的种类可控性