package javaworkspace;

public class AbstractAndConnector {
	public static void main(String[] args)
	{
		//第二节 抽象类和接口
		
	}
	public abstract class Shape{
		int arae;
		public abstract void calArea();
		/*抽象类关键字abstract声明
		 * 抽象类的组成
		 * 		-（optional）成员变量，个数不限
		 * 		-（optional）具体方法，方法有实现，个数不限
		 * 		-（optional）抽象方法，加abstract关键字，个数不限
		 * */
	}
}
/*抽象类（1）
 * 类：属性（0或者多个）+方法（0或者多个）
 * 一个完整（健康）的类：所有的方法都有实现（方法体）
 * 类可以没有方法，但是有方法就肯定要有实现，这才是一个完整的类
 * 一个完整的类才可以被实例化，被new出来
 * 如果一个类暂时有方法未实现，需要被定义为抽象类
 * 
 * 
 * 抽象类也是类。一个类继承与抽象类，就不能继承于其他的（抽象）类
 * 子类可以继承于抽象类，但是一定要实现父类所有abstract的方法。
 * 如果不能完全实现，那么子类也必须被定义为抽象类
 * 只有实现父类（们）的所有抽象方法，才能变成完整类。
 * 参看Shape和Rectangle例子
 * 
 * 
 * 如果类的所有方法都没有实现，那么这个类就算是接口interface
 * 		public interface Animal{
 * 			public void eat();
 * 			public void move();
 * }
 * 类值可以继承（extends）一个类，但是可以实现（implements）多个接口，
 * 继承和实现可以同时。
 * 接口不算类，或者说是“特殊”的类
 * 接口中所有的方法是空的
 * 一个类的方法，只会在当前类或者父类中定义，可定不会在所实现的父类接口中定义
 * 
 * 
 * 接口可以继承（多个）接口，没有实现的额方法将会叠加
 * 类实现接口，就必须实现所有未实现的方法，如果没有全部实现，那么
 * 只能成为一个抽象类
 * 接口里可以定义变量，但是一般是常量
 *~抽象类的方法可以未空（没有方法体）   正常类的方法不能为空（必须有方法体）
 * */














 