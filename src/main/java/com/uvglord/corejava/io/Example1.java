package com.uvglord.corejava.io;

import java.io.Console;
import java.io.IOException;

public class Example1 {

	public static void main(String[] args) {
		/*try {
			int i = System.in.read();
			//i=65;
			char c = (char)i;
			System.out.println(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		//enterName();
		//readPassword();
		
	}

	private static void enterName() {
		Console c=System.console();    
		System.out.println("Enter your name: ");    
		String n=c.readLine();    
		System.out.println("Welcome "+n);
		
	}

	private static void readPassword() {
		Console c=System.console();    
		System.out.println("Enter password: ");    
		char[] n=c.readPassword();
		System.out.println("Welcome "+String.valueOf(n));
		
	}
}
