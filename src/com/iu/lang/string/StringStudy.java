package com.iu.lang.string;

public class StringStudy {
	
	public void studyCharAt() {
		//문자열 = 문자배열
		char[] ch = {'H','e','l','l','o',' ','W','o','r','l','d'};
		String str = "Welcome to Hell";	//띄어쓰기도 인덱스번호에 포함됨
		
		System.out.println(ch[0]);
		char c = str.charAt(0);
		System.out.println(c);
		//c =str.charAt(159);
		System.out.println(c);
		
		System.out.println(str.length());
		
		System.out.println("===================================");
		//str 문자열을 하나씩 거내서 출력
		for(int i=0; i<str.length(); i++) {
			c= str.charAt(i);
			System.out.print(c);
		}//for문
		
		
	}//studyCharAt

}//StringStudy
