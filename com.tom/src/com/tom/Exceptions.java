package com.tom;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("輸入英文成績:");
			int english = Integer.parseInt(scanner.nextLine());
			System.out.println("輸入數學成績:");
			int math = Integer.parseInt(scanner.nextLine());
			System.out.println((english + math)/2);
		}catch(NumberFormatException e) {
//			e.printStackTrace();
			System.out.println("數字格式錯誤");
		}

	}
}

