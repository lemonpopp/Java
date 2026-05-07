package com.test03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Run {
	public static void main(String[] args) {
		//스트림(Stream)
		//컬렉션 데이터를 함수형으로 처리히는 방식
		//필터링, 매핑, 집계 등의 작업을 for, if 등을 생략한채로 가능
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
		System.out.println(numbers);

		
		numbers.stream()
		       .filter(n->n%2==0)
		       //.forEach(x->System.out.println(x));
		       .forEach(System.out::println);	//a[
		//filter() : 스트림에서 뽑아져 나오는 데이터 중에 특정 데이터만 골라내는 역할	
		
		
		List<String> p = Arrays.asList("레몬","키위","딸기","메론","오이딸기");
		List<String> ki = p.stream().filter(name->name.contains("기")).collect(Collectors.toList());
		System.out.println(ki);
		//collect() : 스트림 결과를 모아 객체 생성
		
		List<String> str = Arrays.asList("java","html","css","javascript");
		List<String> res = str.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println("str: " + str);
		System.out.println("res: " + res);
		//map() : 요소들을 특정 조건에 해당하는 값으로 바꿔 준다
		//		  반환
		
		//10보다 작은 숫자만 제곱해서 리스트로 만들기
		List<Integer> nums = Arrays.asList(2,6,7,8,9,12,18,22);
		List<Integer> numRes = nums.stream().filter(n->n<10).map(n -> n * n).collect(Collectors.toList());
				
		System.out.println(numRes);
		
		//count() : 요소의 개수를 세어준다
		System.out.println(str.stream().filter(word -> word.contains("t")).count());
		
		//1~45까지의 숫자를 랜덤으로 6개 추출한 리스트 생성해보기
		//generate() : 값을 생성해서 스트림을 만드는 매서드
		//distinct() : 중복 제거
		List<Integer> ran = Stream
							.generate(()->(int)(Math.random()*45)+1)
							.distinct()
							.limit(6)
							.sorted()
							.collect(Collectors.toList());
		System.out.println(ran);
		
		
		//비어있는 스트림 생성
		Stream<String> s01 = Stream.empty();
		
		//빌더패턴
		Stream<String> s02 = Stream.<String>builder().add("Hello").add("Java").add("Oracle").build();
		s02.forEach(System.out::println);
		
		
		IntStream intStream = IntStream.range(1, 10)	//1부터 10전까지
										.skip(3)
										.limit(5);
		
		intStream.forEach(System.out::println);
		
		IntStream.rangeClosed(1,10)	//1부터 10까지
				.forEach(System.out::println);
		
	}

}
