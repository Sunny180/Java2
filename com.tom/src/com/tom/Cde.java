package com.tom;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Cde {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(47);
		Map<Integer,Integer>m= new HashMap<>();
		for(int i=0; i<10000; i++) {
			int r = rand.nextInt();
			Integer fret = m.get(r);
			if(fret ==null) {
				fret = 1;
			}else {
				fret = fret+1;
			}
			m.put(r, fret);
			
			
		}
		System.out.println(m);
	}

}
