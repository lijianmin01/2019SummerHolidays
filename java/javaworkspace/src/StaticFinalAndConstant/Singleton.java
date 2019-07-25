package StaticFinalAndConstant;

public class Singleton {
	private static Singleton obj=new Singleton();
	//共享一个对象
	private String content;
	//确保只能在内部调用函数
	private Singleton() 
	{		
		this.content="abc";
	}
	
	public String getContent()
	{
		return content;
	}
	public void setContent(String content)
	{
		this.content=content;
	}
	public static Singleton getInstance()
	{
		//静态方法使用静态变量
		//另外可以使用方法内部临时变量，但是不能引用非静态成员变量
		return obj;
	}
	
	public static void main(String[] args)
	{
		Singleton obj1=Singleton.getInstance();
		System.out.println(obj1.getContent());
		
		Singleton obj2=Singleton.getInstance();
		System.out.println(obj2.getContent());
		
		obj2.setContent("def");
		System.out.println(obj1.getContent());
		System.out.println(obj2.getContent());
		
		System.out.println(obj1==obj2);//true,obj1和obj2指向同一个对象
	}
}

















