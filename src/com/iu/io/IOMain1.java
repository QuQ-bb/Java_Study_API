package com.iu.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain1 {

	public static void main(String[] args) {
		//키보드로부터 글자를 입력받는 순서 작성
		InputStream is = System.in; //byte처리 system.in은 키보드를 얘기하는것
		InputStreamReader ir = new InputStreamReader(is);	//글자 한글자만 처리가능
		BufferedReader br = new BufferedReader(ir);

		try {
			System.out.println("키보드에서 입력 후 엔터");
			String msg = br.readLine();
			System.out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
