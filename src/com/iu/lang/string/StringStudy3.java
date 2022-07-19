package com.iu.lang.string;

public class StringStudy3 {
	
	public void studySplit3() {
		String info = "서울,대전-대구,부산-제주,광주-강릉";
		info = info.replace('-', ',');	//전처리 작업 : 데이터를 처리하기 전에 다듬어서 처리하는것 
		String[] citys = info.split(",");
		
		for(String city :citys) {
			System.out.println(city);
		}
	}
	
	//31-17 =14
	public void studySplit2() {
		String info= "1997 12 24";
		
		String [] infos =info.split(" ");
		
		for(String minfo : infos) {
			System.out.println(minfo);
		}
		for(int i=0; i<infos.length; i++) {
			String minfo = infos[i];
		}
	}

	public void studySplit() {
		String str = "iu,suji,choa,hani";
		String str2 = new String("");
		
		String[] names = str.split(",");
		
		//for ->for (초기식;조건식;증감식){}
		//향상된 for문
		//for(배열에모은데이터타입 변수명 : 배열참조변수명){}
		for(int i=0; i<names.length; i++) {
			String name = names[i];
		}
		
		for(String name: names) {
			System.out.println(name);
		}
		//향상된 for문은 중간에 끊어내기가 어렵지만 일반 for문은 i값이 주어지기때문에 쉬움
		//분리하기 parsing
	}
}
