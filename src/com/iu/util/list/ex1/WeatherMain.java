package com.iu.util.list.ex1;

import java.util.ArrayList;

public class WeatherMain {

	
	public static void main(String[] args) {
		//1.클래스의 역할과 메서드의 역할, 변수의 역할
		// weathermain			//프로그램실행,테스트 이외는 사용하지마세요
		// weatherService		//Data 가공
		// weatherController	//관리
		// weatherView			//출력전용
		// CityDTO				//Data
		CityDTO cityDTO = new CityDTO();
		ArrayList<CityDTO> al = new ArrayList<>();
			//		WeatherMain 메인
			//	dto에는 필요한곳에서 선언
			//	m- > wc -> ws
			//	m -> wc -> wv
		WeatherController wc = new WeatherController();
		//wc.start();
		
		WeatherService ws = new WeatherService();
//		 ws.init(al);
		
		WeatherView wv = new WeatherView();
//		wv.view(al);
		wv.view("Test");
		
		CityDTO cityDTO2 = new CityDTO();
		
		al.add(cityDTO);
		al.add(cityDTO2);
		wv.view(al);
	}

}
