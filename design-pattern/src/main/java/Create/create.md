这类设计模式提供了一种在创建对象的同时隐藏创建逻辑的方式，而不是使用新的运算符直接实例化对象，这使得程序在判断对某个给定实例需要创建哪些对象时更加灵活。

├── AbstractFactory 抽象工厂模式
├── Builder 建造者模式
├── FactoryMethod 工厂方法模式
├── Prototype 原型模式
├── SimpleFactory 简单工厂模式
├── Singleton 单例模式



## 1. 简单工厂模式 SimpleFactory

简单工厂模式的结构简单，调用方便。对于外界给定的信息，可以很方便地创建出相应的产品。工厂和产品的职责区分明确

### 三个角色

1. 简单工厂（SimpleFactory）：是简单工厂模式的核心，负责实现创建所有实例的内部逻辑。工厂类的创建产品类的方法可以被外界直接调用，创建所需的产品对象。 
2. 抽象产品（IProduct）：是简单工厂创建的所有对象的父类，负责描述所有实例共有的公共接口。
3. 具体产品（ConcreteProduct）：是简单工厂模式的创建目标。

### 优点

简单工厂模式的结构简单，调用方便。对于外界给定的信息，可以很方便地创建出相应的产品。工厂和产品的职责区分明确。

### 缺点

简单工厂模式的工厂类单一，负责所有产品的创建，但当产品基数增多时，工厂类代码会非常臃肿，违背高聚合原则。

## 2. 工厂方法模式 FactoryMethod

  工厂方法模式（Factory Method Pattern）又叫作多态性工厂模式，指定义一个创建对象的接口，但由实现这个接口的类来决定实例化哪个类，工厂方法把类的实例化推迟到子类中进行

### 四个角色

1. 抽象工厂（IFactory）：是工厂方法模式的核心，与应用程序无关。任何在模式中创建的对象的工厂类必须实现这个接口。
   
2. 具体工厂（ConcreteFactory）：是实现抽象工厂接口的具体工厂类，包含与应用程序密切相关的逻辑，并且被应用程序调用以创建产品对象。
   
3. 抽象产品（IProduct）：是工厂方法模式所创建的对象的超类型，也就是产品对象的共同父类或共同拥有的接口。
   
4. 具体产品（ConcreteProduct）：这个角色实现了抽象产品角色所定义的接口。某具体产品由专门的具体工厂创建，它们之间往往一一对应

### 优点

1. 灵活性增强，对于新产品的创建，只需多写一个相应的工厂类。

2. 典型的解耦框架。高层模块只需要知道产品的抽象类，无须关心其他实现类，满足迪米特法则、依赖倒置原则和里氏替换原则。

### 缺点

1. 类的个数容易过多，增加复杂度。
2. 增加了系统的抽象性和理解难度。
3. 抽象产品只能生产一种产品，此弊端可使用抽象工厂模式解决。


## 3. 抽象工厂模式 AbstractFactory
   抽象工厂模式, 工厂方法是简单工厂的进化版, 符合单一职责原则, 不再是一个工厂生产所有的产品
   抽象工厂就是工厂方法的进化版,每一个工厂生产对应的产品族, 不再是一个工厂对应一个单一的产品。

### 四个角色

1. 抽象工厂（IAbstractFactory）：声明创建抽象产品对象的一个操作接口。

2. 具体工厂（ConcreteFactory）：实现创建具体产品对象的操作。

3. 抽象产品（IAbstractProduct）：为一类产品对象声明一个接口。

4. 具体产品（ConcreteProduct）：定义一个将被相应的具体工厂创建的产品对象，实现AbstractProduct接口。

### 优点

1. 当需要产品族时，抽象工厂可以保证客户端始终只使用同一个产品的产品族。

2. 抽象工厂增强了程序的可扩展性，对于新产品族的增加，只需实现一个新的具体工厂即可，不需要对已有代码进行修改，符合开闭原则。

### 缺点

1. 规定了所有可能被创建的产品集合，产品族中扩展新的产品困难，需要修改抽象工厂的接口。

2. 增加了系统的抽象性和理解难度

## 4. 建造者模式

