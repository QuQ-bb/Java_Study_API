package com.iu.io.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	
	public void read() throws FileNotFoundException,IOException{
//		FileRead fr = new FileRead();
//		fr.read();
		//파일의 내용 읽어오기
		//1.어느 폴더의 어느 파일
		File file = new File("C:\\study","test.txt");
		//2.파일과 연결준비
		FileReader fr = new FileReader(file);
		//3.파일의 내용 읽기
//		fr.read();	//한글자씩 읽어내기때문에 효용성이 떨어짐 영어는 가능하지만 한글은 2byte만큼 읽어야 하기때문에 깨짐
		BufferedReader br = new BufferedReader(fr);	//문자를 읽음
		
		//4.내용 읽기
		boolean check = true;
		while(check) {
			String name = br.readLine();	//엔터키를 만날때까지 읽어옴
			if(name==null) {
				break;//빈문자열 왔다갔다 할수있으면 NULL이 아니다
			}//if
			System.out.println(name);
		}//while
		fr.close();
	}

}
