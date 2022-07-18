package com.iu.lang.string;

import java.util.Scanner;

public class StringStudy2 {
	
	public void ex2() {
		//키보드로부터 파일명을입력받기 abc.txt, jpg.word는 word파일이다잉
		//파일이 이미지파일인지 아닌지 구별
		//확장자가 jpg, png, gif, jpeg, 이거 어떻게 비교할지
		//받은 파일명의 . 뒤에 글자를 비교하기
		//if . 뒤의 글자 
		Scanner scan = new Scanner(System.in);
		System.out.println("파일명을 입력해주세요.");
		String file = scan.next();
		
//		int jum = file.indexOf(".", 0);// 입력받은 파일명의 . 위치를 받아낸다
//		
//		String ex = file.substring(jum+1);//점+1 부터 시작하는 글자를 String으로 받아서 저장
//		
//		//String으로 받아낸 값을 equals함수를 써서 비교해준 뒤 조건문 출력 
//		if(ex.equals("jpg") || ex.equals("png") || ex.equals("gif") || ex.equals("jpeg")) {
//			System.out.println(ex +" 확장자는 이미지 파일입니다.");
//		}else {
//			System.out.println("이미지 파일이 아닙니다.");
//		}
		
	//	System.out.println("강사님코드========================");
		String [] files = {"jpg","png","gif","jpeng"};
		String result = "이미지 파일이 아닙니다.";
		int index = file.lastIndexOf(".");
		file = file.substring(index+1);
		
		for(int i=0; i<file.length(); i++) {
			if(file.equals(files[i])) {
				result ="이미지 파일입니다.";
				break;
			}
		}
		
	}
	
	
	public void studyIndexOfEx1() {
		String names ="iu,suji,choa,hani";
		//1.names에는 몇개의 쉼표가 있는가?
		//2.총 몇명입니까?
//		 int a =names.indexOf(',', 0);
//		System.out.println(a);
//		int b=0;
//		b = names.indexOf(",", 0);
//		int j=0;
//		while(b != -1) {
//			b =names.indexOf(",", b+1);
//			j++;
//		}
//		System.out.println("쉼표의 총 갯수"+j);
//		System.out.println("몇명인가요? "+ (j+1));
		
		//일단 쉼표를 찾아야함
		//그걸 담을변수를 만들어준다
		//쉼표가 끝날때까지 쉼표를 찾아야 하기때문에 while을 사용해준다 
		//쉼표를 담은 변수가 -1이 아닐땐 반복문 돌리기
		int com = 0; 
		System.out.println(com);//2
		//boolean check = true;
//		while(check) {
//			com= names.indexOf(",", 0);	//첫 쉼표하나 찾기
//			if(com != -1) {
//				names.indexOf(",", (com+1));
//			}else {
//				break;
//			}
			
//		}
		System.out.println("강사님 코드===========================================");
		
		boolean check = true;
		int count =0;	//쉼표의 갯수를 담을 변수
		int index =0;	//쉼표의 인덱스번호를 저장
		while(check) {
			index = names.indexOf(",", index);
			if(index== -1) {
				break;
			}else {
				count++;
				index++;
			}//else
		}//while
		System.out.println(", 의 갯수 : " + count);
		System.out.println("인원 수 : " + (count+1));
	}
	
	public void studyIndexOf() {
		String str="Hello Java";
		
		int a  =str.indexOf('j');	//ch=> char
									//찾기못하면 -1을 출력
		int i= str.indexOf("ll");
		
		System.out.println(a);
		System.out.println(i);
		
		String replace = str.replace('l', 'w');
		System.out.println(replace);
		System.out.println(str);
		//새로운 문자열을 만들어서 return시키는것 
		
		str="Google입사시켜줘잉";
		System.out.println(str);
		str = str.replace("Google", "Samsung");
		System.out.println(str);
		
		str = "hi";
		String str2="h i ";
		str2 = str2.trim();	//공백을 제거 시켜줌
							//문자와문자사이의 공백은 지워지지않는다 맨앞쪽과 맨뒤쪽 공백을 없애줌
		str2= str2.replace(" ", "");//문자사이의 중간공백은 이렇게밖에 지울수없다.
		System.out.println(str.equals(str2));	//false나옴 why? str2의 공백때문에
	}
	
	public void studySubString() {
		//하나의 문자열을 분리하는 작업(parsing)
		String member ="iu/1234";
		String id= member.substring(0, 2);	//0번부터 2번미만까지 가져와라
		String pw = member.substring(3);
		System.out.println(id);
		System.out.println(pw);
	}

}
