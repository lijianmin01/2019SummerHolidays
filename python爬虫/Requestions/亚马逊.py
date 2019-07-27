import requests
url="https://www.amazon.cn/dp/B015DRLFLC/ref=sr_1_1?__mk_zh_CN=%E4%BA%9A%E9%A9%AC%E9%80%8A%E7%BD%91%E7%AB%99&crid=1PWA6PR0MSVMB&keywords=%E8%8B%B9%E6%9E%9C6s+plus+128g&qid=1564116877&s=gateway&sprefix=%E8%8B%B9%E6%9E%9C6%2Caps%2C265&sr=8-1"
try:
    kv={'user-agent':'Mozilla/5.0'}
    r=requests.get(url,headers=kv)
    r.raise_for_status()
    r.enconding=r.apparent_enconding
    print(r.text[1000:2000])
except:
    print("爬取失败")

