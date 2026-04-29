package com.test.io.chap06_object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestObjectStream {
	public void fileSave() {
		//ObjectOutputStream
		
		Member[] mar = {new Member("user01","pass01","레몬",20,'M'),
						new Member("user02","pass02","사과",25,'F'),
						new Member("user03","pass03","딸기",30,'F')};
		
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("member.txt"));
			
			for(int i=0; i<mar.length; i++) {
				oos.writeObject(mar[i]);
			}
			
			oos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		}
	public void fileOpen() {
		//ObjectInputStream
		
		Member[] mar = new Member[3];
		
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("member.txt"));
			
			mar[0] = (Member) ois.readObject();//역직렬화(바이트->객체)가 진행
			mar[1] = (Member) ois.readObject();
			mar[2] = (Member) ois.readObject();
			
			for(Member m : mar) {
				System.out.println(m);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
