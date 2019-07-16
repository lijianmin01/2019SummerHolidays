package javaworkspace;

public class TypeAndOperator {
	public static void main(String[] args) {
		/*基本类型/基本类别
		 * -Boolean 布尔
		 * -byte 字节
		 * -short/int/long 短整数/整数/长整数
		 * -float/double 浮点数
		 * -char 字符*/
		//布尔类型
		//	-只有true（1）,或者flase（0）两种值，默认为flase
		
		/*byte
		 * -byte字节，1 byte=8bits(8位)
		 * -存储有符号的，以二进制补码表示的整数
		 *-最小值为-128，最大值127，默认值为0
		 *-byte类型用在大型数组中可以显著节约空间，主要代替小整数，因为byte变量
		 *占用的空间只有int类型的1/4
		 *-byte在二进制文件中读写使用比较多
		 * */
		byte a4=(byte)-129;
		System.out.println(a4);//-127,左右可以延伸，-128~127 -128~127 -128~127
		/*short
		 * 16位，2个字节，有符号的，以二进制补码表示的整数
		 * （-32768——32767，-2^15--2^15）,默认值为0
		 * */
		
		/*int
		 * 32位，4个字节，有符号的，以二进制补码表示的整数
		 * （-2147483648——2147483647，-2^31--2^31）,默认值为0
		 * */
		
		/*long
		 * 64位，8个字节，有符号的，以二进制补码表示的整数
		 * （，-2^63--2^63）,默认值为0L
		 * */
		short a1=32767;
		System.out.println(a1);
		//a1=32768 error 越界
		int b1=-2147483648;
		System.out.println(b1);
		
		
		long c1=1000000000000L;
		System.out.println(c1);
		
		long c2=2147483647;//隐式做了从int到long的操作
		System.out.println(c2);
		
		long c3=2147483648L;//去掉L将报错
		System.out.println(c3);
		//定义long类型最好加上大写的L，这样就不会出错啦
		
		//浮点数类型
		/*float，单精度，32位，4个字节（1.4*10^（-45）~3.4*10^（38））
		 * double，双精度，64位，8个字节（4.9*10^（-324）~1.7*10^308）
		 * float和double都不能用来表示很准确的数字
		 * */
		
		//字符类型——char
		/*最小值是\u0000(即0)；
		 *最大值是\uffff (即65,535)
		 * char数据类型可以存储任何字符
		 * */
		
		char a='a';
		char b=97;
		char c='我';
		char d='\u4e00';//\u4e00--\u9fa5 两万多汉字
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		//运算符，与C语言一致
		//>>右移除以2，<<左移乘以2
		//其实优先顺序不一定要牢记，用的时候，用括号代替
		System.out.println((5>2) &&(2<3)||(!false));//true
	}
}























