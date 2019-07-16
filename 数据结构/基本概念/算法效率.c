/*写程序计算给定多项式在给定点x处的值
    f(x)=a0+a1x+......+a(n-1)x^(n-1)+an^n
*/
#include<stdio.h>
#include <math.h>

double f1(int n,double a[],double x)
{
    int i;
    double p=a[0];
    for(i=0;i<=n;i++)
    {
        p+=(a[i]*pow(x,i));
    }
    return p;
}

double f2(int n,double a[],double x)
{
    int i;
    double p=a[n];
    for(i=n;i>0;i--)
    {
        p=a[i-1]+x*p;
    }
    return p;
}
int main(void) {

    return 0;
}