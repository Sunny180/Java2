package com.tom;

import java.util.Scanner;

public class ScoreTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("輸入英文成績:");
			Score english = new Score(scanner.nextLine());
			System.out.println("輸入數學成績:");
			Score math = new Score(scanner.nextLine());
			System.out.println((english.value + math.value)/2);
		}catch(NumberFormatException e) {
			e.printStackTrace();
			
		}
	}

}
