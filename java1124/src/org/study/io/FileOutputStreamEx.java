package org.study.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fOut = new FileOutputStream("c:\\test.out");
			FileInputStream fin =null;
			
			for(int i =0;i<10;i++) {
				int n =10 -i;
				fOut.write(n);
			}
			if(fOut!=null) fOut.close();
			
			fin = new FileInputStream("c:\\test.out");
					
			int Indata = 0;
			
			while((Indata=fin.read())!=-1) {
				System.out.print((char)Indata);
			}
			if(fin!=null)	fin.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		
		
		
	}
}
