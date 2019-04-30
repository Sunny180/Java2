package com.tom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrlist = new ArrayList<>();
		arrlist.add(15);
		arrlist.add(86);
		arrlist.add(56);
		arrlist.add(95);
		for(Integer number: arrlist) {
			System.out.println("Number= "+ number);
		}
		int retval= arrlist.get(3);
		System.out.println("Retrieved element is = "+ retval);
		
		List<Integer> arralist = new ArrayList<>();
		arralist.add(57);
		arralist.add(89);
		arralist.add(51);
		arralist.add(23);
		
		System.out.println("Number = "+arralist);
		
		arralist.set(3, 100);
		System.out.println("Print this list:");
		for(Integer number:arralist) {
			System.out.println("Number=" + arralist);
		}
		Map<Integer, String> map= new HashMap();
		map.put(1, "tutorials");
		map.put(2, "point");
		map.put(3, "is best");
		String val =map.get(3);
		System.out.println("value for key 3 is :"+val);
		
	}

}

