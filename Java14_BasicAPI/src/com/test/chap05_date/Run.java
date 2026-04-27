package com.test.chap05_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Run {
	//날짜 관련된 클래스들
	/*
	 * Date, Calendar, GregorianCalendar
	 * LocalDate, LocalTime, LocalDateTime
	 */

	public static void main(String[] args) {
		//Date
		Date oDate = new Date();
		System.out.println(oDate);
		oDate = new Date(0L);
		System.out.println(oDate);
		oDate = new Date(1000L);	//기준 시간 보다 1초 뒤
		System.out.println(oDate);
		
		//Calendar
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		
		int year = cal.get(1);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		
		System.out.println(year + "/"+month+"/"+day);
		
		//GregorianCalendar
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		System.out.println(gc.getTime());
		
		System.out.println(gc.isLeapYear(2028));
		
		gc.set(2022, 4-1, 27);
		//년, 월, 일
		System.out.println("year: " + gc.get(Calendar.YEAR));
		System.out.println("date: " + gc.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("---------------");
		//LocalDate : 날짜
		LocalDate today = LocalDate.now();
		System.out.println(today);
		today = LocalDate.of(2022,2,22);
		System.out.println(today);
		System.out.println(today.plusDays(3));
		System.out.println(today.minusDays(1));
		today = LocalDate.parse("2020-04-22");
		System.out.println(today);
		
		//LocalTime : 시간
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		//LocalDateTime : 날짜+시간
		LocalDateTime date = LocalDateTime.now();
		System.out.println(date);
		date = LocalDateTime.of(2022,2,22,14,22,30);
		System.out.println(date);
		date = LocalDateTime.parse("2022-02-22T02:22:22");
		System.out.println(date);
		System.out.println(date.getYear());
		System.out.println(date.getMonthValue());
		System.out.println(date.getDayOfMonth());
				
		//기존 객체 수정X, 수정된 새로운 객체를 리턴
		LocalDateTime c = date.withYear(2012).withMonth(12).withHour(8);
		System.out.println(c);
		
		//비교
		System.out.println(date.isBefore(c));
		System.out.println(date.isAfter(c));
		System.out.println(date.isEqual(c));
		
		System.out.println(date.toLocalDate());
		System.out.println(date.toLocalTime());
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
		String str = date.format(fmt);
		System.out.println(str);
	}

}
