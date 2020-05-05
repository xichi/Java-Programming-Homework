## Java第5~7章

+ 类继承
  + super
+ 接口
  + extends与implements
+ 泛型
+ 异常处理

## 一、类继承

#### super 与 this 关键字

super关键字：我们可以通过super关键字来实现对父类成员的访问，用来引用当前对象的父类。

this关键字：指向自己的引用。

```java
class Animal {
  void eat() {
    System.out.println("animal : eat");
  }
}
 
class Dog extends Animal {
  void eat() {
    System.out.println("dog : eat");
  }
  void eatTest() {
    this.eat();   // this 调用自己的方法
    super.eat();  // super 调用父类方法
  }
}
 
public class Test {
  public static void main(String[] args) {
    Animal a = new Animal();
    a.eat();
    Dog d = new Dog();
    d.eatTest();
  }
}
```





## 二、接口

接口体现了规范和实现相互分离的设计原则，从而降低了模块
之间的耦合度，是实现可插入性的基础。 



### 接口和抽象类之间的不同点

+ 接口中不可以有任何方法的具体实现，但抽象类可以
+ 一个类可以实现多个接口但只能有一个父类
+ 接口不是类体系的一个部分，不相关的类可以实现同样的接口

### 接口定义

```java
public interface SVIP{
  void increaseHeight(int height);
  void decreaseHeight(int height);
}
```

### 对接口的实现

```java
public class MagicHouseSVIP implements SVIP{
  //...
  
  public volid increaseHeight(int Height){
    //CODE
  }
  public volid decreaseHeight(int Height){
    //CODE
  }
}
```



```
区别：
- extends关键字
  在 Java 中，类的继承是单一继承，也就是说，一个子类只能拥有一个父类，所以 extends 只能继承一个类。
- implements关键字
  使用 implements 关键字可以变相的使java具有多继承的特性，使用范围为类继承接口的情况，可以同时继承多个接口（接口跟接口之间采用逗号分隔）

```



## 三、泛型

**泛型**：将类型（类和接口）作为参数
**泛型的作用**：使用泛型，可以将许多难以检测的运行时刻错误转
变为在编译时刻就能检测出来，从而增加了代码的稳定性，另
外，泛型的引入可以消除代码中的强制类型转换 



### 泛型的定义和使用

Box类（泛型版本）,引入类型变量T 

```java
public class Box <T>{
  private T t;
  public void set(T t){this.t = t;}
  public T get(){ return t; }
}

Box<Integer> b = new Box<Integer>();
b.set(new Integer(2));
Integer x = b.get(); // 运行正常

Box<Integer> b = new Box<Integer>();
b.set(new String("hello world"); //编译器检测出错误！
Integer x = b.get();
```



## 四、异常处理

异常，也称例外，是指在程序执行过程中发生的破坏程序正常指令执行流的事件。

 ![](http://njupt.xichi.xyz/blog/error sort.png)

+ 异常处理的语法结构

  + Try语句块

  + Catch语句块

  + Finally语句块

    Final语句体提供了在程序流程离开异常处理器转向其他程序段前
    清除方法状态的处理机制，清除代码应该写在finally语句体中。
    例如，回收网络连接等不需要再使用的物理资源。 

  ![](http://njupt.xichi.xyz/blog/try_catch_finally.png)

  ​