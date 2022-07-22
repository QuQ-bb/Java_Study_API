package com.iu.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
		//Data Access Object
		//file data에 접근
	//2.setList
	public int setList(ArrayList<StudentDTO> al){
		//예외처리는 내부에서 처리
		//List로 받은 데이터들을 studentData에다가 작성
		//기존의 내용은 삭제
		//작성형식은 기존 내용의 형식과 동일하게
		//1을 리턴 : 정상적인 성공
		//0을 리턴 : 예외가 발생 했을 경우
		File file = new File("C:\\study\\studentData.text");
		FileWriter fw = new FileWriter(file);
		
		fw.write("jayp,30,56,75,38");
		fw.flush();
		
		return 0;
	}
	

	//1. getList 메서드
	//	studentData 파일의 내용을 읽어서 작업
	// list이용해서 return하기
	public void getList() throws Exception{
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
			studentDTO.setTotal();
			studentDTO.setAvg();
			al.add(studentDTO);
			
//			return al.add(studentDTO);
		}//if
		}
		
	}
}//getList
