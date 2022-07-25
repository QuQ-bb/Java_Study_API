package com.iu.io.file.ex1;

import java.util.ArrayList;

public class ExMain {

	public static void main(String[] args)throws Exception {
		ArrayList<StudentDTO> al = new ArrayList<>();
		StudentDTO studentDTO = new StudentDTO();
		StudentDAO studentDAO = new StudentDAO();
		StudentController sc = new StudentController();
		StudentService ss = new StudentService();
		StudentView sw = new StudentView();
//		studentDAO.getList();
		sc.start();
		
//		studentDAO.getList();
//		studentDAO.setList(al);
//		sw.view(al);
		
		
	}

}
