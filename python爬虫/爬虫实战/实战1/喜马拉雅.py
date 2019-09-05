import requests

headers={
    'User-Agent': 'Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) '
                  'Chrome/63.0.3239.132 Safari/537.36 QIHU 360SE'
}
url="https://www.ximalaya.com/youshengshu/26044504/"
response=requests.get(url,headers=headers)

audio_data=response["data"]["tracksAudioPlay"].josn()

for audio in audio_data:
    print(audio)

    music_url=audio["src"]
    music_name=audio["title"]

    music_content=requests.get(music_url).content

    #文件保存
    with open("music/"+music_name+'.m4a',"wb") as f:
        f.write(music_content)
