package com.test.io.chap01_file;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		//File 클래스 테스트
		File file = new File("test/test.png");
		//파일의 정보 확인
		System.out.println("파일명: "+file.getName());
		System.out.println("저장경로: " + file.getAbsolutePath());
		System.out.println("저장경로: " + file.getPath());
		System.out.println("파일용량: " + file.length());
		System.out.println("상위폴더: " + file.getParent());
		
		try {
			//file.mkdirs() => test.txt까지 포함하여 디렉토리(폴더) 생성
			file.getParentFile().mkdirs();
			
			boolean b = file.createNewFile();//기존 파일이 없으면 true, 있으면 false 리턴
			System.out.println(b);
			
			//boolean b2 = file.delete();
			//System.out.println("삭제 후 : " + b2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}		
		
	}
}
