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
	public static int add(int n,int m)//��������
	{
		return m+n;
	}
	public static double add(double n,double m) {
		return m+n;
	}
	public static int jie(int n) //�ݹ麯�������׳�
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
	/*���غ���
	 * 	��ͬһ�����У����������ƿ�����ͬ�������غ�����overload�������Ǻ��������ĸ����������ͱ���������ͬ
	 * �����Է���ֵ������ͬ������
	 *�����������Ǻ�������ͬ���β��б����������ͬ
	 * */
}




















