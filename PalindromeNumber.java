package com.number;
import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=0;
		int c=n;
		int a = 0;
		while(n>0) {
			r=n%10;
			a=(10*a)+r;
			n=n/10;
		}if(a==c) {
		System.out.println("palindrome");
	}else {
		System.out.println("not palindrome");
	}

}
}