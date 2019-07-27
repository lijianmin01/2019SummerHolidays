package com.company;

import java.util.Scanner;

public class 数组 {
    public static void main(String[] args)
    {
        //投票统计
        /*写一个程序，输入数量不确定的[0,9]范围内的整数，统计每一种
        数字出现的次数，输入-1表示结束
        * */
//        int x;
//        Scanner in =new Scanner(System.in);
//        int[] nums=new int[10];
//        x=in.nextInt();
//        for(int j=0;j<nums.length;j++)
//        {
//            System.out.println(nums[j]);
//        }
//        while(x!=-1)
//        {
//            if(x>=0&&x<10)
//            {
//                nums[x]++;
//            }
//            x=in.nextInt();
//        }
//        //System.out.println(nums.length);
//        for(int i=0;i<nums.length;i++)
//        {
//            System.out.println(i+":"+nums[i]);
//        }

        //直接初始化数组
        /*new 创建数组会得到默认的0值
        * int[] scores={87,98,67,54,65,76,87,99};
        * 直接用大括号给出数组的所有元素的初始值
        * 不需要给出数组大小，编译器替你数数~length
        * */
//        int[] scores={87,98,67,54,65,76,87,99};
//        System.out.println(scores.length);
//        for(int i=0;i<scores.length;i++)
//        {
//            System.out.print(scores[i]+" ");
//        }
        //数组名只是管理者，Java可以有多个管理者
        //数组名比较是否共同管理同一个数组

        //仅判断一个数是否在数组中
//        boolean found=false;
//        int[] nums={1,11,111,1111,11111,111111};
//        Scanner in=new Scanner(System.in);
//        int x=in.nextInt();
//        while(x!=-1)
//        {
//            for(int k:nums)
//            {
//                if(k==x)
//                {
//                    found=true;
//                    break;
//                }
//            }
//            if(found==true)
//            {
//                System.out.println(x+"存在数组中");
//            }else{
//                System.out.println(x+"不存在存在数组中");
//            }
//            found=false;
//            x=in.nextInt();
//        }

        //判断一个数是否是素数~无需到x-1,到sqrt(x)就够了
//        boolean isPrime=true;
////        Scanner in=new Scanner(System.in);
////        int x=in.nextInt();
////        for(int i=3;i<Math.sqrt(x);i+=2)
////        {
////            if(x%i==0)
////            {
////                isPrime=false;
////                brea;
////            }
////        }

        //二维数组
        /*
        * int[] a=new int[3][5];
        * 通常理解为a为一个3行5列的矩阵
        * 二维数组的初始化
        * int[][] a={{1,2,3,4},{1,2,3},};
        * *编译器来数数
        * *每行一个{}，逗号分隔
        * *最后的逗号可以存在，有古老的传统
        * *如果省略，表示补零
        * */
    }
}
/*定义数组变量
<类型>[] <名字>=new <类型>[元素个数]
int[] grades=new int[100];
double[] averages=new double[20];
    *元素个数必须是整数
    *元素个数必须给出
    *元素个数可以是变量

length
每个数组有一个内部成员length,会告诉你它的元素数量——名字.length

 * */
