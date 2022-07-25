package com.iu.thread;

public class ThreadTest2 implements Runnable{
	//인터페이스는 추상메소드만 가지고있어요
	@Override
	public void run() {
		this.getAlpha();
	}
	
	private void getAlpha() {
		for(int i='a'; i<'z'+1; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
