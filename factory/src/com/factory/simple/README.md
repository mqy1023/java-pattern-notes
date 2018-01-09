## 简单工厂模式

* 1、Pizza基类上扩展具体的Pizza种类(CheesePizza、PepperoniPizza、ClamPizza、VeggiePizza)
* 2、简单工厂类SimplePizzaFactory，根据不同类别生产不同的Pizza
* 3、商店类PizzaStore，可以随便添加什么种类的Pizza，删除什么种类的Pizza都和商店PizzaStore无关了，PizzaStore只负责卖Pizza 这就是简单工厂模式.