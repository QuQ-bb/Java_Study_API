package com.java.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx2 {

	//juminCheck
	//주민번호를 입력받습니다.
	// 9 7 1 1 2 4 - 1 2 3 4 5 6 7(체크용 번호)
	//*2 3 4 5 6 7   8 9 2 3 3 4
	//18 21 4 5 12 28 - 8 18 6 12 8 24 7
	//다 더해준다 총합 구해주기
	//총합을 11로 나눠서 나머지를 구합니다
	//182/11 -- 몫? 17 나머지 5
	//나머지를 11에서 뺀 결과	11-5 =6
	//뺀 결과를 체크용 번호랑 같은지 비교
	//민약에 위의 연산결과가 두자리라면
	//연산결과를 다시 10으로 나눈 나머지 체크용 번호를 비교
	// 11/10 -> 나머지1
	public void juminCheck() {
		Scanner scan = new Scanner(System.in);
		System.out.println("주민번호를 입력해주세요.");		//"971124-1234567"
		String nums = scan.next();
//		nums = nums.replace("-", "");
		System.out.println("강사님 코드==========================================================================================================");
		//꺼내서 곱하기를 먼저 생각해야된다고 그게 우선이라고
		//1.하나의 문자열에서 일부분을 드러내는거 substring() :return타입 String
//		String num = nums.substring(0,1); //1,2 2,3
//		int n =Integer.parseInt(num);
		
		int count =2;
		int sum =0;
		for(int i=0; i<nums.length()-1; i++) {
		//2.문자열에서 한글자씩 뺴내오는거 charAt()	:return타입 char
//		char ch = nums.charAt(0); //1,2,3
		//문자를 문자열로 변경해주는것
		//1.valueOf()
//		String num = String.valueOf(ch);
		//2.연결연산자
//		int n = Integer.parseInt(ch+"");			//농냥냐농 ㅇㅅㅇ~

		if(i==6) {
			continue;
		}
			
		//위에 두개를 합친것 맨안쪽 괄호부터 해석하면 됨
		int n = Integer.parseInt(String.valueOf(nums.charAt(0)));
		sum = sum+ n*count;
		count++;
			
		}
		int check = sum%11;
		check = 11-check;
		
		if(check>9) {
			check =check%10;
		}
		//check용 번호
		int checkNum = Integer.parseInt(String.valueOf(nums.charAt(nums.length()-1))) ;
		
		if(check == checkNum) {
			System.out.println("정상 주민번호");
		}else {
			System.out.println("비정상 주민번호");
		}
		
		
		System.out.println("내코드==========================================================================================================");
//		System.out.println(nums);					//"9711241234567"
//		String [] num = nums.split("");
//		
//		for(int i=0; i<num.length; i++) {
//			System.out.println("num=="+num[i]);
//		}
//		//주민번호를 받으면 일단 음..이걸 숫자하나씩 나눠줘야됨
//		//나눠준걸 또 곱해줘야됨
//		//나온결과 또 더해줘야됨
//		
//		//String 타입으로 받아오는법
//		int jumin =0;
//		int sum=2;
//		int total =0;
//		String checkNum = nums.substring(12);
//		int check = Integer.parseInt(checkNum);
//		System.out.println("check"+checkNum);
//		for(int i=0; i<nums.length()-1; i++) {
//			String s = nums.substring(i, i+1);
//			System.out.println(s);
//			int j = Integer.parseInt(s);
//			jumin = j*sum;
//			System.out.println(j+"*"+sum+"=="+j*sum);
//			total =jumin + total;
//			sum++;
//			if(sum>9) {
//				sum =2;
//			}//if
//		}//for
//		System.out.println("total="+total);
//		
//		int m = total%11;
//		int c = 11-m;
//		System.out.println("m=="+m);
//		
//		if(c==check) {
//			System.out.println("true");
//		}else {
//			System.out.println("false");
//		}
//
	}
}
