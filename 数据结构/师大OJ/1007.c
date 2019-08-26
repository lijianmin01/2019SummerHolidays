#include<stdio.h>
typedef struct Rectangle
{
    int id;
    int length;
    int wide;
}RE;
int main(int argc, char const *argv[])
{
    int n,m,i,j;
    scanf("%d",&n);
    while(n--)
    {
        scanf("%d",&m);
        int a,b,c;
        RE *p= (RE *)malloc(m*sizeof(RE));
        for(i=0;i<m;i++)
        {
            scanf("%d %d %d",&a,&b,&c);
            p->id=a;
            p->length=b;
            p->wide=c;
        }
        
    }
    return 0;
}

