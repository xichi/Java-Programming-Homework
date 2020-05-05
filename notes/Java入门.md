# Java入门：Java是一种什么样的语言？

大二下学校开了Java程序设计的课程，但是由于疫情原因，老师让我们自行上百度云学习。但是本咸鱼还是打开了哔哩哔哩开始学习。下面是对Java的一些入门理解，在学习之前先了解一下Java是一种什么样的语言~

## 1.JAVA语言特性【开源、免费、纯面向对象、跨平台】

+ **简单性**

  Java语言底层是c++实现的

+ **面向对象**

+ **可移植性**-->跨平台

  Write once, Run everywhere.（Java虚拟机（简称JVM）：可以运行在Linux操作系统、Windows操作系统中。所以需要下载不同版本的JDK。）

  看到这里，来区分一下几个概念：
  + JDK(Java开发工具包Java Development Kit):JDK=JRE+JVM+其它
  + JRE(Java运行环境Java Runtime Environment):JRE=JVM+其它
  + JVM(Java虚拟机java virtual machine)

+ **多线程**

+ **健壮性**

  自动垃圾回收机制（GC机制）

## 2.Java加载与执行


![](http://njupt.xichi.xyz/blog/intro.png)

+ 编译

![](http://njupt.xichi.xyz/blog/compile.png)

+ 执行

## 3.写个HelloWorld
```java

//public 公开的
//class 定义一个类
//HelloWorldApp 表示类名
public class HelloWorldApp {
    /*
    * main 方法名
    * (String[] args) 一个main方法的形式参数列表
    * 定义一个公开的静态的主方法，是程序的执行入口
    * */
    public static void main(String[] args){
        //方法体
        System.out.println("Nice to meet you, my friends!");
        System.out.println("开始学习Java了~");
    }
}

```

+ 一个java源文件中，public class只能有一个且源文件名字一致。

IDEA的demo：  
![](http://njupt.xichi.xyz/blog/demo.png)
