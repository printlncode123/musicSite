package com.crawl.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * ���ַ���
 * <dl class=\"f-cb\">
<dt><i class=\"u-icn u-icn-71\"></i>����</dt>
<dd >
<a class=\"s-fc1 \" href=\"/discover/playlist/?cat=%E5%8D%8E%E8%AF%AD\" data-cat=\"����\">����</a><span class=\"line\">|</span>
<a class=\"s-fc1 \" href=\"/discover/playlist/?cat=%E6%AC%A7%E7%BE%8E\" data-cat=\"ŷ��\">ŷ��</a><span class=\"line\">|</span>
</dd>
</dl>
<dl class=\"f-cb\">
<dt><i class=\"u-icn u-icn-6\"></i>���</dt>
<dd >
<a class=\"s-fc1 \" href=\"/discover/playlist/?cat=%E6%B0%91%E8%B0%A3\" data-cat=\"��ҥ\">��ҥ</a><span class=\"line\">|</span>
<a class=\"s-fc1 \" href=\"/discover/playlist/?cat=%E7%94%B5%E5%AD%90\" data-cat=\"����\">����</a><span class=\"line\">|</span>
<a class=\"s-fc1 \" href=\"/discover/playlist/?cat=%E8%88%9E%E6%9B%B2\" data-cat=\"����\">����</a><span class=\"line\">|</span>
</dd>
<a class=\"s-fc1 \" href=\"/discover/playlist/?cat=%E6%B5%81%E8%A1%8C\" data-cat=\"����\">����</a><span class=\"line\">|</span>
<a class=\"s-fc1 \" href=\"/discover/playlist/?cat=%E6%91%87%E6%BB%9A\" data-cat=\"ҡ��\">ҡ��</a><span class=\"line\">|</span>
</dl>
<dl class=\"f-cb\">
<dt><i class=\"u-icn u-icn-7\"></i>����</dt>
<dd >
<a class=\"s-fc1 \" href=\"/discover/playlist/?cat=%E6%B8%85%E6%99%A8\" data-cat=\"�峿\">�峿</a><span class=\"line\">|</span>
<a class=\"s-fc1 \" href=\"/discover/playlist/?cat=%E5%A4%9C%E6%99%9A\" data-cat=\"ҹ��\">ҹ��</a><span class=\"line\">|</span>
</dd>
</dl>
<dl class=\"f-cb\">
<dt><i class=\"u-icn u-icn-8\"></i>���</dt>
<dd >
<a class=\"s-fc1 \" href=\"/discover/playlist/?cat=%E6%80%80%E6%97%A7\" data-cat=\"����\">����</a><span class=\"line\">|</span>
<a class=\"s-fc1 \" href=\"/discover/playlist/?cat=%E6%B8%85%E6%96%B0\" data-cat=\"����\">����</a><span class=\"line\">|</span>
</dd>
</dl>
<dl class=\"f-cb\">
<dt><i class=\"u-icn u-icn-9\"></i>����</dt>
<dd class=\"last\">
<a class=\"s-fc1 \" href=\"/discover/playlist/?cat=%E5%BD%B1%E8%A7%86%E5%8E%9F%E5%A3%B0\" data-cat=\"Ӱ��ԭ��\">Ӱ��ԭ��</a><span class=\"line\">|</span>
<a class=\"s-fc1 \" href=\"/discover/playlist/?cat=ACG\" data-cat=\"ACG\">ACG</a><span class=\"line\">|</span>
</dd>
</dl>
 *
 */
public class Catagory {
	static String path="http://music.163.com/discover/playlist";
	static String regex="<dt><i[^>]*class=\"(u-icn)\\s\\1-\\d+\"></i>(.*?)</dt>";
	static String regex2="<a[^>]*href=((\"[^\"]*\")|(\'[^\']*\')|([^\\s>]*))[^>]*>(.*?)</a>";
	static String regex3="<dl.*?\"f-cb\"><dt><i[^>]*class=\"(u-icn)\\s\\1-\\d+\"></i>(.*?)</dt><dd ><a[^>]*href=((\"[^\"]*\")|(\'[^\']*\')|([^\\s>]*))[^>]*>(.*?)</a><span.*?</span></dd></dl>";
	public static void get() throws IOException{
		URL url = new URL(path);
		URLConnection openConnection = url.openConnection();
		openConnection.setDoOutput(true);
		openConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/60.0.3112.113 Safari/537.36");
		openConnection.setDoInput(true);
		InputStream inputStream = openConnection.getInputStream();
		BufferedReader bReader=new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
		String line="";//ʵ�ʶ�ȡ��ÿ������
		Pattern compile = Pattern.compile(regex);
		Pattern compile2 = Pattern.compile(regex2);
		Pattern compile3 = Pattern.compile(regex3);
		String strLine="";
		while((line=bReader.readLine())!=null){
			/*System.out.print(line);*/
			/*Matcher matcher = compile.matcher(line);
			Matcher matcher2= compile2.matcher(line);
			while(matcher.find()){
				System.out.println(matcher.group(2));
			}
			if(line.indexOf("href")!=-1){
			while(matcher2.find()){
				System.out.println("\t"+matcher2.group(1));
			}
			}*/
			strLine+=line;
		}
		Matcher matcher3=compile3.matcher(strLine);
		while(matcher3.find()){
			String group = matcher3.group();
			for(int i=0;i<matcher3.groupCount();i++){
				System.out.println(matcher3.group(i));
			}
			/*System.out.println(matcher3.group(2));
			System.out.println("\t"+matcher3.group(7)+":"+matcher3.group(3));*/
		}
	}
	public static void main(String[] args) throws IOException {
		get();
	}
		/**
		 * ƥ��ȫ�����ֵķ���Ĺ���
		 * 
		 */
	/*public static void main(String[] args) {
		String str="<dl class=\"f-cb\"><dt><i class=\"u-icn u-icn-8\"></i>���</dt><dd ><a class=\"s-fc1 \" href=\"/discover/playlist/?cat=%E6%80%80%E6%97%A7\" data-cat=\"����\">����</a><span class=\"line\">|</span><a class=\"s-fc1 \" href=\"/discover/playlist/?cat=%E6%B8%85%E6%96%B0\" data-cat=\"����\">����</a><span class=\"line\">|</span></dd></dl><dl class=\"f-cb\"><dt><i class=\"u-icn u-icn-9\"></i>����</dt><dd class=\"last\"><a class=\"s-fc1 \" href=\"/discover/playlist/?cat=%E5%BD%B1%E8%A7%86%E5%8E%9F%E5%A3%B0\" data-cat=\"Ӱ��ԭ��\">Ӱ��ԭ��</a><span class=\"line\">|</span><a class=\"s-fc1 \" href=\"/discover/playlist/?cat=ACG\" data-cat=\"ACG\">ACG</a><span class=\"line\">|</span></dd></dl>";
		String str="<dt><i class=\"u-icn u-icn-8\"></i>���</dt>";
		String regex="<dt><i[^>]*class=\"(u-icn)\\s\\1-\\d+\"></i>(.*?)</dt>";
		Pattern cPattern=Pattern.compile(regex);
		Matcher matcher = cPattern.matcher(str);
		System.out.println(matcher.find());
		while(matcher.find()){
			System.out.println(matcher.group());
		}*/
		
	
	
}
