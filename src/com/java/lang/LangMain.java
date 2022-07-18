package com.java.lang;


public class LangMain {

	public static void main(String[] args) {
		
		Object object = new Object();
		String str = object.toString();
		Member member = new Member();
		System.out.println(str);

		str= member.toString();
		System.out.println(str);
		
		MemberClient mc = new MemberClient();
		Car car = new Car();
		Car car2 = new Car();
		
		object = member;
		
		
		boolean check = car.equals(object);	//car == car2
		System.out.println(car);
		System.out.println(car.toString()); //동일한 출력값
		System.out.println(check);
		

		String name ="iu";
		System.out.println(name);
		//원래 참조변수를 찍으면 주소값이 나와야 하는데 데이터가 나온다
		//오버라이딩한거라고 보면 됨
		//모든 클래스의 조상은 object *중요*
		//모든 클래스의 타입은 object *중요* 
		
		
		//Deprecated 이라 써있으면
		//사용가능하긴 하지만 버젼이 바뀌면 사라질수있어 사용하지말것을 권장하는 문구
		
	}

}
