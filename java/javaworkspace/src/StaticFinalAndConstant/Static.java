package StaticFinalAndConstant;
//第六章 static、final和常量设计
//第一节 static
public class Static {

}
/* static 静态的，Java中特殊的关键字
 * Java中的static关键字（可作用在）
 * 		-变量
 * 		-方法
 * 		-类
 * 		-匿名方法块
 * 
 * 
 * 静态变量，类共有成员
 * 		-先查看例子Potato.java
 * 
 * 		-static变量只在依赖于类存在（通过类即可访问），不依赖于对象实例
 * 存在。即可通过Potato.price即可访问
 * 	
 * 		-所有的对象实例，例如例子中obj1和obj2关于price变量的值都共享
 * 		-存储在一个共同的空间（栈）
 * 
 * static方法
 * 		静态方法也无需通过对象来引用，而通过类名可以直接引用
 * 		在静态方法中，只能使用静态变量，不能使用非静态变量
 * 		静态方法禁止引用非静态方法
 * 
 * 		关于static修饰类（内部类），使用的机会较少
 * 
 * static块
 * 		-只在类第一次被加载时调用
 * 		-换句话说，在程序运行时期间，这段代码只运行一次
 * 		-执行顺序：static块>匿名块>构造函数
 * */
















 