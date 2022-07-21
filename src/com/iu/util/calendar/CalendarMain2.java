package com.iu.util.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarMain2 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();	//1506
		
		Calendar future = Calendar.getInstance();//1601
		
		Calendar birth = Calendar.getInstance();
		//지금 내가 며칠째 살고있는지 대략 계산해보기
		
		birth.set(birth.YEAR, 1997);
		birth.set(birth.MONTH, 07);
		birth.set(birth.DATE, 12);
		
		long n = now.getTimeInMillis();
		long b = birth.getTimeInMillis();
		long result = n-b;
		result =result/(1000*60*60*24);
		result= result/365;
		System.out.println(result);
		
		Date date = now.getTime();
		System.out.println(date);
		
//		future.set(now.MINUTE, 15);
//		
//		long n= now.getTimeInMillis();
//		long f =future.getTimeInMillis();
//		
//		System.out.println(n);
//		System.out.println(f);
//		long result = f-n;
//		System.out.println(result);
//		System.out.println(result/(1000*60));
//		int min =now.get
	}

}
