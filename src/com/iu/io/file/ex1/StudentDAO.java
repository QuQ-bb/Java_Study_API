package com.iu.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
		//Data Access Object
		//file data에 접근
	Scanner scan = new Scanner(System.in);
	
	public void setStudentAdd(ArrayList<StudentDTO> al) {
		//학생 한명을 추가
		
	}
	
	public int setStudentDelete(ArrayList<StudentDTO> al)throws Exception {
		//삭제하려는 학생의 번호를 입력받아서
		//일치하는 학생은 삭제
		//삭제가 성공하면 1을 리턴, 실행 0을 리턴
		System.out.println("삭제하려는 학생의 번호를 입력해주세요.");
		int del = scan.nextInt();
		for(int i=0; i<al.size(); i++) {
			if(del == al.get(i).getNum()) {
				al.remove(i);
				System.out.println("삭제성공");
				return 1;
			}
		}
		System.out.println("삭제 실패");
		return 0;

	}
	
	public StudentDTO getStudent(ArrayList<StudentDTO> al) {
		//찾으려는 학생의 번호를 입력받아서
		//찾은 학생을 리턴
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("찾으려하는 학생의 학생번호를 입력해주세요.");
		int sn = scan.nextInt();
		for(int i =0; i<al.size(); i++) {
			if(sn == al.get(i).getNum()) {
				studentDTO = al.get(i);
			}
		}
		return studentDTO;
		//학생의 번호를 입력받고 학생의 번호를 찾아준다 dto에 저장한 결과를 저장한 al에서
		//그리고 그 학생의 번호에 맞는 출력값을 내어준다
		
	}
	
	
	//2.setList
	public int setList(ArrayList<StudentDTO> al){
		//예외처리는 내부에서 처리
		//List로 받은 데이터들을 studentData에다가 작성
		//기존의 내용은 삭제
		//작성형식은 기존 내용의 형식과 동일하게
		//1을 리턴 : 정상적인 성공
		//0을 리턴 : 예외가 발생 했을 경우
		File file = new File("C:\\study\\studentData.txt");
		FileWriter fw =null;
		int result =1;
		
		try {
			FileReader fr = new FileReader(file);
			fw = new FileWriter(file,true);
			fw.write("\r\n");
			for(StudentDTO studentDTO : al) {
				StringBuffer stringBuffer = new StringBuffer();
				stringBuffer.append(studentDTO.getName()+",");
//				stringBuffer.append(",");	//이렇게도 가능
				stringBuffer.append(studentDTO.getNum()+",");
				stringBuffer.append(studentDTO.getKor()+",");
				stringBuffer.append(studentDTO.getEng()+",");
				stringBuffer.append(studentDTO.getMath()+"\r\n");
				fw.write(stringBuffer.toString());
			}
			fw.flush();
		}catch(Exception e){
		StudentDTO studentDTO = new StudentDTO();
		
		}
		return result;
		
	}
	

	//1. getList 메서드
	//	studentData 파일의 내용을 읽어서 작업
	// list이용해서 return하기
	public ArrayList<StudentDTO> getList() throws Exception{
		ArrayList<StudentDTO> al = new ArrayList();
		File file = new File("C:\\study\\studentData.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		StringTokenizer stt = null;
		String st =" ";
		
			
		boolean check =true;
		while(check) {
			st= br.readLine();	//st :iu,1,56,54,85
//			st= br.readLine();	//st :choa,2,86,95,75
			if(st ==null) {
				break;
			}else if(st.equals("")==true) {
				continue;
			}//if
//			System.out.println(st.equals(""));
			stt = new StringTokenizer(st, ",");
//			System.out.println("갯수"+stt.countTokens());

		
		if(stt.hasMoreTokens()) {
			StudentDTO studentDTO =new StudentDTO();
			studentDTO.setName(stt.nextToken());
			studentDTO.setNum(Integer.parseInt(stt.nextToken()));
			studentDTO.setKor(Integer.parseInt(stt.nextToken()));
			studentDTO.setEng(Integer.parseInt(stt.nextToken()));
			studentDTO.setMath(Integer.parseInt(stt.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			al.add(studentDTO);
			
//			return al.add(studentDTO);
		}//if
//		for(int i=0; i<al.size(); i++) {
//			System.out.println("이름= "+al.get(i).getName());
//			System.out.println("번호= "+al.get(i).getNum());
//			System.out.println("국어= "+al.get(i).getKor());
//			System.out.println("영어= "+al.get(i).getEng());
//			System.out.println("수학= "+al.get(i).getMath());
//			System.out.println("총점= "+al.get(i).getTotal());
//			System.out.println("평균= "+al.get(i).getAvg());
//			System.out.println("========================");
//		}//for
	  }//while
		return al;
		
	}
}//getList
