package com.number;
import java.util.Scanner;

public class PalindromeNumber2 {
	public static void main(String[] args) {
		int n=0;
		int r=0;
		int a=0;
		int c=n;
		for(int i=1;i<500;i++) {
			n=i;
		while(n>0) {
			r=n%10;
			a=(10*a)+r;
			n=n/10;	
		}if(a==i) {
			System.out.println(i);
		}a=0;
	}
}
}