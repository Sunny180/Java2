package com.tom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt("35");
		File file = new File("aa.txt");
		System.out.println(file.exists());
		System.out.println(file.canWrite());
		System.out.println(file.isHidden());
		System.out.println(file.length());
		System.out.println(file.getName());
		
		
/*		try {
			FileReader fr = new FileReader("aa.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
