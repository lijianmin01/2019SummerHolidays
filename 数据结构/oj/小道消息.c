#include<stdio.h>
#include<stdlib.h>
typedef struct ren{
    int shu;
    int flag;
}REN;

int gcd(int a,int b)
{
    int r;
    while(a%b!=0)
    {
        r=a%b;
        a=b;
        b=r;
    }
    return b;
}

int main(void) {
    int n,k,i,j;
    int FLAG=0;
    scanf("%d %d",&n,&k);
    REN *p=(REN *)malloc(n*sizeof(REN));
    for(i=0;i<n;i++)
    {
        p[i].shu=i+2;
        p[i].flag=0;
    }
    int cnt=0;//记录所用天数
    p[k-1].flag=1;
    FLAG=0;
    for(i=0;i<n;i++)
    {
        if(gcd(p[k-1].shu,p[i].shu)==1)
        {
            p[i].flag=1;
            FLAG++;
        }
    }
    cnt++;
    while(FLAG!=n)
    {
        
    }
    // while(FLAG!=n)
    // {
    //     FLAG=0;
    //     for(i=0;i<n;i++)
    //     {
    //         if(p[i].flag==1)
    //         {
    //             FLAG++;
    //         }else
    //         {
    //             for(j=0;j<n&&j!=i&&p[j].flag>0;j++)
    //             {
    //                 if(gcd(p[i].shu,p[j].shu)==1)
    //                 {
    //                     FLAG++;
    //                     p[i].flag=1;
    //                     p[j].flag++;
    //                     break;
    //                 }
    //             }
    //         }
    //     }
    // }
    for(i=0;i<n;i++)
    {
        if(cnt<p[i].flag)
        {
            cnt=p[i].flag;
        }
    }
    printf("%d\n",cnt);
    free(p);
    return 0;
}