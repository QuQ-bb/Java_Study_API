package com.java.lang.ex1;

import com.java.lang.Car;

public class Phone {

	private int price;
	private int size;
	
	//equals 메서드 오버라이딩
	//각 멤버의 값이 같으면 true, 하나라도 틀리면 flase리턴
	//Hint : 참조변수 this
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	public boolean equals(Object obj) {
			Phone p3 = (Phone)obj;
			//this.getPrice() p3.getPrice();	//this == p1
			boolean check = false;
			if(this.getPrice() == p3.getPrice() && this.getSize() == p3.getSize()) {
				return true;
			}else {
				return false;
			}
	}
	

	
	//p1과 p2의 데이터 값을 비교한다
	//equal 메서드를 사용
	//매개변수로 값을 받아서 참조변수this를 사용하여 값을 비교한다.
	
	
	
}
