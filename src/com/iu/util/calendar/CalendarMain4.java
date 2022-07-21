package com.iu.util.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 {

	public static void main(String[] args) {

		Calendar ca = Calendar.getInstance();
		
		System.out.println(ca.getTime());
		
		
//		ca.roll(ca.MINUTE, 20);//시간 흐르게 하는거
		ca.add(ca.MINUTE, 20);
		System.out.println(ca.getTime());
		
		System.out.println("=======================================");
		ca = Calendar.getInstance();
		String pattern ="yyyy년 MM월 dd일 E";
		SimpleDateFormat sd = new SimpleDateFormat(pattern);
		String time=sd.format(ca.getTime());	//date 객체로 변환
		System.out.println(time);
	}

}
