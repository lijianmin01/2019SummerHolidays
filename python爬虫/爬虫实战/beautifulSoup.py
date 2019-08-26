import requests
#from bs4 import BeautifulSoup
from lxml import etree

headers={
    'User-Agent': 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) '
                  'Chrome/63.0.3239.132 Safari/537.36 QIHU 360SE'
}
url="https://www.meizitu.com/a/5514.html"

r=requests.get(url,headers=headers)
#r.encoding=r.apparent_encoding
demo=r.text


html=etree.HTML(r.content)   #将源代码处理为能进行数据处理的格式
imgs=html.xpath("//ur[@class='postContent']/p/div/img") #所有图片的上层结点
print(imgs)

# for img in imgs:
#     url = img.get("data-original")
#     name = img.get("alt")
#     response=requests.get(url,headers=headers)



















#soup=BeautifulSoup(demo,"html.parser")
#print(soup.title.string)
"""
.contents   子节点的列表，将<tag>所有儿子结点存入列表
.children   子节点的迭代类型，与.contents类似，用于循环遍历儿子结点
.descendants子孙节点的迭代类型，包含所有子孙节点，用于循环遍历
"""
#print(soup.div.next_sibling)