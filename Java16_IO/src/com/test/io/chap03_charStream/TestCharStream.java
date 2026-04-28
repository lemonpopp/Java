package com.test.io.chap03_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStream {
	//FileWriter, FileReader
	public void fileSave() {
		//출력 FileWriter
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("sample2.txt");		
			
			fw.write("안녕하세요 반가워요!");
			fw.write('A');
			char[] carr = {'a','p','p','l','e'};
			fw.write(carr);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen() {
		//FileReader
		FileReader fr = null;
		
		try {
			fr = new FileReader("sample2.txt");
			
			//System.out.println((char)fr.read());
			
			int val;
			while((val=fr.read()) != -1) {
				System.out.print((char)val);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void fileOpen2() {
		//try with resource : 리소스 자동 해제(close() 자동 처리)
		try(FileReader fr = new FileReader("sample2.txt");
			/*FileReader fw = new FileReader("sample2.txt");*/) {
			
			int val;
			while((val=fr.read()) != -1) {
				System.out.print((char)val);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void fileSave2() {
		//try with resource를 이용해
		//"sample2.txt"에 적당한 데이터를 출력하는 코드 작성
		
		try(FileWriter fw = new FileWriter("sample2.txt");) {
			fw.write("안녕하세요 반가워요!");
			fw.write('A');
			char[] carr = {'a','p','p','l','e'};
			fw.write(carr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
