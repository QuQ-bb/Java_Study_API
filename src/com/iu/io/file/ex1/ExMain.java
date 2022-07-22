package com.iu.io.file.ex1;

public class ExMain {

	public static void main(String[] args)throws Exception {
		
		StudentDTO studentDTO = new StudentDTO();
		StudentDAO studentDAO = new StudentDAO();
		StudentController sc = new StudentController();
		
//		studentDAO.getList();
		sc.start();
		
	}

}
