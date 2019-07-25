#include<stdio.h>

typedef struct LNode *list;
struct LNode{
    int Data;
    list Next;
};

//struct Lnode L;
list PtrL;

//求表长
int Length(list Ptrl)
{
    list p=Ptrl;//p指向表的第一个节点
    int j=0;
    while(p)
    {
        p=p->Next;
        j++;//当前p指向的是第J个结点
    }
    return j;
}
//按序号查找
list FindKth(int K,list PtrL)
{
    list p=PtrL;
    int i=1;
    while(p!=NULL&&i<K)
    {
        p=p->Next;
        i++;
    }
    if(i==K)
    {
        return p;//找到K个，返回指针
    }else
    {
        return NULL;
    } 
}
//按值查找
list Find( int X,list PtrL)
{
    list p=PtrL;
    while(p!=NULL&&p->Data!=X)
    {
        p=p->Next;
    }
    return p;
}

/*插入（在第i-1(1<=i<=n+1)个结点后插入之歌值为X的新结点）
1、先构造一个新结点，用S直线
2、在找到链表的第i-1个结点，用p指向
3、然后修改指针，插入结点（p之后插入新结点是s）
*/
//插入操作实现P
list Insert(int X,int i,list PtrL)
{
    list p,s;
    if(i==1)
    {
        s=(list)malloc(sizeof(struct LNode));
        s->Data=X;
        s->Next=PtrL;
        return s;
    }
    p=FindKth(i-1,PtrL);
    if(p==NULL)
    {
        printf("参数i有错");
        return NULL;
    }else
    {
        s=(list)malloc(sizeof(struct LNode));
        s->Data=X;
        s->Next=p->Next;
        p->Next=s;
        return PtrL;
    }
}

/*删除（删除链表的第i（1<=i<=n）个位置上的结点）
1、先找到链表的第i-1个结点，用p指向
2、在用指针s指向要被删除的结点（p指向下一个结点）
3、然后修改指针，删除s所指向结点
4、最后释放s所指向结点的空间
*/
//删除操作的实现
list Delete(int i,list PtrL)
{
    list p,s;
    if(i==1)
    {
        s=PtrL;
        if(PtrL!=NULL)
        {
            Ptrl=PtrL->Next;
        }else
        {
            return NULL;
        }
        free(s);
        return PtrL;
    }
    p=FindKth(i-1,PtrL);
    if(p==NULL)
    {
        printf("第%d个结点不存在",i-1);
        return NULL;
    }else if(p->Next==NULL)
    {
        printf("第%d个结点不存在",i);
        return NULL;
    }else
    {
        s=p->Next;
        p->Next=s->Next;
        free(s);
        return PtrL;
    }
    
}