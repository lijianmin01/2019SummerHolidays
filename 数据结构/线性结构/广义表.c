#include<stdio.h>

typedef struct GNode *GList;
struct GNode
{
    int tag;//标志域：0表示的结点是单元素，i表示的结点是广义表
    union {
        //子表指针域sublist与单元素数据域Data复用，即公用存储空间
        int Data;
        GList SubList;
    }URegion;
    GList Next;//指向后续结点
};

int main(void) {
    return 0;
}