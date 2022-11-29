package org.study.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLEx {

	
	public static void main(String[] args) {
	
		BufferedReader in = null;
		
		try {
//			URL url = new URL("http://192.168.23.211:8092/springMVC1206/join");
			URL url = new URL("https://www.starbucks.co.kr/index.do");
			in = new BufferedReader(new InputStreamReader(url.openStream()));

			String inputLine;
			while((inputLine = in.readLine()) !=null) {
				System.out.println(inputLine);
			}
		} catch (IOException e) {
		System.out.println("URl에서 데이터를읽는중 오류");
			e.printStackTrace();
		}finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
