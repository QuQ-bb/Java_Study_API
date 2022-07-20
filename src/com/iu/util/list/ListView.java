package com.iu.util.list;

import java.util.ArrayList;

public class ListView {
	
	public void view(ArrayList al) {
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("========================");
		
	}

}
