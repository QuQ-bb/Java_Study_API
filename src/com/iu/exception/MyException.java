package com.iu.exception;

public class MyException extends Exception{	//Exception 상속받기
	
	public MyException() {
		super("몰라요 산수 포기");
	}

	public MyException(String message) {
		super(message);	//이게 원래는 생략되어있는것
	}

}
