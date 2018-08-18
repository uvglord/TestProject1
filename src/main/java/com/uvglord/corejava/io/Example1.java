package com.uvglord.corejava.io;

import java.io.IOException;

public class Example1 {

	public static void main(String[] args) {
		try {
			int i = System.in.read();
			//i=65;
			char c = (char)i;
			System.out.println(c);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
