package com.iternetSite.controller;

/*public class BaiduMusicAPI
{
    /// <summary>
    /// �������� ������ҳ�ķ�ʽ
    /// </summary>
    /// <param name="key"></param>
    public static List<MMusic> Search(string key, int page)
    {
        List<MMusic> musics = new List<MMusic>();

        if (page <= 0)
        {
            page = 1;
        }

        // http://music.baidu.com/search/song?s=1&key=%E5%87%89%E5%87%89&jump=0&start=0&size=20&third_type=0
        string url = string.Format("http://music.baidu.com/search/song?s=1&key={0}&jump=0&start={1}&size=20&third_type=0", key, (page - 1) * 20);

        MyHttpClient client = new MyHttpClient(url);
        string html = client.ExecuteGet();

        HtmlDocument doc = new HtmlDocument();
        doc.LoadHtml(html);
        HtmlNode node = doc.DocumentNode;
        HtmlNode resultdiv = node.SelectSingleNode("//div[@monkey='result-song']/div");
        HtmlNodeCollection list = resultdiv.SelectNodes("//div[@class='song-item clearfix yyr-song']");

        MMusic model = null;
        for (int i = 0; i < list.Count; i++)
        {
            model = new MMusic();
            HtmlNode temp = list[i];
            string title = temp.SelectSingleNode("//span[@class='song-title']/a/em").InnerText;
            string singer = temp.SelectSingleNode("//span[@class='singer']/span[@class='author_list']/a").GetAttributeValue("title", "");
            string playurl = temp.SelectSingleNode("//a[@class='list-micon icon-play']").GetAttributeValue("href", "");

            model.Title = title;
            model.Singer = singer;
            model.PlayUrl = playurl;
            musics.Add(model);
        }

        return musics;
    }

    // ��ȡ�б�
    // ������	type = 1-�¸��,2-�ȸ��,11-ҡ����,12-��ʿ,16-����,21-ŷ��������,22-�����ϸ��,23-���Գ���,24-Ӱ�ӽ�����,25-���������
    // size = 10 //������Ŀ����
    // offset = 0 //��ȡƫ��
    // http://tingapi.ting.baidu.com/v1/restserver/ting?format=json&callback=&from=webapp_music&method=baidu.ting.billboard.billList&type=1&size=10&offset=0

    /// <summary>
    /// ��ȡ�б� type = 1-�¸��,2-�ȸ��....
    /// </summary>
    /// <param name="offset"></param>
    /// <returns></returns>
    public static MSongList GetSongList(int type, int size, int offset)
    {
        MSongList list = new MSongList();
        string url = string.Format("http://tingapi.ting.baidu.com/v1/restserver/ting?format=json&callback=&from=webapp_music&method=baidu.ting.billboard.billList&type={0}&size={1}&offset={2}", type, size, offset);
        MyHttpClient client = new MyHttpClient(url);
        string html = client.ExecuteGet();

        list = JsonConvert.DeserializeObject<MSongList>(html);

        return list;
    }

    // ����
    // ������query = '' //�����ؼ���
    // http://tingapi.ting.baidu.com/v1/restserver/ting?format=json&callback=&from=webapp_music&method=baidu.ting.search.catalogSug&query=%E4%B8%80%E5%89%91%E8%BD%BB%E5%AE%89

    /// <summary>
    /// �������������
    /// </summary>
    /// <param name="key"></param>
    public static MQuerySong QuerySong(string key)
    {
        MQuerySong model = new MQuerySong();
        string url = string.Format("http://tingapi.ting.baidu.com/v1/restserver/ting?format=json&callback=&from=webapp_music&method=baidu.ting.search.catalogSug&query={0}", key);
        MyHttpClient client = new MyHttpClient(url);
        string html = client.ExecuteGet();
        html = html.Replace("(", string.Empty).Replace(");", string.Empty);

        model = JsonConvert.DeserializeObject<MQuerySong>(html);

        return model;
    }

    // ����
    // ������songid = 877578 //����id
    // http://tingapi.ting.baidu.com/v1/restserver/ting?format=json&callback=&from=webapp_music&method=baidu.ting.song.play&songid=877578

    /// <summary>
    /// ���Ÿ�����Ϣ
    /// </summary>
    /// <param name="songid"></param>
    /// <returns></returns>
    public static MPlaySong PlaySong(string songid)
    {
        MPlaySong model = new MPlaySong();
        string url = string.Format("http://tingapi.ting.baidu.com/v1/restserver/ting?format=json&callback=&from=webapp_music&method=baidu.ting.song.play&songid={0}", songid);
        MyHttpClient client = new MyHttpClient(url);
        string html = client.ExecuteGet();
        html = html.Replace("(", string.Empty).Replace(");", string.Empty);
        model = JsonConvert.DeserializeObject<MPlaySong>(html);

        return model;
    }

    // ���
    // ������songid = 877578 //����id
    // http://tingapi.ting.baidu.com/v1/restserver/ting?format=json&callback=&from=webapp_music&method=baidu.ting.song.lry&songid=877578

    /// <summary>
    /// �����Ϣ
    /// </summary>
    /// <param name="songid"></param>
    /// <returns></returns>
    public static MPlaySongLrc PlaySongLRC(string songid)
    {
        MPlaySongLrc model = new MPlaySongLrc();
        string url = string.Format("http://tingapi.ting.baidu.com/v1/restserver/ting?format=json&callback=&from=webapp_music&method=baidu.ting.song.lry&songid={0}", songid);
        MyHttpClient client = new MyHttpClient(url);
        string html = client.ExecuteGet();
        model = JsonConvert.DeserializeObject<MPlaySongLrc>(html);

        return model;
    }


    // ����
    // ������	songid = 877578//����id
    // _t = 1430215999,, //ʱ���
    // http://tingapi.ting.baidu.com/v1/restserver/ting?format=json&callback=&from=webapp_music&method=baidu.ting.song.downWeb&songid=73866069&bit=24&_t=1492565440

    /// <summary>
    /// ���ظ��������� ������
    /// </summary>
    /// <param name="songid"></param>
    /// <returns></returns>
    public static string DownLoadSong(string songid, string filepath)
    {
        string _t = StringUtils.GetTimeStamp(true);
        string url = string.Format("http://tingapi.ting.baidu.com/v1/restserver/ting?format=json&callback=&from=webapp_music&method=baidu.ting.song.downWeb&songid={0}&bit=24&_t={1}", songid, _t);

        MyHttpClient client = new MyHttpClient(url, filepath, true);
        string path = client.HttpDownloadFile();

        return path;
    }

    /// <summary>
    /// ͨ��������Ϣ�е�urlȥ����
    /// </summary>
    /// <param name="url"></param>
    /// <param name="filepath"></param>
    /// <param name="api"></param>
    /// <returns></returns>
    public static string DownLoadSong(string url, string filepath, bool api)
    {
        MyHttpClient client = new MyHttpClient(url, filepath, true);
        string path = client.HttpDownloadFile();

        return path;
    }


    // ������Ϣ
    // ������	tinguid = 877578 //����ting id
    // http://tingapi.ting.baidu.com/v1/restserver/ting?format=json&callback=&from=webapp_music&method=baidu.ting.artist.getInfo&tinguid=877578

    /// <summary>
    /// ������Ϣ
    /// </summary>
    /// <param name="ting_id"></param>
    /// <returns></returns>
    public static MArtistInfo GetArtistInfo(string ting_id)
    {
        MArtistInfo model = new MArtistInfo();
        string url = string.Format("http://tingapi.ting.baidu.com/v1/restserver/ting?format=json&callback=&from=webapp_music&method=baidu.ting.artist.getInfo&tinguid={0}", ting_id);
        MyHttpClient client = new MyHttpClient(url);
        string json = client.ExecuteGet();

        json = json.Replace("(", string.Empty).Replace(");", string.Empty);

        model = JsonConvert.DeserializeObject<MArtistInfo>(json);

        return model;
    }

    // ���ָ����б�
    // ������	tinguid = 877578//����ting id
    // limits = 6//������Ŀ����
    // 
    // http://tingapi.ting.baidu.com/v1/restserver/ting?format=json&callback=&from=webapp_music&method=baidu.ting.artist.getSongList&tinguid=110942340&limits=20&use_cluster=1&order=2

    /// <summary>
    /// ��ȡ���ָ����б�
    /// </summary>
    /// <param name="tinguid"></param>
    /// <param name="limits"></param>
    /// <returns></returns>
    public static MSingerSongList GetSingerSongs(string tinguid, int limits)
    {
        MSingerSongList model = new MSingerSongList();
        string url = string.Format("http://tingapi.ting.baidu.com/v1/restserver/ting?format=json&callback=&from=webapp_music&method=baidu.ting.artist.getSongList&tinguid={0}&limits={1}&use_cluster=1&order=2", tinguid, limits);

        return model;
    }
}*/