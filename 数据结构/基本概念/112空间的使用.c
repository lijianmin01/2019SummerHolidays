/*写程序实现一个函数PrintN，使得传入一个正整数为N后，能够顺序的打印1到N的全部整数*/
#include<stdio.h>
//循环实现
void PrintN1(int n)
{
    int i;
    for ( i = 1; i <= n; i++)
    {
        /* code */
        printf("%d ",i);
    }
}
//递归实现
void PrintN2(int n)
{
    if(n)
    {
        PrintN2(n-1);
        printf("%d ",n);
    }
}
int main(void)
{
    int n;
    scanf("%d",&n);
    PrintN1(n);
    PrintN2(n);
    return 0;
}