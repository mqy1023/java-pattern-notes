## 工厂方法模式
定义一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法模式把类实例化的过程推迟到子类。

store商店类具体实例化放到具体Pizza分店，具体不同Pizza店生产什么种类/卖什么种类Pizza都根据自己的需求来做.

* 1、public abstract Pizza createPizza(String type); 
