package com.tom;

import java.util.Scanner;

public class ScoreNG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("��J�^�妨�Z:");
			int english = Integer.parseInt(scanner.nextLine());
			System.out.println("��J�ƾǦ��Z:");
			int math = Integer.parseInt(scanner.nextLine());
			System.out.println((english + math)/2);
		}catch(NumberFormatException e) {
//			e.printStackTrace();
			System.out.println("�Ʀr�榡���~");
			
		}
	}

}

