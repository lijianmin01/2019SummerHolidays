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
		
		//��������˼��
		/*
		 * ��1��
		 * 	��ʵ�������ɶ���Ͷ���֮���໥���ù�ͬ���
		 * 	ÿ���������Լ������ԣ�Ҳ���Լ���ר�еķ������ⲿ������Ҫ������Щ�����������������󲢴��������
		 * �ȷ���ִ�н����󣬷��ؽ����
		 * 	����=����+����
		 * 	����Ĺ淶=���Զ���+��������
		 * 
		 * ��2��JAVA �У�����������ĸ���
		 * -����ʱһ������������Ķ�����
		 * -��������ͣ��ǹ淶���Ƕ��壩������ǧ�����г�ȡ���ԣ�
		 * -��涨�˶���Ӧ���е��������ݺͷ���
		 * -��������Ķ�����ʵ�֣��ǻ�������
		 * -���磺����˿�������࣬һ������˿�Ƕ���
		 * 
		 * ��3��
		 * -�ӳ���չ�ĽǶ�����⣬OO��Oriented Object���Ƕ�OP��Oriented Procedure����һ�ָĽ�
		 * -OP�ĵ��ʹ�����C��Pascal.��ǿ���������������еĶ�����Ǳ�����������ģ�û����������Ȩ
		 * -OO�ķ�������ÿ������ġ��ܷ�ʵ������ÿ������˵����Ķ�������̾���
		 * */
		
	}
}
