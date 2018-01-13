#### 模板方法模式
在一个方法中定义一个算法的骨架，而将一些步骤延迟到子类中;模板方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤.

以不同员工上下班为例，定义了一个上下班（算法）的骨架，包含以下步骤：.
* a、进入公司
* b、上班情况
* c、离开公司

模版方式里面也可以可选的设置钩子.
超类中添加了一个isNeedPrintDate方法，且默认返回false，不打印时间。如果某子类需要调用打印时间，可以复写改钩子方法，返回true.

#### 基本方法
可以分为三种：抽象方法(Abstract Method)、具体方法(Concrete Method)和钩子方法(Hook Method).

* 抽象方法：一个抽象方法由抽象类声明，由具体子类实现。在Java语言里抽象方法以abstract关键字标示.
	* work方法
* 具体方法：一个具体方法由抽象类声明并实现，而子类并不实现或置换.
	* enterCompany方法 和 exitCompany方法
* 钩子方法：一个钩子方法由抽象类声明并实现，而子类会加以扩展。通常抽象类给出的实现是一个空实现，作为方法的默认实现.
	* isNeedPrintDate方法

#### 参考链接
[java-design-patterns](https://github.com/iluwatar/java-design-patterns/tree/master/facade)

[设计模式 模版方法模式 展现程序员的一天](http://blog.csdn.net/lmj623565791/article/details/26276093)