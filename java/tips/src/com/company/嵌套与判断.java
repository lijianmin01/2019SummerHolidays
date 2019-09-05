package com.company;

import java.util.Scanner;

public class 嵌套与判断 {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int y=in.nextInt();
        int z=in.nextInt();
        int max;
        if(x>y)
        {
            if(x>z)
            {
                max=x;
            }else
            {
                max=z;
            }
        }else
        {
            if(y>z)
            {
                max=y;
            }else
            {
                max=z;
            }
        }
        System.out.println("这三个数最大是："+max);

        分段函数
        int x,f;
        Scanner in=new Scanner(System.in);
        x=in.nextInt();
        if(x<0)
        {
            f=-1;
        }else if(x==0)
        {
            f=0;
        }else
        {
            f=2*x;
        }
        System.out.println("f是："+f);
        //多分支开关 switch-case
        Scanner in=new Scanner(System.in);
        int type=in.nextInt();
        switch (type){
            case 1:{
                System.out.println("你好");
                break;
            }
            case 2:{
                System.out.println("早安");
                break;
            }
            case 3:{
                System.out.println("午安");
                break;
            }
            case 4:{
                System.out.println("晚安");
                break;
            }
            case 5:{
                System.out.println("早点睡吧");
                break;
            }
            default:
                System.out.println("");
        }
    }
}
/*
* 1、else总和最近的if匹配
*2、
// 判断语句常见问题
*忘了大括号
*错误使用== 和 =
*代码风格
* */