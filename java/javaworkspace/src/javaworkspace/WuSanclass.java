package javaworkspace;

public class WuSanclass {
	public static void haveLun
}
/*类转型（1）
 * 变量支持互相转化，比如int a=(int)3.5
 * 类型可以互相转型，但是只限制于有继承关系的类
 * 	-子类可以转换成父类，但是父类不可以转成子类
 * 	-子类继承父类所有财产，子类可以变成父类（从大到小，即向上转型）
 * 	；从父类直接变成子类（从小变大，即向下转型）则不允许
 * 
 * 	Human obj1 = new Man();//OK ,Man extends Human
 *  Man obj2= new Human();//illegal,Man is a derived class Human
 *  
 *  
 *  类转型（2）
 *  父类转为子类有一种情况例外
 *  	-就是这个父类本身就是子类转化过来的
 *  	Human obj1=new Man();//ok ,Man extends Human
 *  	Man obj2=(Man)obj1;//OK,because obj1 is born from Man class
 *  
 *  
 * 多态（1）
 * -类型转换，带来的作用就是多态
 * -子类继承父类的所有方法，但子类可以重新定义一个名字、参数和父类一样
 * 的 方法，但这种行为就是重写（覆写，覆盖。overwrite/override,not overload）
 * -子类的方法的优先级高于父类
 * 
 * 多态的作用
 * 	-以统一的接口来操纵某一类中不同的对象的动态行为
 * 	-对象之间的解耦
 * 
 * 契约设计（1）
 * -JAVA编程设计遵循契约精神
 * -契约：规定规范了对象应该包含的行为方法
 * -接口定义了方法的名称、参数和返回值，规范了派生类的行为
 * -基于接口，利用转型和多态，不影响真正方法的调用，成功的将调用类和
 * 被调用类解耦（decoupling）
 * */















 