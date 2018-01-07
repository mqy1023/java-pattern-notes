## 观察者模式
观察者 = 出版社(Publish) + 订阅者(Subscribe).

#### 意图Intent
定义了对象之间的一对多依赖关系，这样一来，当一个对象更改状态时，它的所有依赖者都会收到通知并自动更新.

![observer_1](../images/observer_1.png)

* 1、Weather主题对象管理着天气的数据
* 2、当Weather主题内的数据改变，就会通知到已订阅的观察者
* 3、已订阅的观察者在Weather主题改变后收到更新通知

#### 实现步骤
* 1、开始写主题接口WeatherSubject和观察者WeatherObserver接口

* 2、主题的实现类Weather

* 3、模拟两个实现WeatherObserver接口的观察者，Orcs 和 Hobbits

* 4、Weather主题中维护了所有向它订阅消息的观察者，当Weather有新消息时，通知所有的观察者。整个架构是一种松耦合，主题的实现不依赖与观察者，当增加新的观察者时，主题的代码不需要改变；观察者如何处理得到的数据与主题无关.

#### 扩展一
java.util包内包含了最基本的Observer接口和Observable类，这和我们的Subject接口和Observer接口很相似.

* 1、被观察者需要继承Observable类
  * a、setChanged(); // 用来设置一个内部标志位注明数据发生了变化
  * b、notifyObservers(); // 通知观察者更新
* 2、观察者需要实现Observer接口

#### 扩展二

实现java的Observer接口和Observable类
