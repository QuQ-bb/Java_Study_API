package com.iu.util.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("n1", 10);
		map.put("n2", 20);
		map.put("third", 270);
		
		System.out.println(map.size());	
		System.out.println(map.isEmpty());	
		
		int num = map.get("third");
		System.out.println(num);
		
		//1. key들을 알아내야 한다. (순서유지x)
		boolean check = map.containsKey("n2");
		System.out.println(check);
		
		Set<String> set = map.keySet();
		
		Iterator<String> it = set.iterator();	//데이터들을 열거해서 갖고있음
		
		while(it.hasNext()) {	//다음 요소가 있습니까?
			String key = it.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		System.out.println(map);  //{n1=10, n2=20, third=270}
		//2. 
	}

}
