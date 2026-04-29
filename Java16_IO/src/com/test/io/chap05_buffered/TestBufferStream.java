package com.test.io.chap05_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestBufferStream {
	public void output() {
		//BufferedWriter
		
		//1.기반스트림 생성
		//2.보조스트림 생성
		
		FileWriter fw = null;
		BufferedWriter bw = null;	
		
		try {
			fw = new FileWriter("sample3.txt");
			bw = new BufferedWriter(fw);
			
			bw.write("안녕하세요\n");
			bw.write("반가워요\n");
			bw.write("잘있어요\n");
			
			bw.flush();//버퍼에 샇인 데이터를 외부 자원으로 밀어 넣는다.
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void input() {
		//BufferedReader
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("sample3.txt"));
			
			//System.out.println(br.readLine());
			//System.out.println(br.readLine());
			//System.out.println(br.readLine());
			//System.out.println(br.readLine());//더 이상 읽어올 데이터가 없으면 null을 리턴
			
			String temp;
			while((temp = br.readLine()) != null) {
				System.out.println(temp);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
