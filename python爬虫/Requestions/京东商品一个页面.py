import requests
url="https://item.jd.com/7552880.html?extension_id=" \
    "eyJhZCI6IjQ3IiwiY2giOiIyIiwic2t1IjoiNzU1Mjg4MCIs" \
    "InRzIjoiMTU2NDExNTQ4NCIsInVuaXFpZCI6IntcImNsaWNr" \
    "X2lkXCI6XCJkZjNlN2NjNC01NDRjLTQ1M2YtYWQxYi1jZjUw" \
    "NWFmNjBiMTVcIixcIm1hdGVyaWFsX2lkXCI6XCI1NDc5Nzkw" \
    "NzRcIixcInBvc19pZFwiOlwiNDdcIixcInNpZFwiOlwiNzJl" \
    "NWVlMTMtNWI5ZC00MzMwLTllYmQtNjFhNTc5YzczYTAyXCJ9" \
    "In0=&jd_pop=df3e7cc4-544c-453f-ad1b-cf505af60b15" \
    "&abt=0"
try:
    r=requests.get(url)
    r.raise_for_status()
    r.encoding=r.apparent_encoding
    print(r.text[:1000])
except:
    print("爬取失败")


