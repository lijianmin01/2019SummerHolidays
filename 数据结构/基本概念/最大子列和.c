/*
    给定N个整数的序列{A1,A2,.....,An}
    求函数f(i,j)=max{0,(k=i~j)Ak}的最大值
*/

int MaxSubseqSum1(int A[],int N)
{
    int ThisSum,maxsum=0;
    int i,j,k;
    for(i=0;i<N;i++)
    {
        for(j=i;j<=N;j++)
        {
            //i是子列最左端位子，j是子列最右端位置
            //ThisSum是从A[i]adoA[j]的子列和
            ThisSum=0;
            for(k=i;k<=j;k++)
            {
                ThisSum+=A[k];
                if(ThisSum>maxsum)
                {
                    maxsum=ThisSum;
                }
            }
        }
    }
}

int MaxSubseqSum2(int A[],int N)
{
    int ThisSum,maxsum=0;
    int i,j,k;
    for(i=0;i<N;i++)
    {
        ThisSum=0;
        for(j=i;j<=N;j++)
        {
            ThisSum+=A[j];
            //对于相同的i不同的j，只要在j-1循环基础上累加1项即可
            if(ThisSum>maxsum)
            {
                maxsum=ThisSum;
            }
        }
    }
}

//分而治之
int max3(int a,int b,int c)
{
    return a>b ? a>c ? a:c:   b>c?b:c;
}
// int DivideAndConquer(int list[],int left,int right)
// {
//     //分治求list[left]到list[right]的最大字列和
//     int MaxLeftSum,MaxRightSum;//存放跨界线结果
//     int LeftBorderSum,RightBorderSum;
//     int center,i;
//     if(left==right)
//     {
//         //递归的终止条件，子列只有1个数字
//         if(list[left]>0)
//         {
//             return list[left];
//         }else
//         {
//             return 0;
//         }
//     }
// }

//算法4：在线处理:在任何一个地方，算法都能给出正确的，当前的解
int MaxSubseqSum4(int A[],int N)
{
    int ThisSum,MaxSum;
    int i;
    ThisSum=MaxSum=0;
    for(i=0;i<N;i++)
    {
        ThisSum+=A[i];//向右累加
        if(ThisSum>MaxSum)
        {
            MaxSum=ThisSum;//发现更大则更新当前你结果
        }else if(ThisSum<0)
        {
            //如果当前子列结果为负，则不可能是后面部分和增大，抛弃之
            ThisSum=0;
        }
    }
    return MaxSum;//T(N)=O(N);
}
#include<stdio.h>

int main(void)
{
    int nums[8]={4,-3,5,-2,-1,2,6,-2};
    int nums1[8]={-1,3,-2,4,-6,1,6,-1};
    printf("%d\n",MaxSubseqSum4(nums1,8));
    return 0;
}