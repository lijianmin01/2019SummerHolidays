package com.company;

import java.util.Scanner;

public class a {
    public static void main(String[] a)
    {
        //System.out.println("你好");
        //读入
       /* Scanner in = new Scanner(System.in);
        System.out.println("echo:"+in.nextLine());
        System.out.println("2+3="+(2+3));//5
        System.out.println("2+3"+2+3);//23
        System.out.println(2+3"=2+3="+(2+3));//5=2+3=5*/
     //  Scanner in = new Scanner(System.in);
       //System.out.println("100-"+in.nextInt()+"="+(100-in.nextInt()));
       //得输入两个33（两个数）
        //变量
        //int price;
//        price=in.nextInt();
//        System.out.println("100-"+price+"="+(100-price));
    /*变量需要一个名字，变量的名字是一种“标识符”，意思是他用来识别这个和那个
不同的名字。
    标识符有标识符的构造规则，基本的原理是：标识符只能由字母、数字和
下划线组成，数字不可以出现在第一个位置上（有的地方也叫做保留字）
*/
    //赋值
        //price=in.nextInt();
    //    int price1=0,amount;//初始化
     //   final int amount=100;//final 定义一个常量
     //   System.out.println(amount+"-"+price+"="+(amount-price));
//        amount=in.nextInt();
//        price=in.nextInt();
//        System.out.println(amount+"-"+price+"="+(amount-price));

    //浮点数
    /*身高5尺7寸
    *如果遇到一个美国人告诉你他是5英寸尺7，他身高应该是一米几呢？
    * （5+7/12）*0.3048=1.7018米；
    * */
//        int foot;
//        double inch;
//        Scanner in = new Scanner(System.in);
//        foot =in.nextInt();
//        inch =in.nextInt();
//        System.out.println(10/3);//3
//        System.out.println("foot="+foot+",inch="+inch);
//        System.out.println((foot+inch/12.0)*0.3048);
//        System.out.println(2+3*6);

    //类型转换
        /*int foot;
        double inch;
        Scanner in=new Scanner(System.in);
        foot=in.nextInt();
        inch=in.nextInt();
        System.out.println((foot+inch/12)*0.3048*100);
        System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");
 */
    //比较
    //自动售票机：根据用户的输入做出相应的动作，打印出车票并返回找零，或告知用户钱不足以出票
//      //初始化
//      Scanner in=new Scanner(System.in);
//      //读入投币金额
//        System.out.print("请投币：");
//        int amount=in.nextInt();
//        System.out.println(amount>=10);//true / flase
//       //打印车票
//        System.out.println("###############");
//        System.out.println("* Java城际车票*");
//        System.out.println("*  无指定车票 *");
//        System.out.println("*  票价10元  *");
//        System.out.println("###############");
//        //计算并打印找零
//        System.out.println("找零："+(amount-10));

    //做判断
//        Scanner in=new Scanner(System.in);
//        System.out.print("请投币：");
//        int amount=in.nextInt();
//        while(amount<10)
//        {
//            amount+=in.nextInt();
//        }
//        System.out.println("###############");
//        System.out.println("* Java城际车票*");
//        System.out.println("*  无指定车票 *");
//        System.out.println("*  票价10元  *");
//        System.out.println("###############");
//        //计算并打印找零
//        System.out.println("找零："+(amount-10));

        final int MINNOR=35;
        System.out.print("请输入你的年龄：");
        Scanner in =new Scanner(System.in);
        int age=in.nextInt();
        System.out.println("你的年龄是"+age);
        if(age<MINNOR)
        {
            System.out.println("年龄是美好的,");
        }
        System.out.println("年龄决定了你的精神世界，要好好珍惜哟~");
    }

}
