package StaticFinalAndConstant;

public class StaticBlock {
	//static block >anonymous block > constructor function
	static
	{
		System.out.println("222222");
	}
	{
		System.out.println("1111111");
	}
	public StaticBlock() 
	{
		// TODO Auto-generated constructor stub
		System.out.println("333333");
	}
	{
		System.out.println("444444");
	} 
	
	public static void main(String[] args)
	{
		System.out.println("66666666");
		StaticBlock obj1=new StaticBlock();
		StaticBlock obj2=new StaticBlock();
	}
}









