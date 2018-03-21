package com.crawl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestLink {
	static String regex="<a[^>]*href=(\"([^\"]*)\"|\'([^\']*)\'|([^\\s>]*))[^>]*>(.*?)</a>";
	static String regex2="<img[^>]*src=(\"([^\"]*)\"|\'([^\']*)\'|([^\\s>]*))[^>]*>";
	public static void main(String[] args) {
		String path="<a href=\"http://163.com\" target='_blank' class=\"\">app</a>";
		Pattern pattern=Pattern.compile(regex);
		boolean matches = Pattern.matches(regex, path);
		System.out.println(matches);
		Matcher matcher = pattern.matcher(path);
		System.out.println(matcher.find());//true
		while(matcher.find()){
		System.out.println(matcher.group(0));
		System.out.println(matcher.group(1));
		System.out.println(matcher.group(2));
		System.out.println(matcher.group(3));		
		System.out.println(matcher.group(4));
		System.out.println(matcher.group(5));
		}
		String input="<img src=\"app.jpg\" alt=\"\">";
		Pattern compile = Pattern.compile(regex2);
		Matcher matcher2 = compile.matcher(input);
		boolean find = matcher2.find();
		System.out.println(find);
		String group = matcher2.group();
		System.out.println(group);
		System.out.println(matcher2.group(1));
	}
}
