package com.iu.exception;

import java.util.Random;
import java.util.Scanner;

public class Test {
	
	public void t4() throws Exception {
		//유치원생 프로그램
		//0-99까지는 알지만 3자릿수를 알지 못함
		int num = 48;
		int num2 =82;
		int num3 =num+num2;
		int num4 = num - num2;
		
		if(num3>99){
			throw new MyException("무엇? 3자리? 안받아요");	//throw new Exception(); 기존에 존재하는 Exception 객체를 만들어서 사용해도 가능하다 지금은 직접만든걸 사용한것
		}
		if(num<0) {
			throw new MyException("그런거 몰라잉..~");
		}
	}
	
	public void t3()  throws Exception{ //catch문을 쓰는것과 같은것 
		String str = null;
		System.out.println(str.toString());
	}
	
	public void t2(){	
		System.out.println("t2 메서드 실행");
		String [] str = {"10", "five","3.142","0"};
		Scanner scan = new  Scanner(System.in);
		//쿠쿠로 삥ㅃㅇ
		
		for(String s: str) {
			try{
				System.out.println("숫자를 입력하세요");
				int n = scan.nextInt();
				
				int num=Integer.parseInt(s);
				num= 10/num;				//num은 try{}의 지역변수
				System.out.println(num);
			}catch(NumberFormatException e) {
				//예외처리
				System.out.println("예외처리");
			}catch(ArithmeticException e) {
				System.out.println("수학오류 해결");
			}catch(Exception e) {	//Exception이면 오류 99프로는 잡는다 못잡는건 Throwable로 잡으면 됨
				e.printStackTrace();//print 해달라 stack에 있는 에러를 trace 추적
			}catch(Throwable e) {
				
			}
		}//for
		System.out.println("t2 메서드 종료");
	}
	
	
	public void t1() {
		System.out.println("t1 메서드 실행");
		Random random = new Random();
		
		String str = null;
		if(random.nextInt(10)%2==0) {	//0~9사이의 수를 2로 나눠서 나머지가 0과 같다면
			str="10";
		}
		 int num = Integer.parseInt(str);	//new NumberFomatException()
		 try {
			 num =num/0;		// new ArithmeticException 
			 System.out.println(num);
		 }catch(ArithmeticException e) {	//()안엔 어떤 타입을 받을건지 정해준다
			 System.out.println("예외처리");
		 }
		System.out.println(str.toString());
		//new NullPointerException(); 객
		System.out.println("t1 메서드 종료");
	}

}
