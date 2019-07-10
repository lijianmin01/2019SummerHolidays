package javaworkspace;

public class javaKindsAndObject {
	private  int a;
	public void setA(int a)
	{
		this.a=a;
	}
	public int add(int b)
	{
		return this.a+b;
	}
	public static void main(String[] args){
		//OO
		int b=5;
		javaworkspace obj= new javaworkspace();
		obj.setA(10);
		System.out.println(obj.add(b));
		
		//面向对象的思想
		/*
		 * （1）
		 * 	现实对象是由对象和对象之间相互作用共同组成
		 * 	每个对象有自己的特性，也有自己的专有的方法。外部对象想要调用这些方法，可以向它请求并传入参数，
		 * 等方法执行结束后，返回结果。
		 * 	对象=属性+方法
		 * 	对象的规范=属性定义+方法定义
		 * 
		 * （2）JAVA 中，引入对象和类的概念
		 * -对象时一个变量（具体的东西）
		 * -类就是类型（是规范，是定义），从万千对象中抽取共性；
		 * -类规定了对象应该有的属性内容和方法
		 * -对象是类的而具体实现，是活生生的
		 * -例如：土豆丝菜谱是类，一盘土豆丝是对象
		 * 
		 * （3）
		 * -从程序发展的角度来理解，OO（Oriented Object）是对OP（Oriented Procedure）的一种改进
		 * -OP的典型代表是C和Pascal.更强调方法动作，所有的额变量是被动参与进来的，没有自主决定权
		 * -OO的方法属于每个对象的。能否实现是由每个对象说了算的额，有主任翁精神
		 * */
		
	}
}
