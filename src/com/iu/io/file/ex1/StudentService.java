package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements Service{
	Scanner scan = new Scanner(System.in);
	StudentDAO studentDAO = new StudentDAO();
	
	@Override
	public ArrayList<StudentDTO> getList() throws Exception{
//		return studentDAO.getList(); 
		return null;
		
	}//getList
	
	@Override
	public int setList(ArrayList<StudentDTO> al)throws Exception{
		
		return 0;
	}//setList
	
	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> al)throws Exception{
		//StudentDAO의 setList를 호출하고 
		//그 결과를 리턴
//		return studentDAO.getStudent(al);
		return null;
		
	}//getStudent 검색
	
	@Override
	public int setStudentDelete(ArrayList<StudentDTO> al)throws Exception{
		
		return 0; 
	}

	@Override
	public void setStudentAdd(ArrayList<StudentDTO> al) throws Exception {
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("추가할 학생의 이름을 입력해주세요.");
		studentDTO.setName(scan.next());
		System.out.println("추가할 학생의 번호를 입력해주세요.");
		studentDTO.setNum(scan.nextInt());
		System.out.println("추가할 학생의 국어성적을 입력해주세요.");
		studentDTO.setKor(scan.nextInt());
		System.out.println("추가할 학생의 영어성적을 입력해주세요.");
		studentDTO.setEng(scan.nextInt());
		System.out.println("추가할 학생의 수학성적을 입력해주세요.");
		studentDTO.setMath(scan.nextInt());
		
		al.add(studentDTO);
	}
}
