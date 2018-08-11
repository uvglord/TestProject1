package com.uvglord.corejava.stringexample;

public class StringExample1 {

	public static void main(String[] args) {

		char[] ch = {'m','y',' ','s','t','r','i','n','g'};
		
		String str = String.copyValueOf(ch);
		
		System.out.println(str);
		
		String s = new String(ch);
		
		System.out.println(s);
	}

}
