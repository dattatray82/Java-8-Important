package com.number;
////100 to 1000 all armstrong number
public class ArsmStrongRange {
	public static void main(String[] args) {
		int r=0;
		int a=0;
		for(int i=100;i<=1000;i++) {
			int n=i;
		while(n>0) {
			r=n%10;
			a=(r*r*r)+a;
			n=n/10;
		}if(i==a) {
			System.out.println(i);
		}a=0;
		
	}
}
}