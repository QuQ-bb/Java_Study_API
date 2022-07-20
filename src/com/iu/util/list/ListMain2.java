package com.iu.util.list;

import java.util.ArrayList;

public class ListMain2 {

	public static void main(String[] args) {
		//
		ListView lv = new ListView();
		ArrayList<String> al = new ArrayList();//눈에 안보이지만 기본 열개 만들어져있다..?
		al.add("first");
//		al.add(2);	//Integer auto-boxing
		//모든 데이터는 object타입이다 string도 들어가고 int도 들어가는 이유는 다형성때문이다.
//		al.add('c');	//Character auto Boxing
//		al.add(2.123);  //Double auto Boxing
		al.add(null);	//null도 데이터기 때문에 나오네
		//배열은 같은데이터타입으로 묶을 수 있고 arraylsit는 전부 가능하지만 배열에서도 object로 해서 전부 묶는게 가능하다
		
		//get -> 특정 index의 요소롤 반환
		//String n1 = al.get(1);	//다형성때문에 오류남
		String n1 = (String)al.get(0);
		//만들어질때는 string타입으로 들어가지만 꺼낼때는 object
//		int n2 = (Integer)al.get(1);	//Integer를 넣으면 auto UnBoxing을 해줘서 int로 바뀌어 집어넣어줌
//		char n3  = (Character)al.get(2);
//		double n4 = (Double)al.get(3);
		System.out.println(n1);
//		System.out.println(n2);
//		System.out.println(n3);
//		System.out.println(n4);
		
		System.out.println(al.get(0) instanceof String); //al.get(0) 이 String 타입인가요? true/false
		
		//형변환과 다형성을 구분할줄 알아야한다.
		//형변환은 primitive type끼리 하는것
		//다형성은 부모자식간에 하는것
//		lv.view(al);
		
	}

}
