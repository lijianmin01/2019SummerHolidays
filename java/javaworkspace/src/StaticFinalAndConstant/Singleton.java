package StaticFinalAndConstant;

public class Singleton {
	private static Singleton obj=new Singleton();
	//����һ������
	private String content;
	//ȷ��ֻ�����ڲ����ú���
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
		//��̬����ʹ�þ�̬����
		//�������ʹ�÷����ڲ���ʱ���������ǲ������÷Ǿ�̬��Ա����
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
		
		System.out.println(obj1==obj2);//true,obj1��obj2ָ��ͬһ������
	}
}

















