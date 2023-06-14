package com.number;

import java.util.Scanner;

/// 5=5*4*3*2*1=120
public class FindTheFactorsOFGivenNumber {
	public static void main(String[] args) {
		
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();  
		//int factors=1;  //// Compulsory 1
		for(int i=1;i<=n;i++) { 
			if(n%i==0) {
				System.out.println("factors of  number="+i);
			}
		}
	}
}
