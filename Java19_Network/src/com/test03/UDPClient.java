package com.test03;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPClient {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(7777);
		System.out.println("[클라이언트입니다]");
		
		//저장할 배열 생성
		byte[] buff = new byte[1024];
	
		//데이터그램 패킷 수신
		DatagramPacket receivePacket = new DatagramPacket(buff, buff.length);
		ds.receive(receivePacket);
	
		//데이터 확인
		System.out.println(new String(receivePacket.getData()));
		
		ds.close();
		
	}

}
