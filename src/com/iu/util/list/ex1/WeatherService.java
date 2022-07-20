package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WeatherService {
	
	private StringBuffer sb;
	private StringTokenizer st;
	Scanner scan =new Scanner(System.in);
	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul,30.2,70,맑음,");
		sb.append("Deagu-38.9-90-흐림-");
		sb.append("Jeju,12.1,10,눈-");
		sb.append("Busan-0.5-85-태풍");
	}
	
		//weatherService init메서드 -sb에 있는 데이터들을 파싱해서 CityDTO에 담아서 리턴
		//ADD메서드 CITY정보를 입력받아서 추가 -ARRAYlIST에
		//remove메서드 도시명을 입력받아서 리스트에서 삭제
		//find메서드 도시명을 입력받아서 리스트에서 검색 리턴 없으면 없다고 시키기
	


	public void init(ArrayList<CityDTO> al) {
		//System.out.println(sb);
		String cityInfo = sb.toString();
		String citys = cityInfo.replace(",", "-");
		//System.out.println(citys);
		
		//같은걸로 통일한 후 제거 해준다.
		st= new StringTokenizer(citys, "-");
		
		//System.out.println(st.countTokens());
		while(st.hasMoreTokens()) {
			
//			String 
			CityDTO cityDTO = new CityDTO();
			cityDTO.setName(st.nextToken());
			String n = st.nextToken();
			double d= Double.parseDouble(n);
			cityDTO.setGion(d);
//			cityDTO.setGion(Double.parseDouble(st.nextToken()));
			String h = st.nextToken();
			int i = Integer.parseInt(h);
			cityDTO.setHum(i);
//			cityDTO.setHum(Integer.parseInt(st.nextToken()));
			cityDTO.setStatus(st.nextToken());
			al.add(cityDTO);
		}
		
		
		//al.add(DTO);
			
			
			
		}
	public void add(ArrayList<CityDTO> al) {
		//ADD메서드 CITY정보를 입력받아서 추가 -ARRAYlIST에
		CityDTO cityDTO = new CityDTO();
		
		System.out.println("추가할 도시명을 입력해주세요.");
		cityDTO.setName(scan.next());
		System.out.println("추가할 도시의 기온을 입력해주세요.");
		cityDTO.setGion(scan.nextDouble());
		System.out.println("추가할 도시의 습도를 입력해주세요.");
		cityDTO.setHum(scan.nextInt());
		System.out.println("추가할 도시의 날씨를 입력해주세요.");
		cityDTO.setStatus(scan.next());
		
		al.add(cityDTO);
		
	}
	public void remove(ArrayList<CityDTO> al) {
		//remove메서드 도시명을 입력받아서 리스트에서 삭제
		System.out.println("삭제할 도시명을 입력해주세요.");
		//이것두 검색이랑 똑같은데 우째함? ㅇㅅㅇ
		//String으로 받아서 어떻게 알수있을까?ㅇㅅㅇ?
		//String 으로 입력받아서 호출해야돼 어케하지 
		// cityDTO.getName
		String del = scan.next();
		
		for(int i=0; i<al.size(); i++) {
			
		}
		
		
		
	}
	public CityDTO find(ArrayList<CityDTO> al) {
		//find메서드 도시명을 입력받아서 리스트에서 검색 리턴 없으면 없다고 시키기
		CityDTO cityDTO = new CityDTO();
		System.out.println("검색할 도시명을 입력해주세요.");
		//도시명 받아서 String이잖아 일단 대,소문자 전부 가능하게 하기
		String search = scan.next();
		if(search == cityDTO.getName()) {
			//해당 도시의 정보를 가져온다
			System.out.println();
		}
		
		return cityDTO;
	}

}
