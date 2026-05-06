package com.test01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class URI02 {
	
	public static void main(String[] args) throws Exception {
		//test1();
		test2();
		
	}
	public static void test2() throws Exception{
		HttpClient client = HttpClient.newHttpClient();
		
		//요청 객체 생성
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://m.health.chosun.com/site/data/img_dir/2023/06/20/2023062002262_0.jpg"))
				.GET()
				.build();
				
		//요청 보내기
		HttpResponse<InputStream> response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());
				
		try(InputStream in = response.body();
			FileOutputStream fo = new FileOutputStream("apple2.jpg")){
			
			in.transferTo(fo);
		}
		System.out.println("완료");
				
	}
	
	
	public static void test1() throws IOException  {
			
		URL url = new URL("https://m.health.chosun.com/site/data/img_dir/2023/06/20/2023062002262_0.jpg");
			
			
		URLConnection urlCon = url.openConnection();
		urlCon.connect();
			
		DataInputStream di = new DataInputStream(urlCon.getInputStream());
		FileOutputStream fo = new FileOutputStream("apple.jpg");
			
		byte[] b = new byte[1];
		while(di.read(b,0,1) != -1) {
			fo.write(b,0,1);
		}
		System.out.println("완료");
		di.close();
		fo.close();
	}
	
}
