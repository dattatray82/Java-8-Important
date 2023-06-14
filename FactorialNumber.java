package com.number;

import java.util.Scanner;

/// 5=5*4*3*2*1=120
public class FactorialNumber {
	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();  /// 5
		int factors=1;  //// Compulsory 1
		for(int i=1;i<=n;i++) { 
			factors=factors*i;  //// 1*1,2*1,3*1,4*1,5*1..(1*2*3*4*5)*1=120
	
		}
		System.out.println(factors);
	}
}
