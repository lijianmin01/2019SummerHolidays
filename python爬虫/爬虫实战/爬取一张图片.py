import urllib.request
url="http://placekitten.com/90/300"
response=urllib.request.urlopen(url)
cat=response.read()
with open("f/cat_400.jpg","wb")as f:
    f.write(cat)