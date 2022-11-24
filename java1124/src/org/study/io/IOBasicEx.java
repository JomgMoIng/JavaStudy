package org.study.io;

import java.io.IOException;
import java.io.InputStream;

public class IOBasicEx {

	public static void main(String[] args) {
		
		System.out.println("IO");
		
		InputStream inputStream = System.in;
		
		try {
			int inData = inputStream.read();	// 반환값이 byte라 int로 입력됨
			
			System.out.println("출력문자 : "+inData);	//  반환값이 숫자라 숫자로 출력됨
			System.out.println("출력문자 : "+(char)inData);	// int기 때문에 > char 강제형변환 
			
		} catch (IOException e) {

			e.printStackTrace();
		}finally {
			try {
				inputStream.close();	//연결종료(실패유무상관없이 종료)
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
		
		
	}
}
