package com.iu.lang.string.ex1;

import java.util.StringTokenizer;

public class WorkerService {

	//private String info;
	private StringBuffer sb;
	private StringTokenizer st;
	
	public WorkerService() {
		//늘어나도 줄어들수도 있다
		sb = new StringBuffer();
		
		 sb.append( "iu-인사과-과장-0101111");
		 sb.append(",suji-it-대리-0102222");
		 sb.append(",choa-영업-부장-0103333");
		 sb.append(",hani-마케팅-사원-0104444");
	}
	
	public WorkerDTO[] init() {
		 System.out.println(sb);
		//info에 있는 데이터를 parsing해서 workDTO에 대입하고 
		//workerDTO를 모은 배열을 리턴
		//각각의 멤버변수에 값을 넣는 방법..
		
//		System.out.println(info);
//		System.out.println();
//		info = info.replace("-", ",");
//		String[] infos = info.split(",");
//		WorkerDTO wd = new WorkerDTO();
//		
//		
//		for(int i=0; i<infos.length; i++) {
//			String member = infos[i];
//		}
//			
//		for(String member:infos) {
//			System.out.println(member);
//		}
//		
//		for(int n=0; n<infos.length; n=n+4) {
//		}
//		for(int d=1; d<infos.length; d=d+4) {
//			
//		}
//		for(int j=2; j<infos.length; j=j+4) {
//		
//		}
//		for(int p=3; p<infos.length; p=p+4) {
//			
//		}
//		
		//dto =infos;
		System.out.println("강사님 코드==================================================================================================");
//		
		
		String info = sb.toString();
		String newInfo= info.replace(",", "-");
		st= new StringTokenizer(newInfo, "-");
		
		WorkerDTO[] workerDTOs = new WorkerDTO[st.countTokens()/4];
		
		int index=0;
		while(st.hasMoreTokens()) {
			WorkerDTO workerDTO = new WorkerDTO();
			workerDTO.setName(st.nextToken());
			workerDTO.setDepartment(st.nextToken());
			workerDTO.setJob(st.nextToken());
			workerDTO.setPhone(st.nextToken());
			workerDTOs[index] =workerDTO;
			index++;
		}
		
		
//		String[] infos = newInfo.split("-");
//		WorkerDTO[] workerDTOs = new WorkerDTO[infos.length/4];
//		
//		for(int i=0; i<infos.length; i++) {
//			
//			WorkerDTO workerDTO = new WorkerDTO();
//			workerDTOs[i/4] = workerDTO;
//			workerDTO.setName(infos[i].trim());
//			workerDTO.setDepartment(infos[++i].trim());
//			workerDTO.setJob(infos[++i].trim());
//			workerDTO.setPhone(infos[++i].trim());
//		}
		
		
		
		return workerDTOs;
		
		
	}
}
