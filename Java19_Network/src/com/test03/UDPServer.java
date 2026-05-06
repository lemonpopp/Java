package com.test03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) throws IOException {
		DatagramSocket ds = new DatagramSocket();
		System.out.println("[서버입니다]");
		
		//보내려는 데이터 준비
		byte[] buff = "테스트 입니다.".getBytes();
		
		//데이터그램 패킷 생성
		DatagramPacket sendPacket = new DatagramPacket(buff, buff.length, InetAddress.getByName("localhost"), 7777);
		
		//전송
		ds.send(sendPacket);

		//종료
		ds.close();
		
		
	}

}
