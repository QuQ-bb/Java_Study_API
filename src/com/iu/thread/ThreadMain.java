package com.iu.thread;

public class ThreadMain {

	public static void main(String[] args) {
		//동시에 여러개를 사용하고싶으면 thread를 사용하면 됩니다.

		ThreadTest1  t1 = new ThreadTest1();
		ThreadTest2  t2 = new ThreadTest2();
		Thread t = new Thread(t2);
		//개발자가 직접 호출이아니라 
		//OS에게 실행부탁 .start()
		t1.start();
		t.start();	//실행순서는 자기마음대로
		
		
	}

}
