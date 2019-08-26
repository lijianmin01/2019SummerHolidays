#include<stdio.h>
int main(void)
{
    int n;
    scanf("%d",&n);
    while(n--)
    {
        int cnt,i;
        scanf("%d",&cnt);
        for(i=1;i<cnt;i+=2)
        {
            printf("%d ",i);
        }
        printf("\n");
        for(i=2;i<=cnt;i+=2)
        {
            printf("%d ",i);
        }
        printf("\n");
        printf("\n");
    }
    getchar();
    return 0;
}