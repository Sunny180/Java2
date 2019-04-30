package com.tom;

public class MyException extends Exception {
	public MyException (String msg) {
		super (msg);
	}
}
public class Main{
	public static void main (String[] args) {
		int n;
		try {
			if(n<101 && n>0) {
				throw new MyException("¦Û­qªº¨Ò¥~");				
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

