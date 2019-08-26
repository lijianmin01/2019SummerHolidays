'''
    功能描述：
        目标：获取上交所和深交所所有股票的名称和交易信息
        输出：保存在文件中
        技术路线：requests-bs4-re

    候选数据网站的选择：
        新浪股票：http://finace.sina.com.cn/stock/
        百度股票：http://gupiao.baidu.com/stock/

    候选数据网络的选择：
    选区原则：股票信息静态存在与HTML页面中，非JS代码生成，
    没有Robots协议限制

    程序的结构设计
    步骤一：从东方财富网获取股票列表
    步骤二：根据股票列表逐个到百度股票获取个股信息
    步骤三：将结果存储到文件中
'''
import requests
from bs4 import  BeautifulSoup
import traceback
import re



