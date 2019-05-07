package com.tom;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i++; i<=2000000) {
			
		}
		File dir = new File("c:\\upfile");
		if(dir.exists()&& dir.isDirectory()) {
			File[] files = dir.listFiles();
			for(File f :files) {
				if(f.isFile()) {
				System.out.println(f.getName());
				}
			}
			System.out.println(dir.mkdir());
			File dd = new File(dir,"aaa\\bb\\c");
			System.out.println(dd.mkdirs());
			System.out.println(dd.delete());
		}
/*		File dir = new File("c:\\upfile");
		if(dir.exists()&& dir.isDirectory()) {
			String[] files = dir.list();
			for(String s :files) {
				System.out.println(s);
			}
		}*/
//		int n = Integer.parseInt("35");
/*		File file = new File("aa.txt");
		System.out.println(file.exists());
		System.out.println(file.canWrite());
		System.out.println(file.isHidden());
		System.out.println(file.length());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());*/
		
/*		try {
			FileReader fr = new FileReader("aa.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}

}
