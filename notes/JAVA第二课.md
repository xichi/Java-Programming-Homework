# JAVA第2~4章

遵循OCP，OCP即在设计一个模块时，应该使这个模块可以在不被修改的前提下被扩展。 

## 接口(Interface)

+ 在不相关的类之间不用建立类的联系而创建相似性。

* 声明一个或多个类期待实现的方法。
* 不需要暴露类的构造而提供编程接口 



## 变量

### 数据类型

+ 基本型(primitive)

  + 整型 byte (8位有符号数bit), short (16 位有符号数),
    int (32 位有符号数),long (64 位有符号数) 
  + 实数类型 float (32 位IEEE754浮点数),
    double (64 位IEEE754浮点数) 
  + 字符型 char (16 位,unicode编码) 
  + 布尔型 boolean

  **自动类型转换**:
  eg. `byte -> int`, `int-> long` 数值范围小的量-> 数值范围大的量
  `int x; byte y; x = y;`
  **强制类型转换**:
  eg. `int-> byte` 数值范围大的量->数值范围小的量
  `int x; byte y; y = (byte)x;` 注意可能发生的信息丢失 

  ​

+ 引用型(reference)

  引用型变量是对单个数值或数值集合（数组，类，接口）
  的引用 。

  ​

### 作用域(scope)

变量在程序中的位置决定了变量的作用范围，分为4种类型：

* 成员变量(member variable)
* 本地变量(local variable)
* 方法参数(method parameter)
* 异常处理器参数 (exception-handler parameter) 

![](http://njupt.xichi.xyz/blog/javaScope.png)

### 终止变量(Final Variables)

终止变量一旦被初始化后就不能改变其数值。等同与其他编程语言中的**常数**。

`final int blankfinal; `



## Java对象

### 对象生命周期

![](http://njupt.xichi.xyz/blog/java2.png)

Java运行环境检查到某个对象不再被使用时，将会把它删除掉，这一过程称为**垃圾回收**(garbage collection)。
一个对象被垃圾回收的条件（无用对象）是：对这个对象的
引用数为0，或在遍历对象树不可达 。

