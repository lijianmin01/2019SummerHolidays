package javaworkspace;

public class selectAndLoop {
	public static void main(String[] args) {
		//if{} else if{} else
		
		//多重选择结构
		/*switch
		 * -多个case分支
		 * -满足一个分支后，需要break
		 * -最后一个分支为default
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
		
		//循环结构
		/*while
		 * do....while
		 * for
		 * break //中断并退出
		 * continue//跳出本次循环，继续下次循环
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












