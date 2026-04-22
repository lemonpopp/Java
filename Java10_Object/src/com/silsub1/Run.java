package com.silsub1;

import com.silsub1.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		Member m = new Member();
		
		m.setMemberId("lemonpang");
		m.setMemberPwd("12345");
		m.setMemberName("레몬팡");
		m.setAge(255);
		m.setGender('M');
		m.setPhone("010-1234-5678");
		m.setEmail("lemon@email.com");
		
		System.out.println(m.getMemberId());
		System.out.println(m.getMemberPwd());
		System.out.println(m.getMemberName());
		System.out.println(m.getAge());
		System.out.println(m.getGender());
		System.out.println(m.getPhone());
		System.out.println(m.getEmail());
	}
}
