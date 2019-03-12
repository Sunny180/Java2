package com.tom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Def {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] freqs = new int[20];
		List<Integer> list = new ArrayList<>();
		for (int i=0; i<10000; i++) {
			int r = rand.nextInt(20);
			list.add(r);
			freqs[r]++;
		}
		for(int i=0; i< freqs.length; i++) {
			System.out.println(i+":"+freqs[i]);
		}
	}

}
