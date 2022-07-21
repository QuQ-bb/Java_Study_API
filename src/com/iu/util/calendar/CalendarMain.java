package com.iu.util.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		
//		Calendar ca = new GregorianCalendar();	//다형성
		//현재 년 월 일 시 분 초 밀리세컨즈
		Calendar ca = Calendar.getInstance();	//위와 동일한 것
		//이렇게 보통 객체를 생성한다
		System.out.println(ca);
		ca.set(ca.YEAR, 2002);
		ca.set(ca.MONTH, 11);
		ca.set(ca.DATE, 25);
		
		int y = ca.get(ca.YEAR);
		int m = ca.get(ca.MONTH);
		int d = ca.get(ca.DATE);	//day_of_month와 동일
		int h = ca.get(ca.HOUR);
		int mm = ca.get(ca.MINUTE);
		int s = ca.get(ca.SECOND);
		
		long milis = ca.getTimeInMillis();
		System.out.print(y+"\t");
		System.out.print(m+1+"\t");
		System.out.print(d+"\t");
		System.out.print(h+"\t");
		System.out.print(mm+"\t");
		System.out.print(s+"\t");
		System.out.println(milis); //현재시간을 밀리세컨즈로 표현
		
	}

}
