import requests
form lxml import etree

headers={
    #'use-agent':'Mozilla/5.0(Windows NT 6.1;Win64:x64) AppleWebKit/537.36(KHTML,)'
    'User-Agent': 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) '
                  'Chrome/63.0.3239.132 Safari/537.36 QIHU 360SE'
    'referer''http://www.mzitu.com/tag/ugirls/'
}

#1、确认目标链接
#http://www.mzitu.com/tag/ugirls/page/3/
#1~17
for page in range(1,2):
    url=f"http://www.mzitu.com/tag/ugirls/page/{page}"#3.6+新特性 插值字符串
    #print(url)

#2、请求链接，获取源代码
    response=requests.get(url,headers=headers)

#3、数据抽取，抽取图片链接
    html=etree.HTML(response.content)   #将源代码处理为能进行数据处理的格式
    imgs=html.xpath("//ur[@id='pind']/li/a/img") #所有图片的上层结点

    for img in imgs:
        url=img.get("data-original")
        name=img.get("alt")
    try:
    #4、爬取图片
        response=requests.get(ur,headers=headers)

    #5、保存图片
        with open(f"images/{name}.jpg",'wb')as f:
            f.write(response.content)#写入图片数据流
    except:
        pass
