package com.crawl;

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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 爬主页的推荐
 * @author Administrator
 */
public class HomeDemo {
	public static String getDetion(String path){
		String groupurl="";
		try {
			URL url=new URL(path);
			URLConnection openConnection = url.openConnection();//建立网络连接
			//设置请求属性，模拟用户访问 User-Agent:Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36
			openConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36");
			openConnection.setDoInput(true);
			InputStream inputStream = openConnection.getInputStream();
			BufferedReader bReader=new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
			String line="";//一行一行读取，实际读取的内容
			//匹配正则，找到推荐连接那行<li><a hidefocus="true" data-module="discover" href="/discover"><em>推荐</em></a></li>
			/*String regex="<li><a hidefocus=\"true\" data-module=\"discover\" href=\"/discover\"><em>推荐</em></a></li>";*/
			String regex="<a[^>]*href=(\"([^\"]*)\"|\'([^\']*)\'|([^\\s>]*))[^>]*>(.*?)</a>";
			Pattern pattern=Pattern.compile(regex);
			File file=new File("C:\\Users\\Administrator\\Desktop\\wangyiyun.html");
			OutputStream os=new FileOutputStream(file);
			BufferedWriter bWriter=new BufferedWriter(new OutputStreamWriter(os,"utf-8"));
			while((line=bReader.readLine())!=null){
				/*if(line.indexOf("href")>0){
				Matcher matcher = pattern.matcher(line);
				while(matcher.find()){
				String group = matcher.group();//获取每组，第一组是整个正则表达式，第二组是第一次出现()里面的内容，依次类推
				if (group.indexOf(key)>0) {
					groupurl= matcher.group(2);
					String detion = getDetion("http://music.163.com"+path,key);
					if (detion==null) {
						return groupurl;
					}
					return groupurl;
				}
				groupurl= matcher.group(2);
				Pattern pattern2=Pattern.compile("(^/[^#]+)|(^http.+)");
				Matcher matcher2=pattern2.matcher(groupurl);
				while(matcher2.find()){
				groupurl=matcher2.group();
				System.out.println(groupurl);
				}
				}
				}*/
				if (line.indexOf("img")>0) {
				selectCrawl(line);}
				//System.out.println(line);
				bWriter.write(line);
				}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
		//关闭各流	
		}
		return groupurl;
	}
	
	//选择需要的内容
	public static void selectCrawl(String line){
		String regex="<img[^>]*src=(\"([^\"]*)\"|\'([^\']*)\'|([^\\s>]*))[^>]*>";
		Pattern pattern=Pattern.compile(regex);
			Matcher matcher = pattern.matcher(line);
			while(matcher.find()){
				System.out.println(matcher.group(1));
			}
	}
	public static void main(String[] args) {
		//String path="http://music.163.com/";
		String path="http://music.163.com/discover/artist";
		String detion = getDetion(path);
		System.out.println(detion);
		/*System.out.println(getDetion("http://music.163.com"+detion,"嘿，姑娘，原来我梦中的样子都是你啊"));*/
	}
}
