package javaworkspace;

public class selectAndLoop {
	public static void main(String[] args) {
		//if{} else if{} else
		
		//����ѡ��ṹ
		/*switch
		 * -���case��֧
		 * -����һ����֧����Ҫbreak
		 * -���һ����֧Ϊdefault
		 * */
		int a1=0,a2=6;
		switch (a1+a2) {
		case 8:
			System.out.print(7);
			break;
		case 7:
			System.out.print(77);
			break;
		case 9:
			System.out.print(79);
			break;

		default:
			System.out.print(789);
			break;
		}
		
		//ѭ���ṹ
		/*while
		 * do....while
		 * for
		 * break //�жϲ��˳�
		 * continue//��������ѭ���������´�ѭ��
		 * */
		System.out.print("\n");
		int i,j;
		for(i=1;i<10;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.printf("%d*%d=%d ",j,i,i*j);
			}
			System.out.println();
		}
	}
}












