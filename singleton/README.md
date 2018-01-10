#### 单例模式
确保一个类只有一个实例，并提供一个全局访问点.

#### 一、单元枚举类型(EnumIvoryTower.java)
是实现单例的最好方法.

```
public enum EnumIvoryTower {
  INSTANCE;
}

EnumIvoryTower enumIvoryTower1 = EnumIvoryTower.INSTANCE;
EnumIvoryTower enumIvoryTower2 = EnumIvoryTower.INSTANCE;
assertEquals(enumIvoryTower1, enumIvoryTower2); // true
```

#### 二、内部类(InitializingOnDemandHolderIdiom.java)
采用了类装载的机制来保证初始化实例时只有一个线程.
而且是在需要实例化时，调用getInstance方法，才会装载HelperHolder类，从而完成InitializingOnDemandHolderIdiom的实例化.


#### 三、单例模式的饿汉式
在类加载的时候就完成了实例化，避免了线程的同步问题.

缺点：由于在类加载的时候就实例化了，所以没有达到Lazy Loading(懒加载)的效果，也就是说可能我没有用到这个实例，但是它也会加载，会造成内存的浪费(但是这个浪费可以忽略，所以这种方式也是推荐使用的)。

#### 四、双重检查加锁(ThreadSafeDoubleCheckLocking.java)
volatile关键字确保当instance变量被初始化成ThreadSafeDoubleCheckLocking实例时，多个线程正确处理instance变量

