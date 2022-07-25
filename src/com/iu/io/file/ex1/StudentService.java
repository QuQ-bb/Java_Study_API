package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements Service{
	Scanner scan = new Scanner(System.in);
	private StudentDAO studentDAO;
	
	public StudentService() {
		this.studentDAO = new StudentDAO();
	}
	
	@Override
	public ArrayList<StudentDTO> getList() throws Exception{
		ArrayList<StudentDTO> al = studentDAO.getList(); 
		
		for(StudentDTO studentDTO: al) {
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
		}
		return al;
		
	}//getList
	
	@Override
	public int setList(ArrayList<StudentDTO> al)throws Exception{
		
		return studentDAO.setList(al);
	}//setList
	
	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> al)throws Exception{
		//StudentDAO의 setList를 호출하고 
		//그 결과를 리턴
		StudentDTO studentDTO = null;
		System.out.println("검색할 학생 번호 입력");
		int num = scan.nextInt();
		
		for(StudentDTO studentDTO2:al) {
			if(num ==studentDTO2.getNum()) {
				studentDTO = studentDTO2;
				break;
			}
		}
//		return studentDAO.getStudent(al);
		return studentDTO;
		
	}//getStudent 검색
	
	@Override
	public int setStudentDelete(ArrayList<StudentDTO> al)throws Exception{
		int result =0;
		
		System.out.println("삭제하려는 학생의 번호를 입력해주세요.");
		int del = scan.nextInt();
		for(int i=0; i<al.size(); i++) {
			if(del == al.get(i).getNum()) {
				StudentDTO st= 	al.remove(i);
				if(st != null) {
					result =1;
					System.out.println("삭제성공");
				}//if
				System.out.println("삭제 실패");
			}//if
		}//for
		return result; 
	}//delete

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
		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3.0);
		
		al.add(studentDTO);
	}
}
