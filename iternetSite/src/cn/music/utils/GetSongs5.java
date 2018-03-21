package cn.music.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mysql.jdbc.Buffer;

public class GetSongs5 {
	//设置参数(cat的id和字母的Unicode码)
	String ids[]={"1001","1002","1003","2001","2002","2003","6001","6002","6003","7001","7002","7003","4001","4002","4003"};
	int initials[]=new int[27];//65-90+0
	//设置请求头
	public URLConnection setRequestHead(String path) throws IOException{
		URL url=new URL(path);
		URLConnection con = url.openConnection();
		con.setRequestProperty("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
		con.setRequestProperty("Accept-Language","zh-CN,zh;q=0.9");
		/*openConnection.setRequestProperty("Cookie","_ntes_nnid=b17928ceb43e6bbdff608fa021158b29,1516533487358; _ntes_nuid=b17928ceb43e6bbdff608fa021158b29; __utmc=94650624; __utmz=94650624.1516586376.4.2.utmcsr=baidu|utmccn=(organic)|utmcmd=organic; _ngd_tid=ohITE4Ow8eE6NGg6UjdCzKniEoQvykmo; __remember_me=true; __e_=1516586489075; playerid=30246420; _iuqxldmzr_=32; Province=025; City=0513; vjuids=8f596c4ee.1611ceff24f.0.bf4b371c517f6; vjlast=1516608943.1516608943.30; ne_analysis_trace_id=1516608942686; s_n_f_l_n3=b48e2a2cdc9c86b21516608942694; NNSSPID=55cccbfc48ca418f83ccc54dc32ce136; __gads=ID=b75fc0a9c3de4b74:T=1516608946:S=ALNI_MZlkdAiH0f1mFvpKXD7dIDGXL8w6Q; vinfo_n_f_l_n3=b48e2a2cdc9c86b2.1.0.1516608942694.0.1516608952832; JSESSIONID-WYYY=174bvMx3ekqdBmHfQPtYzfN%2F%2FZ%2FyHy%2BfK33b7VD98bJyWR4IxH6wYsoS8E%2F2fG0oD%5CvCOAR3Jhkj%2Bqpu%2FuEbdfzrKCnaguEnDgiuf81QuKRDoc%5CcdIJWd1%2F%2Fo1Sv49u4xuuev5i1B02wczGB0kMXwAu2Hinnpp095zG70xYr%2BH%2B9EDkB%3A1516624427947; MUSIC_U=0c7c953a6700837a309785c433b0700262748ea418e4beb5af55f7530b9b04dc07c9daedea11ac2ceffbccd18328f4cbd49428f135095bbe305842396b5dfc01; __csrf=fbd3b37929d2de9a335ea8001432e92f; __utma=94650624.1750312029.1516533489.1516617806.1516622872.9; __utmb=94650624.26.10.1516622872");*/
		con.setRequestProperty("Host","music.163.com");
		con.setRequestProperty("Proxy-Connection","keep-alive");
		con.setRequestProperty("Referer","http://music.163.com/");
		con.setRequestProperty("Upgrade-Insecure-Requests","1");
		con.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/63.0.3239.132 Safari/537.36");
		return con;
	}
	//获取相关路径
	public List<String> getPath() throws IOException{
		int i;
		List<String> urls=new ArrayList<String>();
		for(i=0;i<initials.length-1;i++){
		initials[i]=65+i;
		}
		initials[i++]=0;
		int unics[]=initials;
		String path;
		for(int n=0;n<ids.length;n++){
			for(int m=0;m<unics.length;m++){
				path="http://music.163.com/#/discover/artist/cat?id="+ids[n]+"&initial="+unics[m];
				urls.add(path);
			}
		}
		return urls;
	}
	
	//开始抓取
	public void crawl(/*String url,String regex*/) throws IOException{
		List<String> pathList = getPath();
		URLConnection connection=null;
		InputStream inputStream=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		/*OutputStream outputStream=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;*/
		String line="";
		String linejoin="";
		String filename="";
		String savePath="C:\\Users\\Administrator\\Desktop";
		for (String path : pathList) { 
			String r="id=(.*?)&initial=(.*)";//以类别加字母作为文件名
			Matcher match = Pattern.compile(r).matcher(path);
			while(match.find()){
				filename=match.group(1)+match.group(2);
				}
			//设置请求相关信息
			 connection = setRequestHead(path.replace("/#", ""));
			 inputStream=connection.getInputStream();
			 isr=new InputStreamReader(inputStream,"UTF-8");
			 br=new BufferedReader(isr);
			 Matcher matcher = null;
			 String group="";
			 while((line=br.readLine())!=null){
				 linejoin+=line;
				 matcher=getSelected(linejoin, "<ul.*?m-cvrlst m-cvrlst-5 f-cb.*?>.*?</ul>");
				 while(matcher.find()){
					 group+=matcher.group();
				 }
				 matcher = getSelected(group, "<li .*?>(<div class=\"u-cover u-cover-5\">(<img.*?src=\"(.*?)\".*?>).*?</div><p>)?(<a.*?href=\"(.*?)\".*?>(.*?)</a>(.*?)?)(</p>)?</li>");
				 System.out.println(matcher.find());
				 while(matcher.find()){
					if (matcher.group(2)!=null) {
						//System.out.println(filename+"=="+matcher.group(2)+":"+matcher.group(3)+":"+matcher.group(5)+":"+matcher.group(6));
						//System.out.println(filename+"=="+matcher.group(4)+":"+matcher.group(5)+":"+matcher.group(6));
					}else{
						//System.out.println(filename+"=="+matcher.group(4)+":"+matcher.group(5)+":"+matcher.group(6));
					}
				}
				 			 }
		}
	}
	
	public Matcher getSelected(String con,String regex){
			Matcher matcher = Pattern.compile(regex).matcher(con);
			return matcher;
		}
	public static void main(String[] args) throws IOException {
		GetSongs gs=new GetSongs();
		List<String> path = gs.getPath();
		gs.crawl();
	}
}
