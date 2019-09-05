import requests
from bs4 import BeautifulSoup
import urllib.request

headers={
    'User-Agent': 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) '
                  'Chrome/63.0.3239.132 Safari/537.36 QIHU 360SE'
}
url="https://www.bku7.com/tupian/58569.html"

r=requests.get(url,headers)
r.encoding=r.apparent_encoding

soup=BeautifulSoup(r.text,"html.parser")

img_list=soup.find_all(["img",'class="videopic lazy"'])
x=1
for img in img_list:
    url1=img.get("data-original")
    name=img.get("title")

    img_content=requests.get(url1).content

    with open("imgs\\"+name,"wb")as f:
        f.write(img_content)
    print(x)
    x=x+1




# for image in img_list:
#     urllib.request.urlretrieve(image['data-original'], "F:\\大二上\\2019SummerHolidays\\新建文件夹\\新建文件夹\\imgs\\%s.jpg" % (x))
#     x += 1
#     print(x)
#
#     """
#     <img class="videopic lazy" src="https://mmtp1.com/fulitu/luanlun/618/20.jpg"
#     data-original="https://mmtp1.com/fulitu/luanlun/618/20.jpg" title="长田岭之骚女1" style="">
