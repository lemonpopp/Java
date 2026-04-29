package com.test.io.chap04_byteToChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestStreamChange {
	//InputStreamReader, OutputStreamWriter
	
	//바이트 단위의 보조 스트림은 바이트 단위의 기반 스트림과
	//문자 단위의 보조 스트림은 문자 단위의 기반 스트림과 사용
	
	//byte 단위의 기반 스트림과 char 단위의 보조 스트림을 같이 사용하고 싶을 때

	//보조 스트림 사용 순서
	//1. 기반 스트림 생성
	//2. 생성된 기반 스트림을 이용해 보조 스트림 생성
	
	//new 보조스트림(new 기반스트림("외부 자원"));
	//==> new 보조스트림(new 다른스트림(new 기반스트림("외부 자원")));
	
	
	public void output() {
		//OutputStreamWriter
		//보조스트림: BufferedWriter 사용, char 단위
		//기반스트림: System.out 사용(PrintStream), byte 단위
		
		
		//1.기반스트림 생성 생략. System.out 사용
		//2.보조스트림 생성
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		
		try {
			bw.write("hello go");
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
		//inputStreamReader
		
		//보조스트림 : BufferedReader
		//기반스트림 : System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		try {
			String val = br.readLine();
			System.out.println("val: " + val);
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
