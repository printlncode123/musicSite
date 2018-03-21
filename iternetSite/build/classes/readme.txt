网易云入口：http://music.163.com/
爬取网易云歌单的数据
1.通过网易云入口爬取歌单地址网页(源地址，带爬取地址)
2.将带爬取的封装到一个数组中(带爬取地址网页有嵌套许多需要的地址，待下次爬取)
3.需要爬取歌单页的歌单(歌曲图，名称地址，在线听的人数等等)
使用webmagic框架

网易音乐大类别匹配规则：<dt><i[^>]*class="(u-icn)\s\1-\d+"></i>(.*?)</dt>

//hsr是httpServletRequest
String localAddr = hsr.getLocalAddr();//服务器端ip
String localName = hsr.getLocalName();//服务器端主机名
String remoteAddr = hsr.getRemoteAddr();//客户端ip
String remoteHost = hsr.getRemoteHost();//客户端主机名