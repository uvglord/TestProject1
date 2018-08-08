package com.uvglord.corejava.oopsbasic;

public class Example1 {

	/*
	 * The java switch statement is fall-through
	 * It executes all statement after first match if break statement is not used 
	 */
	public static void main(String[] args) {
		byte number = 20;
		switch(number) {
		case 10: System.out.println(10);break;
		case 20: System.out.println(20);
		case 30: System.out.println(30);break;
		default: System.out.println("other");
		}
		
		//for(;;)
			System.out.println("infinitive loop"+ number++);
		System.out.println(""+number);
		//while(true)
			System.out.println("infinitive loop"+ ++number);
		System.out.println(""+number);
		
		do {
			System.out.println(number);
			number++;}
		while(number<30);
			
		do
			System.out.println("infinitive loop"+ ++number);
		while(true);
	}
}
