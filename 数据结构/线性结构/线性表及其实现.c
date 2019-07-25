#include<stdio.h>

//插入操作的实现
void Inset(ElementType X,int i,List Ptrl)
{
    int j;
    //表空间已满    不能插入
    if(Ptrl->Last==MAXSIZE-1)
    {
        printf("表满");
        return ;
    }
    //检查位置的合法性
    if(i<1||i>Ptrl->Last+2)
    {
        printf("位置不合法");
        return ;
    }
    //将ai~an顺序向后移动
    //新元素插入
    //Last仍指向最后的元素
    for(j=Ptrl->last;j>=i-1;j--)
    {
        Ptrl->Data[j+1]=Ptrl->Data[j];
    }
    Ptrl->Data[i-1]=X;
    Ptrl->Last++;
    return ;
}
//删除（删除表的第i(1<=i<=n)个位置上的元素）
void Delete(int i,List PtrL)
{
    int j;
    if(i<i||PtrL->Last+1)
    {
        //检查空表及删除位置的合法性
        printf("不存在第%d个元素"，i);
        return ;
    }
    for(j=i;j<=PtrL->Last;j++)
    {
        PtrL->Data[j-1]=PtrL->Data[j];
        //将ai+1~an顺序向前移动
    }
    PtrL->Last--;
    return ;
}

int main(void)
{

    return 0;
}