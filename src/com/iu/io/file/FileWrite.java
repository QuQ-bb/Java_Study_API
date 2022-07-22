package com.iu.io.file;

import java.io.File;
import java.io.FileWriter;

public class FileWrite {

	public void write()throws Exception{
		File file = new File("C:\\study","test.txt");
		FileWriter fw = new FileWriter(file,true);

		fw.write("Today is Friday\r\n");
		fw.flush();//버퍼에있는걸 강제로 밀어서 저 파일을 쓰세욧..!하는 것
		//마치 주사기 처럼 다시 뒤로 땡겨야지돌아옴 \r
		
		fw.write("내일은 토요일\r\n");
		fw.flush();
	}
}
