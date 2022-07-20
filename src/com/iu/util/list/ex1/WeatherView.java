package com.iu.util.list.ex1;

import java.util.ArrayList;

public class WeatherView {
//	weatherview 클랫
//	리스트를 받아서 모든 정보를 출력
//	view
//	city하나를 받아서 모든 정보를 출력
//	view
//	메세지String하나를 받아서 출력
	
	public void view(ArrayList<CityDTO> al) {
		for(int i=0; i<al.size(); i++) {
			CityDTO cityDTO = al.get(i);
			this.view(cityDTO);
			//이렇게하면 돌면서  cityDTO를 매개변수로 가능 VIEW를 출력해서 굳이 아래있는 출력문을 또 쓸필요가없음
//			System.out.println(al.get(i).getName());
//			System.out.println(al.get(i).getGion());
//			System.out.println(al.get(i).getHum());
//			System.out.println(al.get(i).getStatus());
			System.out.println("===============================");
		}//for
	}//view
	public void view(String message) {
		System.out.println(message);
	}
	public void view(CityDTO cityDTO) {
		System.out.println(cityDTO.getName());
		System.out.println(cityDTO.getGion());
		System.out.println(cityDTO.getHum());
		System.out.println(cityDTO.getStatus());
	}
}
