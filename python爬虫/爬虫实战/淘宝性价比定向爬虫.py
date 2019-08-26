"""
功能描述：
    目标：获取淘宝搜索页面的信息，提取其中的商品名称和价格

程序的结构设计
    步骤1：提交商品搜索请求，循环获取页面
    步骤2：对于每个页面，提取商品名称和价格信息
    步骤3：将信息输出到屏幕上
"""
import requests
import re

def getHTMLText(url):
    try:
        r=requests.get(url,timeout=30)
        r.raise_for_status()
        r.encoding=r.apparent_encoding
        return r.text
    except:
        return ""

def parsePage(ilt,html):#关键
    try:
        plt=re.findall(r'\"view_price\"\:\"[\d\.]*\"',html)
        tlt=re.findall(r'\"raw_title\"\:\".*?\"',html)
        for i in range(len(plt)):
            price=eval(plt[i].split(':')[1])
            title=eval(tlt[i].split(':')[1])
            ilt.append([price,title])
    except:
        print("")

def printGoodsList(ilt):
    tplt="{:4}\t{:8}\t{:16}"
    print(tplt.format("序号","价格","商品名称"))
    count=0
    for q in ilt:
        count=count+1
        print(tplt.format(count,q[0],q[1]))

def main():
    goods='书包'
    depth=2
    start_url='https://search.jd.com/Search?keyword='+goods
    infoList=[]
    for i in range(depth):
        try:
            url = start_url+'&s='+str(44*i)
            html=getHTMLText(url)
            parsePage(infoList,html)
        except:
            continue
    printGoodsList(infoList)

main()