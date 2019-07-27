package com.company;

import java.util.Scanner;

public class 循环 {
    public static void main(String[] a)
    {
        //程序读入一个正整数，然后输出这个正整数
//        Scanner in=new Scanner(System.in);
//        int x=in.nextInt();
//        int x1=x;
//        int cnt=0;
//        while(x>=0)
//        {
//            x/=10;
//            cnt++;
//            if(x==0)
//            {
//                break;
//            }
//        }
//        System.out.printf("x是"+cnt+"位数");

        //计算循环
//        int count=100;
//        while(count>0)
//        {
//            count=count-1;
//            System.out.println(count);
//        }
//        System.out.println("发射~");

        //计算平均数
//        int x;
//        int cnt=0,sum=0;
//        Scanner in = new Scanner(System.in);
//        x=in.nextInt();
//        while(x!=-1)
//        {
//            cnt++;
//            sum+=x;
//            x=in.nextInt();
//        }
//        System.out.println("这"+cnt+"的平均数是："+(1.0*sum/cnt));

        //对整数的分解
//        Scanner in = new Scanner(System.in);
//        int x=in.nextInt();
//        int x1=x;
//        while(x1>0)
//        {
//            System.out.println(x1%10+" ");
//            x1/=10;
//        }
        //阶乘
//        Scanner in=new Scanner(System.in);
//        int sum=1;
//        int n=in.nextInt();
//        for(int i=1;i<=n;i++)
//        {
//            sum*=i;
//        }
//        System.out.println(n+"的阶乘结果是"+sum);
        //素数
//        Scanner in=new Scanner(System.in);
//        int x=in.nextInt();
//        int flag=0;
//        for(int i=2;i*i<=x;i++)
//        {
//            if(x%i==0)
//            {
//                flag=1;
//                break;
//            }
//        }
//        if(flag==0)
//        {
//            System.out.println("是素数");
//        }else{
//            System.out.println("不是");
//        }

        //多重循环
//        for(int j=2;j<=100;j++)
//        {
//            int flag=0;
//            for(int i=2;i*i<=j;i++)
//            {
//                if(j%i==0)
//                {
//                    flag=1;
//                    break;
//                }
//            }
//            if(flag==0)
//            {
//                System.out.print(j+" ");
//            }
//        }
        //最大公约数
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        /*辗转相除法
        * 1、如果b等于0，计算结束，a就是最大公约数
        * 2、否则，计算a除以b的余数，让a等于b,而b等于那个余数
        * 3、回到第一步
        * */
        while(y!=0)
        {
            int a1=y;
            y=x%y;
            x=a1;
        }
        System.out.println(x);
    }
}
//while
//do-while
//while==for
//break:跳出循环
//continue：跳出循环这一轮剩下的语句进入下一轮
//逻辑运算
/*
* ！     逻辑非
* ||     逻辑或
* &&     逻辑与
* 优先级：！>&&>||
* */