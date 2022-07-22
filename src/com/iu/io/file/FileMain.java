package com.iu.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		//File : 파일이나 폴더의 정보를 담는 클래스
		//	   : 실제 파일이나 폴더가 없을 수도 있음
		
		File file = new File("C:\\study\\test.txt");	//폴더명+파일명
		file = new File("C:\\study", "test.txt");		//parent : 폴더 , Child : 파일명 또는 최종 폴더명
		
		//1. 폴더명 경로가 있는 File 객체 이용
		File path = new File("C:\\study");	//디렉토리
		file = new File(path,"test.txt");
		
		
		System.out.println(file.exists());	//파일이 존재하는지
		System.out.println(file.isFile());	//파일인가?
		System.out.println(file.isDirectory());	//디렉토리인가?
		System.out.println(file.length()); 		//파일의 크기 byte크기
		
		
		System.out.println("===========================");
		System.out.println(path.exists());	//파일이 존재하는지
		System.out.println(path.isFile());	//파일인가?
		System.out.println(path.isDirectory());	//디렉토리인가?
		
		//확장자가 없으면 폴더임
		file = new File("C:\\study\\sub");
		if(!file.exists()) {
			file.mkdir();
		}//if
		
		File file2 = new File("C:\\study\\sub2\\t1");	//안만들어짐 왜ㅐ? mkdir는 중간에 폴더가 존재하지않으면 생기지 않음 그니깐 애초에 sub2가 있는상태에서 t1을 써줘야 생성됨
//			file.mkdir();
			file2.mkdirs();
			
//			file.delete();// 지우기
//			file2.delete();	//sub2는 사라지지않고 t1만 지워짐
			
		File file3 = new File("C:\\study\\sub2");
			file3.delete();	//안지워짐 why? 폴더를 지울때는 안에 아무것도 없어야함 하지만 sub2안에는 t1이 존재하기때문에 지워지지않는것
	}

}
