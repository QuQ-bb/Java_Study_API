package com.iu.util.list;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		//1,2,3
		int [] nums = new int[3];
		nums[0] =1;
		
		// 1.List -> ArrayList
		ArrayList al = new ArrayList();	//배열은 처음에 몇개를 만들지 선언해줘야한다
		//object는 모든 타입을 다 받을수 있다.
		al.add(1);	//Auto-boxing되어 들어간것 primitive - >reference
		al.add(2);
		al.add(3);
		al.add(4);	//필요할때마다 추가해서 넣으면 됨
		al.add(0);
		al.add(1,"abc");	//1번 인덱스에 삽입
		
		ListView lv = new ListView();
		lv.view(al);
		
		//remove -특정 인덱스 번호의 요소를 삭제
		al.remove(2);
		al.remove("abc");
		lv.view(al);
		
		//set 	-특정 인덱스번호의 요소를 수정
		al.set(1, 'c');
		lv.view(al);
		
		//clear	-모든 요소를 삭제
		al.clear();
		lv.view(al);
	}

}
