/*
深搜的过程关键在于记录已经用掉的左括号个数和右括号的个数，
当用过的左括号个数小于右括号则非法；
当二者个数和大于2N则非法；
当二者个数相等且数目等于2N则为合法。
*/
#include<stdio.h>
#include<string.h>
char str[10001];
char zhan[1000];
void match(char a,int cnt,int flag)
{
    if(a=='['||a=='(')
    {
        zhan[cnt++]=a;
        //printf("str[%d]~%c\n",cnt-1,a);
    }else
    {
        //zhan[cnt++]=a;
        if(a==']')
        {
            if(zhan[cnt-1]!='[')
            {
                flag=1;
            }
        }else if(a==')')
        {
            if(zhan[cnt-1]!='(')
            {
                flag=1;
            }
        }
        cnt-=1;
        //printf("str[%d]~%c  a==%c\n",cnt-1,str[cnt-1],a);
        //printf("cnt=%d\n",cnt);
        // if( (a==']'&&zhan[cnt-1]=='[') ||(a=='('&&zhan[cnt-1]==')'))
        // {
            
        //     cnt-=1;
        // }else
        // {
        //     flag=1;
        // } 
    }
    
}
int main(void) {
    int n;
    scanf("%d",&n);
    while(n--)
    {
        int flag=0;
        int i,cnt=0;
        scanf("%s",str);
        int len=strlen(str);
        if(len%2!=0)
        {
            flag=1;
        }else
        {
            if(str[0]=='['||str[0]=='(')
            {
                zhan[cnt]=str[0];
                cnt++;
            }else
            {
                flag=1;
                break;
            }
            for(i=1;i<len;i++)
            {
                match(str[i],cnt,flag);
                if(flag==1)
                {
                    break;
                }
            }
        }
        printf("i=%d\n",i);
        if(cnt!=1&&i==len-1)
        {
            flag=1;
        }
        //printf("cnt=%d\n",cnt);
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
// #include<stdio.h>
// #include<string.h>
// char str[2001];
// void panduan1(char a,int a1,int b1)
// {
//     if(a=='[')
//     {
//         a1++;
//     }else if(a=='(')
//     {
//         b1++;
//     }
//     return;
// }
// void panduan2(char a,int a1,int b1)
// {
//     if(a==']')
//     {
//         a1--;
//     }else if(a==')')
//     {
//         b1--;
//     }
//     return;
// }
// int main(void) {
//     int n;
//     int flag=0;
//     scanf("%d",&n);
//     while(n--)
//     {
//         int i,j;
//         scanf("%s",str);
//         int len=strlen(str);
//         int a1=0,b1=0;
        
//         if(len%2)
//         {
//             flag=1;
//         }else{
//             for(i=0;i<len;i++)
//             {
//                 panduan1(str[i],a1,b1);
//                 panduan2(str[i],a1,b1);
//                 if(a1>=0||b1>=0)
//                 {
//                     continue;
//                 }else
//                 {
//                     flag=1;
//                     break;
//                 }
//             }
//         }
//         if(a1!=0||b1!=0)
//         {
//             flag=1;
//         }
//         if(flag==1)
//         {
//             printf("No\n");
//         }else
//         {
//             printf("Yes\n");
//         }
        
        
//     }
//     return 0;
// }