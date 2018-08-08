package com.uvglord.corejava.controlstatements.programs;

public class PrimeExample1 {

	public static void main(String[] args) {
		int i,m=0;
		boolean flag=false;
		int n=67;//it is the number to be checked
		m=n/2;
		String s="prime number";
		if(n==0||n==1) {
			System.out.println(n+"is not "+s);
		}else {
			for(i=2;i<=m;i++) {
				if(n%i==0){
					System.out.println(n+" is not "+s);
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.println(n+" is "+s);
			}
		}
		
	}
}
