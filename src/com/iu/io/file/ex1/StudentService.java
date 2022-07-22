package com.iu.io.file.ex1;

import java.util.ArrayList;

public class StudentService implements Service{
	StudentDAO studentDAO = new StudentDAO();
	
	@Override
	public ArrayList<StudentDTO> getList() throws Exception{
		
		return null;
	}//getList
	
	@Override
	public int setList(ArrayList<StudentDTO> al)throws Exception{
		
		return 0;
	}//setList
	
	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> al)throws Exception{
		
		return null;
	}//getStudent 검색
	
	@Override
	public int setStudentDelete(ArrayList<StudentDTO> al)throws Exception{
		
		return 0; 
	}

	@Override
	public void setStudentAdd(ArrayList<StudentDTO> al) throws Exception {
		// TODO Auto-generated method stub
		
	}
}
