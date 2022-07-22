package com.iu.io.file.ex1;

import java.util.ArrayList;

public class StudentView {
	
	//view3개
	//1.String 출력
	//2.StudentDTO 출력
	//3.ArrayList출력
//	public void view(String) {
//		
//	}
//	public void view(StudentDTO studentDTO ) {
//		
//	}
	public void view(ArrayList<StudentDTO> al) {
	for(int i=0; i<al.size(); i++) {
		System.out.println("이름= "+al.get(i).getName());
		System.out.println("번호= "+al.get(i).getNum());
		System.out.println("국어= "+al.get(i).getKor());
		System.out.println("영어= "+al.get(i).getEng());
		System.out.println("수학= "+al.get(i).getMath());
		System.out.println("총점= "+al.get(i).getTotal());
		System.out.println("평균= "+al.get(i).getAvg());
		System.out.println("========================");
	}//for
//		
	}

}
