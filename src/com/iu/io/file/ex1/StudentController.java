package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

	//start메서드
	//1. 학생정보출력 - 모든 학생정보 출력
	//2. 학생정보검색 - 학생 한명의 정보 (getStudent)
	//3. 학생정보추가 - 학생의 정보를 List에 추가 (setStudentAdd)
	//4. 학생정보삭제 - 학생 학명의 정보를 제거 
	//5. 백업하기	  - 추가,삭제하게 되면 그게 파일에 반영되게 하도록(setList)
	//6. 프로그램종료
	Scanner scan = new Scanner(System.in);
	StudentDAO dao = new StudentDAO();
	StudentView sw = new StudentView();
	StudentService ss = new StudentService();
	ArrayList<StudentDTO> al = new ArrayList<>();
	public void start()throws Exception {
		boolean check = true;
		while(check) {
			System.out.println("1. 학생정보출력");
			System.out.println("2. 학생정보검색");
			System.out.println("3. 학생정보추가");
			System.out.println("4. 학생정보삭제");
			System.out.println("5. 학생정보백업");
			System.out.println("6. 종료");
			int select = scan.nextInt();
			switch(select) {
			case 1:
				//학생정보출력
				dao.getList();
				break;
			case 2:
				
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				dao.setList(al);
				break;
			case 6:
				System.out.println("프로그램 종료");
				check = !check;
				break;
			}
		}
		
	}
}
