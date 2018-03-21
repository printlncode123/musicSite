package com.iternetSite.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MusicController {
	public static void main(String[] args) throws IOException {
		String path=" http://music.163.com/api/playlist/detail?id=37880978&updateTime=-1";//¸èµ¥
		//String path=" http://music.163.com/api/song/detail/?id=28377211&ids=%5B28377211%5D";
		URL url=new URL(path);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setDoOutput(true);
		InputStream inputStream = connection.getInputStream();
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream,"utf-8"));
		String output;
		while((output=bufferedReader.readLine())!=null){
			System.out.println(output);
		}
		connection.disconnect();
	}
}
