package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
//	Weathercontroller
	//start
	//1.날씨정보 초기화 -init()
	//2.전국날씨 출력 - view
	//3.지역날씨 검색	-find
	//4.지역정보 추가
	//5.지역정보 삭제
	//6.프로그램 종료
	
//	wc는 ws에 의존적이다 참조한다
//	wc는 wv를 참조한다.
//	참조한다는건 wc에 ws객체가 있어야함
		//결합도가 강하다(높다) : 자체에서 객체 생성
		//결합도가 느슨하다(낮다) : 매개변수를 통해서 만들어진 객체를 주입
//							: 생성자의 매개변수,
	
	private WeatherService ws;
	private WeatherView wv;
	private Scanner scan;
	
	public WeatherController() {
		this.ws = new WeatherService();
		this.wv = new WeatherView();
		this.scan = new Scanner(System.in);
	}
	public WeatherController(WeatherService ws) {
		this.ws = ws;
	}
	
	public void start() {
		ArrayList<CityDTO> al = new ArrayList<>();	//heap영역에 아무것도 없지만 기본적으로 10개가 만들어짐
		WeatherService ws = new WeatherService();
		WeatherView wv = new WeatherView();
		Scanner scan = new Scanner(System.in);
		boolean button = true;
		while(button) {
			System.out.println("1. 날씨정보 초기화");
			System.out.println("2. 전국날씨 출력");
			System.out.println("3. 지역날씨 검색");
			System.out.println("4. 지역정보 추가");
			System.out.println("5. 지역정보 삭제");
			System.out.println("6. 프로그램 정료");
			int select = scan.nextInt();
			switch(select) {
			case 1:
				ws.init(al);
				System.out.println("날씨정보 초기화 완료");
				break;
			case 2:
				wv.view(al);
				break;
			case 3:
				//wv.view(ws.find(al));
				CityDTO cityDTO = ws.find(al);
				if(cityDTO != null) {
					wv.view(cityDTO);
				}else {
					wv.view("잘못된 도시명");
				}
				System.out.println("검색.");
				break;
			case 4:
				//ws.add(al);
				boolean result =ws.add(al);
				String message ="추가 실패";
				if(result) {
					message ="추가 성공";
				}
				wv.view(message);
				break;
			case 5:
				boolean result1 = ws.remove(al);
				String message1 ="삭제 실패";
				if(result1) {
					message1 ="삭제 성공";
				}
				wv.view(message1);
				break;
			case 6:
				System.out.println("프로그램 종료");
				button=!button;
				break;
			
			}
			
		}
	}
}
