package com.tom;

import java.util.Scanner;

public class Pizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("PIZZA想切幾片?");
		int piece = scanner.nextInt();
		try{
			if(scanner.nextInt(0)){
				System.out.println("你確定不要切?");
			}else if(scanner.nextInt(8,12,16)){
				System.out.println("謝謝選購");
			}
		}catch(NumberFormatException e){
			System.out.println("數字格式錯誤");
		}catch(NumberOutOfRangeException e) {
			System.out.println("超出範圍");
		}
		
	}

}

/*int piece = scanner.nextInt(0);
System.out.println("你確定不要切?");
int piece = scanner.nextInt(8,12,16);
System.out.println("謝謝選購");*/
