package com.java.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 {
	
	//ex1
	//주민번호 입력 : 6-7 : 971224-1234567
	//1.남자 여자 판단
	//2.현재 나이 출력
	//3. 3-5 월 봄
	//	 6-8 월 여름
	//	 9-11월 가을
	//	 12-2월 겨울
	public void ex1() {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요.");
		String nums = scan.next();
		
		String gender = nums.substring(7,8);
		
		//년
		String b = nums.substring(0, 2);
		System.out.println(b);
		
		String year =null;
				
				//"19"+b;
		System.out.println("year=="+year);
		//월
		String weather = nums.substring(2, 4);
		System.out.println(weather);
		
		System.out.println("wrapper ==============================");
		int weather1 = Integer.parseInt(weather);
		int year1 = Integer.parseInt(year);
		year1 = 2022-(year1+1);
		
		System.out.println("year1=="+year1);
		int gender1 = Integer.parseInt(gender);
		
		
		if(gender1 == 1 || gender1== 3) {
			System.out.println("당신은 남자입니다.");
		}else {
			System.out.println("당신은 여자입니다.");
		}
		
		System.out.println("현재 나이는"+ year1+"살 입니다.");
		
		if(weather1 >=3 && weather1 <=5) {
			System.out.println("태어난 달은 봄입니다.");
		}else if(weather1 >=6 && weather1 <=8) {
			System.out.println("태어난 달은 여름입니다.");
		}else if(weather1 >=9 && weather1 <=11) {
			System.out.println("태어난 달은 가을입니다.");
		}else if(weather1 >=12 || weather1 <=2) {
			System.out.println("태어난 달은 겨울입니다.");
		}
	}
	
	private void check1(String nums) {
		//1.남자 여자 판단
		char ch =nums.charAt(7);	//''이 들어가 있는 상황 숫자가 아니다
		if(ch =='1' || ch=='3') {
			System.out.println("당신은 남자입니다.");
		}else {
			System.out.println("당신은 여자입니다.");
		}
		
	}//check1
	
	private void age(String nums) {
		String year = nums.substring(0,2);	//년도
		System.out.println(year);
		char ch = nums.charAt(7);	//1900,2000
		String cen = "20";
		if(ch =='1'|| ch =='2') {
			cen="19";
		}
		year= cen+year;
		
		int y = Integer.parseInt(year);
		System.out.println(y);
		y = 2022-y;
		System.out.println("Age: "+y);
	
	}
	
	private void season(String nums) {
		nums = nums.substring(2,4);
		System.out.println(nums);
		
		int month = Integer.parseInt(nums);
		System.out.println(nums);
		
		if(month>2 && month<6) {
			System.out.println("봄");
		}else if(month>5 && month <9) {
			System.out.println("여름");
		}else if(month>8 && month <12) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
	}

}
