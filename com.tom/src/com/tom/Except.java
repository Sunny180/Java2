package com.tom;

import java.util.Scanner;

public class Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bonus = 380000;
		Scanner scanner = new Scanner(System.in);
		System.out.print("多少人要分?");
		String number = scanner.nextLine();
		int n = Integer.parseInt(number);
		int div = bonus/n;
		System.out.println("每個人得" + div);
	}

}
