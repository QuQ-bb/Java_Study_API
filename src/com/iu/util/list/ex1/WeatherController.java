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
				System.out.println("검색할 지역을 입력해주세요.");
				break;
			case 4:
				ws.add(al);
				break;
			case 5:
				break;
			case 6:
				System.out.println("프로그램 종료");
				button=!button;
				break;
			
			}
			
		}
	}
}
