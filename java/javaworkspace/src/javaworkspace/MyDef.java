package javaworkspace;

public class MyDef {
	public static void main(String[] args) {
		int a,b,c;
		a=1;
		b=2;
		c=MyDef.add(a,b);
		//System.out.println("c is "+c);
		//System.out.println("jie(5) is "+jie(5));
		int cnt=1;
		int z=7;
		for(int i=0;i<z;i++)
		{
			for(int j=0;j<z;j++)
			{
				System.out.print(cnt+" ");
				cnt++;
			}
			System.out.println("\n");
		}
		
	}
	public static int add(int n,int m)//函数定义
	{
		return m+n;
	}
	public static double add(double n,double m) {
		return m+n;
	}
	public static int jie(int n) //递归函数——阶乘
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return jie(n-1)*n;
		}
		
	}
	/*重载函数
	 * 	在同一个类中，函数的名称可以相同，即重载函数（overload），但是函数参数的个数或者类型必须有所不同
	 * 不能以返回值来区分同名函数
	 *函数的重载是函数名相同，形参列表必须有所不同
	 * */
}




















