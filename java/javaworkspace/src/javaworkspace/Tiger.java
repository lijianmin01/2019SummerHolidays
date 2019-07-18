package javaworkspace;

public class Tiger implements CatFamily {
	public void eat()
	{
		
	}
	public void move()
	{
		
	}
	public void climb()
	{
		
	}
	
	/*抽象类和接口相同点：二者都不能被实例化，不能new操作
	 * 抽象类和接口不同点
	 * 	抽象类abstract，接口interface
	 * 	抽象类可以有部分方法实现，接口所有方法不能有实现
	 *  一个类只能继承（extends）一个（抽象）类，实现（implements）多个
	 *		-一个类可以继承（extends）多个接口
	 *		-接口可以继承（extends）多个接口
	 *		-抽象类有构造函数，接口没有构造函数
	 *		-抽象类可以有main,也能运行，接口没有main函数
	 *		-抽象类方法可以有private/protected,接口方法都是public
	 * */
}
