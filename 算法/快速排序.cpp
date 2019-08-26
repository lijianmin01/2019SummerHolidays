/*快速排序
数组排序任务可以如下完成
    1、设k=a[0]，将k挪到适当位置，使得比k小的元素都在
    k左边，比k大的元素都在k右边，和k相等的，不关心k
    左右出现即可（O(n)时间完成）
    2、把k左边的部分快速排序
    3、把k右边的部分快速排序
*/
#include<iostream>
using namespace std;

void swap(int &a,int &b)//交换变量a,b值
{
    int tmp=a;
    a=b;
    b=tmp;
}

void QuickSort(int a[],int s,int e)
{
    if(s>=e)
    {
        return;
    }
    int k=a[s];
    int i=s,j=e;
    while(i!=j)
    {
        while(j>i&&a[j]>=k)
        {
            --j;
        }
        swap(a[i],a[j]);
        while(i<j&&a[i]<=k)
        {
            ++i;
        }
        swap(a[i],a[j]);
    }//处理完成后，a[i]=k;
    QuickSort(a,s,i-1);//k左边的
    QuickSort(a,i+1,e);//k右边的
}
int a[]={93,27,30,2,8,12,2,8,30,69};
int main()
{
    int size=sizeof(a)/sizeof(int);
    QuickSort(a,0,size-1);
    for (size_t i = 0; i < size; i++)
    {
        cout<<a[i]<<",";
    }
    cout<<endl;
    return 0;
    
}