package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

	//getFood
	//서버랑 접속 후
	//1. 점심메뉴
	//2. 저녁메뉴
	//3. 종료
	//번호를 입력받아서 server로 전송
	//받아서 출력
	
	public void getFood()throws Exception {
		Scanner scan = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.28", 8282);
		//객체가 잘만들어지면 server와 잘 연경됐다는것
		System.out.println("Server 접속완료");
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		String food =null;
		
		boolean check = true;
		
		while(check) {
			System.out.println("1.점심메뉴");
			System.out.println("2.저녁메뉴");
			System.out.println("3.프로그램 종료");
			int select = scan.nextInt();
			//입력
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			bw.write(select +"\r\n");
			bw.flush();
			
			if(select ==3) {
				break;
			}
			//-------------------------------------
			//출력
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br= new BufferedReader(ir);
			
			String message = br.readLine();
			System.out.println(message);
			
		}//while
		bw.close();
		ow.close();
		os.close();
		
		br.close();
		ir.close();
		is.close();
		
		socket.close();
		
		
	}
	
	
}
