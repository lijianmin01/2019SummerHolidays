package com.company;

import java.util.Scanner;
//char-->int-->double
public class MakeDef {
    public static boolean isPrime(int i)
    {
        boolean isPrime=true;
        for (int k=2;k<i;k++)
        {
            if(i%k==0)
            {
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static int MyAdd1(int n,int m)
    {
       int sum=0;
       for (int i=n;i<=m;i++)
       {
           sum+=i;
       }
       return sum;
    }

    public static void main(String[] a)
    {
        Scanner in=new Scanner(System.in);
        System.out.println(MyAdd1(1,10));
        System.out.println(MyAdd1(20,30));
        System.out.println(MyAdd1(35,45));
    }
    //本地变量
    /*
        -函数每次每次运行，在这个空间中
        的变量，是函数的这次运行所独有的，称为本地变量
        -定义在函数内部的变量就是本地变量
        -参数也是本地变量
        -生存域与生存期间

        *程序运行进入这个快之前，其中的变量不存在了，离开这个快，其中的
    变量消失了
        *快外面定义的变量在里面仍然有效
        *不能在一个快内定义同名的变量，也不能定义快外面定义过的变量
        *参数进入函数是就被初始化啦
    */
    //Java语言在调用函数时，永远只能传值给函数

//        Scanner in=new Scanner(System.in);
//        int m=in.nextInt();
//        int n=in.nextInt();
//        if(n==1) m=2;
//        int cnt=0;
//        int sum=0;
//        for(int i=m;i<=n;i++)
//        {
//            if(isPrime(i))
//            {
//                cnt++;
//                sum+=i;
//            }
//        }
//        System.out.println("在"+m+"和"+n+"之间有"+cnt+"个素数");
//    }
}
