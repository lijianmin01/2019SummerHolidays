'''
搜索引擎关键词提交接口
百度：http://www.baidu.com/s?wd=keyword
360:http://www.so.com/s?q=keyword

'''
#百度搜索
import requests
keyword=input()
#keyword="python"
try:
    kv={'wd':keyword}
    r=requests.get("http://www.baidu.com/s",params=kv)
    print(r.request.url)
    r.raise_for_status()
    print(len(r.text))

except:
    print("爬取失败")