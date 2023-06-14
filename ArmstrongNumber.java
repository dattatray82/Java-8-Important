package com.number;

//153==1*1*1=1...
public class ArmstrongNumber {
	public static void main(String[] args) {
		int n=153;
		int r=0;
		int a=0;
		int c=n;
		while(n>0) { ///153>0==true
			r=n%10; ////3
			a=(r*r*r)+a;////x=x
			n=n/10;
		}
		if(c==a) {
			System.out.println("Armstrong");
		}else {
			System.out.println("not Armstrong");
		}
	}

}
