package com.number;

import java.util.Scanner;

///
public class ReverseNumber {
	public static void main(String[] args) {
	/*	System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);*/
		int n=123;
		
		while(n >0) {
			int reverse=n %10;	
			System.out.print(reverse);
			n=n/10;	
		}
	}
}

