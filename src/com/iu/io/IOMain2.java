package com.iu.io;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOMain2 {

	public static void main(String[] args) {
		//0,1이 입력된다 그걸 조합하고 모아서 문자를 만들고 그걸 문자열로만들어서 출력
		InputStream is = System.in; //0,1
		InputStreamReader ir = new InputStreamReader(is); //글자를 연결해준다
		BufferedReader br = new BufferedReader(ir);
		//여기까지하면 키보드와의 연결이 끝
		
		System.out.println("입력");
		try {
			String message =  br.readLine();
			System.out.println(message);	//에러가 발생하지 않을시 출력
		}catch(Exception e) {
			e.printStackTrace();//에러 추적해서 출력
		}finally {	//예외가 발생하든 발생하지않든 출력시켜줌
			//연결된 역순으로 자원 해체
			try {
				//연결해체 시켜주기 
				br.close();
				ir.close();
				is.close();	
				
			}catch(Exception e) {
				
			}
			
			
		}
		
		
		
//		Scanner scan = new Scanner(System.in);
//		//DDOS : Denial Of Service
//		
//		scan.close();	//연결해제
		
	}

}
