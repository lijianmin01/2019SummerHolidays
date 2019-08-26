import requests
from bs4 import BeautifulSoup
import urllib.request

headers={
    'User-Agent': 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) '
                  'Chrome/63.0.3239.132 Safari/537.36 QIHU 360SE'
}
url=f"https://www.meizitu.com/a/5514.html"

r=requests.get(url,headers=headers)
r.encoding=r.apparent_encoding
demo=r.text

# soup=BeautifulSoup(demo,"html.parser")
# # herf=soup.find(id="picture")

soup=BeautifulSoup(demo,"html.parser")
img_list = soup.find_all('img')
#all_image = soup.find_all('img',class_ = "BDE_Image")
x=1
# for img in img_list:
#     #print(img['src'])
#     ata = img['src']  # 图片的URL

for image in img_list:
    urllib.request.urlretrieve(image['src'], "F:\\大二上\\2019SummerHolidays\\python爬虫\\爬虫实战\\imgs\\%s.jpg" % (x))
    x += 1
    print(x)


