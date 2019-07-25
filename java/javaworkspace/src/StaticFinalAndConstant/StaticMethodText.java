package StaticFinalAndConstant;

public class StaticMethodText {
	int a=111111;
	static int b=222222;
	public static void hello()
	{
		System.out.println("000000");
		System.out.println(b);
		//System.out.println(a);
		//error,cannot call non-static variables
		//hi();
		//error,cannot call non-static method
	}
	public void hi()
	{
		System.out.println("333333");
		hello();//ok,call static methods
		System.out.println(a);
		//ok,call non-static variables
		System.out.println(b);
		//ok,call static variables
	}
	public static void main(String[] a)
	{
		StaticMethodText.hello();
		//StaticMethodTest.hi();//error,不能使用类名来引用
		//非静态方法
		StaticMethodText foo=new StaticMethodText();
		foo.hello();//warning,but it is ok
		foo.hi();//right
	}
}


















