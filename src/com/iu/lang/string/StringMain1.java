package com.iu.lang.string;

public class StringMain1 {

	public static void main(String[] args) {

		String str1 = "iu";			//변수에 넣는 데이터 : 리터럴(상수)
		String str2 = "iu";			//str1과 str2는 주소를 비교하는데 똑같음
		String str3 = new String("iu");	//new는 heap영역 새로만드는것
		String str4 = new String("iu");	
		
		System.out.println(str1 == str2);	//true
		System.out.println(str1 == str3);	//false
		System.out.println(str3 == str4); 	//false
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		//원래 주소값이 찍혀야 하는데 참조변수의 주소값이 찍히지지않고 
		
		System.out.println("===================================");
		System.out.println(str1.equals(str2));	//true
		System.out.println(str1.equals(str3));  //true
		//equals는 안에 있는 데이터 값이 같냐를 비교해줄수있도록 overriding 해주는 중 
		
		StringStudy ss = new StringStudy();
		//ss.studyCharAt();
		
		StringStudy2 ss2 = new StringStudy2();
//		ss2.studyIndexOf();
		//ss2.studyIndexOfEx1();
//		ss2.studySubString();
		ss2.ex2();
	}

}
