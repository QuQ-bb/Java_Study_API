package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
	
	public void send()throws Exception {
		Scanner scan = new Scanner(System.in);
		Socket socket = new Socket("192.168.7.17",8289);	//host -도메인 네임
		
		System.out.println("Server 접속완료");
		
		OutputStream os =null;
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;
		InputStream is=null;
		InputStreamReader ir=null;
		BufferedReader br=null;
		String message=null;
		boolean flag = true;
		while(flag) {
			System.out.println("서버로 보낼 메세지 입력");
			message = scan.next();
			
//		String message ="Hello Server!!";
			//연결준비 완료
			os = socket.getOutputStream();	//0,1을 처리한다
			ow = new OutputStreamWriter(os);//문자 한글자를 처리
			bw = new BufferedWriter(ow);
			
			//전송
			bw.write(message+"\r\n");
			bw.flush();//버퍼에 담아놓고 보낸다 버퍼특-꽉차지않으면 보내지않음 그래서 강제로 보내버림
			
			if(message.toUpperCase().equals("Q")) {
				break;
			}
			
			//==============================================
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			message =br.readLine();
			
			if(message.toLowerCase().equals("q")) {
				break;
			}
			System.out.println("Server:" + message);
			
			
		}//while
		br.close();
		ir.close();
		is.close();
		
		bw.close();
		ow.close();
		os.close();
		
		socket.close();
	}

}
