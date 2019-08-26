import requests
import urllib.request
from lxml import etree
from bs4 import BeautifulSoup

headers={
    'User-Agent': 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) '
                  'Chrome/63.0.3239.132 Safari/537.36 QIHU 360SE'
}

#确认目标链接
url="https://www.meizitu.com/a/5514.html"
#请求链接，获取源代码
response=requests.get(url,headers=headers)
#print(response)

#3、数据抽取，抽取图片链接
html=etree.HTML(response.content)   #将源代码处理为能进行数据处理的格式
imgs=html.xpath("//ur[@id='picture']/p/img") #所有图片的上层结点

src=imgs.get('src')
print(src)
alt=imgs.get('alt')
print(alt)
