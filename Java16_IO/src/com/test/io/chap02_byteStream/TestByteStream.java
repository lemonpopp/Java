package com.test.io.chap02_byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
	//FileInputStream, FileOutputStream
	
	public void fileSave() {
		//출력 fileOutputStream
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("sample.txt", true);
			//대상 파일이 존재하지 않으면 자동으로 파일 생성
			//대상 파일이 존재하면 덮어씌어진다. 단 true 값을 통해 이어쓰기 가능
			
			fout.write(97);
			byte[] barr = {98,99,100,101,102,10};
			fout.write(barr);
			fout.write(barr,1,3);
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void fileOpen() {
		//입력 FileInputStream
		FileInputStream fin = null;
		
		try {
			fin = new FileInputStream("sample.txt");
			
			//read() 데이터 하나 읽어오기
//			System.out.println(fin.read());
//			System.out.println(fin.read());
//			System.out.println(fin.read());
			
			//반복하여 데이터 읽어오기
//			for(int i=0; i<30; i++) {
//				System.out.print(fin.read());
//			}
			
			//반복하여 데이터 읽어오기(단, 더이상 읽어올 데이터가 없을 경우 종료)
//			int val=0;
//			while((val=fin.read())!=-1) {
//				System.out.print((char)val);
//			}
			
			//byte배열을 이용하여 읽어오기
			int size = (int)new File("sample.txt").length();
			byte[] barr = new byte[size];
			fin.read(barr);
			
			for(int i=0; i<barr.length; i++) {
				System.out.println((char)barr[i]);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
