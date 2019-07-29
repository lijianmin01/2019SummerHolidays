package com.company;

import java.util.Scanner;

public class StringType {
    //字符类型
    public static void main(String[] args)
    {
        /*字符串变量
        * String s;
        * String是一个类，String的变量是对象的管理者而非所有者
        * 就像数组变量是数组的管理者而非所有者一样
        * */
//        String s=new String("Hello");
//        System.out.println(s+" world");
        //in.next();读入一个单词，单词的标志是空格
        //in.nextLine();读入一整行
//        Scanner in =new Scanner(System.in);
//        String s;
//        s=in.nextLine();
//        System.out.println(s);

//        Scanner in=new Scanner(System.in);
//        String s;
//        s=in.next();
//        System.out.println(s);
//        System.out.println(s.equals("12as1"));

        /*字符串操作
        s1.compareTo(s2)~两个字符串大小比较
            如果s1比s2小，那么结果是负的；如果s1和s2相等，那么结果
         是0；如果s1比s2大，那么结果是正的
         #compareToIgnoreCase可以不区分大小写地来比较大小

         用length()函数获得String的长度 name.length();

         访问String里的字符
         s.charAt(index)
            -返回在index上的单字符
            -index的范围是0到length()-1
            -第一个字符的index是0，和数组一样
          *但是不能用for-each循环来遍历字符串
        * */
//        Scanner in=new Scanner(System.in);
//        String s1="abc";
//        //System.out.println(s1.charAt(1));
//        for(int i=0;i<s1.length();i++)
//        {
//            System.out.println(s1.charAt(i));
//        }
        /*得到子串
        s.substring(n);
            得到从n号位置到末尾的全部内容
        s.substring(b,e);
            得到从b号位置到e号位置之前的内容
        * */

        /*寻找子符


        */
    }
}
//单个字符 char//数字 字母 汉字
//支持字符运算  十六进制 十进制
//字母数字在Unicode表中是顺序排列的
//逃逸字符~跟C语言的规则一样
//比较两个String
/*
    1、用==比较的是否是同一个
    2、比较内容是否相同用 .equals来比较
*/