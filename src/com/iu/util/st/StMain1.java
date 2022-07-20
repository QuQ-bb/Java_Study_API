package com.iu.util.st;

import java.util.StringTokenizer;

public class StMain1 {

	public static void main(String[] args) {
		String str = "samsung-500-lg-600-google-900-kakao-700";
		
		StringTokenizer st = new StringTokenizer(str,"-");	//StringTokenizer는 기본생성자가 없음
		
		System.out.println(st.countTokens());	//결과값 8 : 토큰의 갯수를 담는 메서드
		
		//얘가 몇개가 있는지 모른다는 가정하에 횟수가 정해져 있지 않을때 
		while(st.hasMoreTokens()) {	//토큰이 더 있냐고 묻는 메서드 있으면 true 없으면 false
			//parsing
			String token =st.nextToken();
			System.out.println(token);	//samsung  500   lg  600 ...
			token = st.nextToken();
			System.out.println(token);	//이렇게 하면 두개씩 끊어서 결과값나옴	samsung500  lg600....
			System.out.println("============");
			
		}
		
		
	}

}
