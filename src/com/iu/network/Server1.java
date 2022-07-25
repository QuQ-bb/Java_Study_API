package com.iu.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server1 {
	
	public void receive()throws Exception {
		Scanner scan = new Scanner(System.in);
		
		ServerSocket serverSocket = new ServerSocket(8289);
		//서버 오픈하고 Client의 접속을 기다림
		System.out.println("Client 접속 기다리는 중");
		//Socket : 상대방과 1:1 통신
		Socket socket = serverSocket.accept();
		System.out.println("Client 접속 완료");
		
		OutputStream os=null;
		OutputStreamWriter ow=null;
		BufferedWriter bw=null;
		InputStream is=null;
		InputStreamReader ir=null;
		BufferedReader br=null;
		String message=null;
		boolean check = true;
		while(check) {
			
			is = socket.getInputStream();	//0,1을 처리하는것
			ir = new InputStreamReader(is);	//0,1을 모아서 처리
			 br = new BufferedReader(ir);	
			message = br.readLine();	//한줄 읽어오기
			
			if(message.toUpperCase().equals("Q")) {
				break;
			}
			
			System.out.println("Client:" + message);
			
			
			System.out.println("Client에 보낼 메세지 입력");
			message = scan.next();
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			bw.write(message+"\r\n");
			bw.flush();
			
			if(message.toUpperCase().equals(message)) {
				break;
			}
			
		}//while
		
		br.close();
		ir.close();
		is.close();
		
		bw.close();
		ow.close();
		os.close();
		
		
		socket.close();
		serverSocket.close();
		
	}

}
