package javaworkspace;
class MyNum{
	int a;
	int b;
	public MyNum()
	{
		a=0;
		b=0;
	}
	public MyNum(int m)
	{
		a=m;
		b=0;
	}
	public MyNum(int m,int n)
	{
		a=m;
		b=n;
	}
}

public class Constructor {
	
	public static void main(String[] args) {
		//System.out.println("2019.7.14");
		MyNum obj1 =new MyNum();
		MyNum obj2 =new MyNum(5);
		MyNum obj3 =new MyNum(12,21);
		System.out.println("obj1 has "+obj1.a+","+obj1.b);
		System.out.println("obj2 has "+obj2.a+","+obj2.b);
		System.out.println("obj3 has "+obj3.a+","+obj3.b);
		/*  obj1 has 0,0
			obj2 has 5,0
			obj3 has 12,21
		 */
		
	}
}

/*构造函数
 *1、JAVA构造函数的名称必须和类名是一样的，且没有返回值
 *JAVA有构造函数，但是没有析构函数
 *	-构造函数是制造对象的过程，析构函数是清除对象的过程
 *每个变量都是由生命周期的，它只能存储在离他最近的一对{}中
 *当变量被创建时，变量将占据内存；当变量消亡时，系统将会回收内存 
 *
 *每个JAVA类都必须有构造函数
 *如果没有显示定义构造函数，JAVA编译器自动为该类产生一个空的无形参
 *构造函数。如果已经有了显示的有参构造函数，编译器就不会越俎代庖了
 *每个子类的构造函数的第一句话，都默认调用父类的无参数构造函数super()
 *,除非子类构造函数第一句话是super,而且super语句必须放在第一条。
 *class A{};
 *<==>
 *class a{
 *	public A{}
 *}
 *
 *
 * */
