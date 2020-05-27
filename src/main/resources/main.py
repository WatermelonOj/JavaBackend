from urllib import request
import json
import time
import datetime
import ssl
ssl._create_default_https_context = ssl._create_unverified_context
for i in range(3):
    ss = (datetime.datetime.now() + datetime.timedelta(days=30 * i)).strftime('%Y-%m')

    url = 'https://ac.nowcoder.com/acm/calendar/contest?token=&month=' + ss
    head = {}
    # 写入User Agent信息
    head[
        'User-Agent'] = 'Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.168 Safari/537.36'
    req = request.Request(url, headers=head)
    response = request.urlopen(req)
    html = response.read().decode('utf-8')
    datajson = json.loads(html)
    for d in datajson["data"]:
        print(d)
