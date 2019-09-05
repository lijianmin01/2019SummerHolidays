#include<stdio.h>

int main(void)
{
    int n,k;
    scanf("%d %d",&n,&k);
    int cnt=1;
    int k1=k,k2=k;
    if(n<=3)
    {
        if(k==2)
        {
            cnt=1;
        }else
        {
            cnt=2;
        }
        
    }else
    {
        while((2>(k1+1)/2)&&((k2+1)*2>n))
        {
            k1=(k1+1)/2;
            k2=(k2+1)*2>n;
            cnt++;
        }
    }
    
    printf("%d\n",cnt);
    return 0;
}