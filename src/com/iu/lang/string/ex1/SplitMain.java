package com.iu.lang.string.ex1;

public class SplitMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WorkerService ws = new WorkerService();
		ws.init();
		
		WorkerView wv = new WorkerView();
		WorkerDTO[] workerDTOs = ws.init();
		wv.init(workerDTOs);
		
//		int num=10;
		
		//String.valueOf(); //위에 있는 int num을 문자열 10으로 바꿔주세요
//		String str =String.valueOf(num);
//		System.out.println(str);	//10 숫자 10이 아니라 문자열 10
	}

}
