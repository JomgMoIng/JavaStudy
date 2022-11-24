package org.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
	
		
		FileInputStream inFile = null;
		
		try {
			inFile = new FileInputStream("C:\\Windows\\system.ini");
			//파일과 연결된 바이트 스트림을 생성
			int inData;
			//입력된 inFile의 끝(-1)까지 입력 > 한글자씩 
			while((inData=inFile.read())!=-1) {// -1을 만나면 더 이상 입력이 안됨
				System.out.print((char)inData);// 바이트 c를 문자로 변환하여 화면에 출력한다
			}
			
		} catch (FileNotFoundException e) {//파일이 없을시
			System.out.print("파일 예외");
			e.printStackTrace();
		} catch (IOException e) {			//주고받을수 없을시
			System.out.print("입출력 예외");
			e.printStackTrace();
		}finally {
			try {
				inFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
	
}
