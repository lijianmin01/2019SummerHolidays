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

/*���캯��
 *1��JAVA���캯�������Ʊ����������һ���ģ���û�з���ֵ
 *JAVA�й��캯��������û����������
 *	-���캯�����������Ĺ��̣������������������Ĺ���
 *ÿ�������������������ڵģ���ֻ�ܴ洢�����������һ��{}��
 *������������ʱ��������ռ���ڴ棻����������ʱ��ϵͳ��������ڴ� 
 *
 *ÿ��JAVA�඼�����й��캯��
 *���û����ʾ���幹�캯����JAVA�������Զ�Ϊ�������һ���յ����β�
 *���캯��������Ѿ�������ʾ���вι��캯�����������Ͳ���Խ�޴�����
 *ÿ������Ĺ��캯���ĵ�һ�仰����Ĭ�ϵ��ø�����޲������캯��super()
 *,�������๹�캯����һ�仰��super,����super��������ڵ�һ����
 *class A{};
 *<==>
 *class a{
 *	public A{}
 *}
 *
 *
 * */
