package com.company;

import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        int[][] nums=new int[3][3];
        int cnt=0;//用于记录获胜方
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                nums[i][j]=in.nextInt();
            }
        }
        boolean flag=false;
        //判断行
        for(int i=0;i<3;i++)
        {
            if(nums[i][0]==nums[i][1]&&nums[i][0]==nums[i][2])
            {
                flag=true;
                cnt=nums[i][0];
                break;
            }
        }
        //如果没有符合条件的，在判断列
        if(flag==false)
        {
            for(int i=0;i<3;i++)
            {
                if(nums[0][i]==nums[1][i]&&nums[0][i]==nums[2][i])
                {
                    flag=true;
                    cnt=nums[0][i];
                    break;
                }
            }
        }
        //如果没有符合条件的，在分别判断对角线
        if(flag==false) {
            if ((nums[0][0] == nums[1][1]) && (nums[0][0] == nums[2][2])) {
                cnt = nums[0][0];
                flag = true;
            } else if ((nums[0][2] == nums[1][1]) && (nums[1][1] == nums[2][0])) {
                cnt = nums[0][2];
                flag = true;
            }
        }
            System.out.println(cnt + "获胜了~");

    }
}
