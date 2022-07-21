package com.iu.util.map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class SetMain2 {

	public static void main(String[] args) {
		//Random
		//중복되지않는 데이터 1~45사이 숫자 6개 set에 담아서 출력
		Random random = new Random();
		
		HashSet<Integer> hs = new HashSet<>();
		
		boolean check =true;
		while(check) {
			if(hs.size()!=6) {
				hs.add(random.nextInt(45)+1);	//이렇게 하면 1이상 45미만 수 생성
			}else {
				break;
			}
		}	
		System.out.println("size=="+hs.size());
		
		Iterator<Integer> it = hs.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(hs);	//원래 이렇게 하면 참조변수라 주소가 들어가야하는데 오버라이딩된 것
								//[21, 22, 39, 26, 27, 43]
		System.out.println(random.nextInt(1));
	}

}
