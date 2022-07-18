package com.java.lang.ex1;

public class EqualMain {

	public static void main(String[] args) {
		Object obj = new Object();
		Phone p1 = new Phone();
		p1.setPrice(100);
		p1.setSize(50);
		
		
		Phone p2 = new Phone();
		p2.setPrice(100);
		p2.setSize(40);
		System.out.println(p1 ==p2); //false 왜냐면 주소값을 비교하는거기때문에
		System.out.println(p1.equals(p2));// false
		System.out.println(p1.toString());
		
		System.out.println(p1.equals(p2));
	}

}
