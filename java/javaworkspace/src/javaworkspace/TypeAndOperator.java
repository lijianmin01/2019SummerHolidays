package javaworkspace;

public class TypeAndOperator {
	public static void main(String[] args) {
		/*��������/�������
		 * -Boolean ����
		 * -byte �ֽ�
		 * -short/int/long ������/����/������
		 * -float/double ������
		 * -char �ַ�*/
		//��������
		//	-ֻ��true��1��,����flase��0������ֵ��Ĭ��Ϊflase
		
		/*byte
		 * -byte�ֽڣ�1 byte=8bits(8λ)
		 * -�洢�з��ŵģ��Զ����Ʋ����ʾ������
		 *-��СֵΪ-128�����ֵ127��Ĭ��ֵΪ0
		 *-byte�������ڴ��������п���������Լ�ռ䣬��Ҫ����С��������Ϊbyte����
		 *ռ�õĿռ�ֻ��int���͵�1/4
		 *-byte�ڶ������ļ��ж�дʹ�ñȽ϶�
		 * */
		byte a4=(byte)-129;
		System.out.println(a4);//-127,���ҿ������죬-128~127 -128~127 -128~127
		/*short
		 * 16λ��2���ֽڣ��з��ŵģ��Զ����Ʋ����ʾ������
		 * ��-32768����32767��-2^15--2^15��,Ĭ��ֵΪ0
		 * */
		
		/*int
		 * 32λ��4���ֽڣ��з��ŵģ��Զ����Ʋ����ʾ������
		 * ��-2147483648����2147483647��-2^31--2^31��,Ĭ��ֵΪ0
		 * */
		
		/*long
		 * 64λ��8���ֽڣ��з��ŵģ��Զ����Ʋ����ʾ������
		 * ����-2^63--2^63��,Ĭ��ֵΪ0L
		 * */
		short a1=32767;
		System.out.println(a1);
		//a1=32768 error Խ��
		int b1=-2147483648;
		System.out.println(b1);
		
		
		long c1=1000000000000L;
		System.out.println(c1);
		
		long c2=2147483647;//��ʽ���˴�int��long�Ĳ���
		System.out.println(c2);
		
		long c3=2147483648L;//ȥ��L������
		System.out.println(c3);
		//����long������ü��ϴ�д��L�������Ͳ��������
		
		//����������
		/*float�������ȣ�32λ��4���ֽڣ�1.4*10^��-45��~3.4*10^��38����
		 * double��˫���ȣ�64λ��8���ֽڣ�4.9*10^��-324��~1.7*10^308��
		 * float��double������������ʾ��׼ȷ������
		 * */
		
		//�ַ����͡���char
		/*��Сֵ��\u0000(��0)��
		 *���ֵ��\uffff (��65,535)
		 * char�������Ϳ��Դ洢�κ��ַ�
		 * */
		
		char a='a';
		char b=97;
		char c='��';
		char d='\u4e00';//\u4e00--\u9fa5 ����຺��
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//���������C����һ��
		//>>���Ƴ���2��<<���Ƴ���2
		//��ʵ����˳��һ��Ҫ�μǣ��õ�ʱ�������Ŵ���
		System.out.println((5>2) &&(2<3)||(!false));//true
	}
}























