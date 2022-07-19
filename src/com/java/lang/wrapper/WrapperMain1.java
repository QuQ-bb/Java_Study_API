package com.java.lang.wrapper;

import com.java.lang.wrapper.ex1.WrapperEx1;

public class WrapperMain1 {

	public static void main(String[] args) {

		System.out.println(Integer.BYTES);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		String num ="10";
		
		Integer integer = new Integer(num);	//줄이 그어져있는 이유:Deprecated된 문장이라
		int n= integer.intValue();
		
		n= 50;
		integer = new Integer(n);
		integer = n;				//주소를 담을 변수에 정수를 넣으려고함 안되는데 되게 만들어둠
									//Auto-Unboxing: 자동으로 벗겨준다
		n=integer;					//정수를 interget클래스에 바로 받는데 생성자를 통해 번환시켜줘야하는데
									//Auto-Boxing : 자동으로 감싼다.
									//정수값 int를 레퍼런스값으로 변경시켜주는것
		
		long l =10L;
		//integer =l;	//안됨
		Long ll =l;
		
		//integer = 10L;	//integer에서 auto-boxing하려면 int
		integer = (int)l;	//형변환해서 넣는건 가능함
		//integer =(int)ll;	// ll은 primitive타입이 아니라 형변환이 되지않음
		
		//*중요*
		String num1 = "50";
//		String num1 = "50a";	//숫자가 아니기때문에 변경할수 없다
//		String num1 = "ten";	
		String num2 ="3.12";
		String num3 = "60";
		
		int n1 = Integer.parseInt(num1);
		System.out.println("num1="+num1);
		double n2 = Double.parseDouble(num2);
		System.out.println("num2="+n2);
		System.out.println(n1*2);
		System.out.println(n2*2);
		long n3 =Long.parseLong(num3);
		System.out.println("num3="+n3);
		
		Integer.parseInt("50");
		
		System.out.println(ll);
		System.out.println(integer);
		System.out.println(n+2);
		
		
		
	}

}
