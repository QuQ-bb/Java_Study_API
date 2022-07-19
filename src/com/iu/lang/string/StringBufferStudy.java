package com.iu.lang.string;

public class StringBufferStudy {

	public static void main(String[] args) {

		String str1 ="max";
		String str2 = "age";
		
		//str1 =str1+str2;
		
		//System.out.println(str1);	//maxage
		//객체는 2개가 아니라 3개가 만들어진다 근데 이렇게 되면 쓸데없는 객체들이 너무 많아진다.
		
		//StringBuffer는 문자열을 연결해주는 역할
		StringBuffer sb= new StringBuffer();
		sb.append(str1);
		sb.append(str2);
		sb.append(10);
		System.out.println(sb);
//		
		
		
		//String result = sb;	//오류남 왜?  result랑 sb랑 데이터타입이 다르기때문이다
		//참조변수는 원래 객체의 주소값을 갖는것 
		//toString 객체의 주소를 문자열로 변경해준다.

		String result =sb.toString();
		System.out.println(sb);
		System.out.println(result);
		
		System.out.println("num1"+"1"+"num2"+"2");
		//여기서 객체가 몇개 만들어짐?4개? 아니다	num1 ,1 ,num2, 2, num11,num11num2, num11num22 총 7개
		//만들어진 객체들은 메모리에 남아있다
		//append 첨부하다,덧붙이다.
		//insert 중간에 삽입
		
	}

}
