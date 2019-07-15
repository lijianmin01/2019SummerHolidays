package javaworkspace;


public class 继承 {
	public static void main(String[] args)
	{
		System.out.println("第五章 继承、接口和抽象类");
	}
}
/* 1、面向对象编程语言和面向过程的编程语言最突出的特点就是变量类型的
 * 继承
 * 2、更符合大自然的规律：父亲有的，儿子就有
 * 3、class Father
//{
//	public void f1()
//	{
//		System.out.println("hi~son");
//	}
//}
//
//public class Son extends Father
//{
//	public static void main(String[] a)
//	{
//		Son s=new Son();
//		s.f1();
//	}
//}
 * 
 * 
 * 面向过程编程语言没有继承，导致出现很多类型重复定义
 * 物以类聚，世间万物皆对象，对象也可以分为若干类别
 * 类别内的对象属性和方法都具有一定的共同点。
 * 将共同点提取出来，即形成了父类、基类、超类
 * 	-Parent class /Base class / Super class
 * 而其他类则自动形成子类/派生类
 * 	-Child class / Derived class
 * 
// public class Man{
//	int height;
//	int weight;
//	public void eat(){};
//	public void plough(){};
//}
//public class Woman{
//	int height;
//	int weight;
//	public void eat(){};
//	public void weave(){};
//}
//
//
//
//public class Human{
//	int height;
//	int weight;
//	public void eat(){};
//}
//public class Man extends Human{
//	public void plough(){};
//}
//public class Woman extends Human{
//	public void weave(){};
//}
 

 //Man extends Human 表示Man继承与Human
  * Human 是父类，Man是子类
  * 子类继承 父类所有属性和方法（但不能直接访问private成员）
  * 根据信息隐藏原则：子类会继承父类所有的方法。可以直接使用
  * 子类也会继承父类的父亲的所有的属性和方法（但不能直接访问private成员）
 
 */
 












