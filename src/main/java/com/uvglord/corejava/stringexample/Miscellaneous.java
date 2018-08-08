package com.uvglord.corejava.stringexample;

import java.util.Collections;

public class Miscellaneous extends ClassLoader{

	public static void main(String[] args) {
		Class<Collections> c = Collections.class;
		System.out.println(c.getClassLoader());  
		System.out.println(Miscellaneous.class.getClassLoader());  
	}
	
}
