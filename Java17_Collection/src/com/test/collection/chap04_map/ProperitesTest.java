package com.test.collection.chap04_map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ProperitesTest {
	public void test() {
		//Properties
		//key, value 모두 String 객체
		
		Properties prop = new Properties();
		
		prop.setProperty("key", "value");
		prop.setProperty("id", "admin");
		prop.setProperty("pw", "1234");
		//prop.setProperty("age", 12); 에러 발생
		prop.setProperty("age", "20");
		
		System.out.println(prop);
		System.out.println();
		
		String id = prop.getProperty("id");
		String pw = prop.getProperty("pw");
		
		System.out.println(id + ", " +pw);
		
		//HashMap<String,String> map = new HashMap<String, String>();
		
		//외부 파일로 출력
		try {
			prop.store(new FileOutputStream("driver.properties"), "properties Test");
			prop.store(new FileWriter("driver.txt"), "prop Test");
			prop.storeToXML(new FileOutputStream("driver.xml"), "xml store");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void test2() {
		//파일로부터 읽어오기
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("driver.properties"));
			
			System.out.println(prop);
			System.out.println(prop.getProperty("age"));
			System.out.println(prop.getProperty("id"));
			System.out.println(prop.getProperty("pw"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
