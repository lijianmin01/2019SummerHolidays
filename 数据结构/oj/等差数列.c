#include<stdio.h>
int main(void)
{
    long long a,b,c;
    scanf("%lld %lld %lld",&a,&b,&c);
    long long cnt=b-a;
    long long sum=0;
    sum=a*c+cnt*c*(c-1)/2;
    printf("%lld\n",sum);
    return 0;
}