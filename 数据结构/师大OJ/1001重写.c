#include<stdio.h>
#include<string.h>
char str[10000];
char zhan[10000];

int main(int argc, char const *argv[])
{
    int n;
    scanf("%d",&n);
    while(n--)
    {
        int flag=0,i,len,cnt=0;
        scanf("%s",str);
        len=strlen(str);
        if(len%2!=0)
        {
            flag=1;
        }else
        {
            if(str[0]=='['||str[0]=='(')
            {
                zhan[cnt++]=str[0];
            }else
            {
                flag=1;
            }

            for(i=1;i<len;i++)
            {
                if(str[i]=='['||str[i]=='(')
                {
                    zhan[cnt++]=str[i];
                }else
                {
                    if(str[i]==']')
                    {
                        if(zhan[cnt-1]!='[')
                        {
                            flag=1;
                        }
                    }else
                    {
                        if(zhan[cnt-1]!='(')
                        {
                            flag=1;
                        }
                    }
                    if(flag==1)
                    {
                        break;
                    }
                    cnt--;
                }   
            }
        }
        if(cnt!=0)
        {
            flag=1;
        }
        if(flag==1)
        {
            printf("No\n");
        }else
        {
            printf("Yes\n");
        }
    }
    return 0;
}
