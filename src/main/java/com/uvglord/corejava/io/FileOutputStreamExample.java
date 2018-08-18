package com.uvglord.corejava.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		writeByte();
		
		writeString();
	}

	private static void writeString() {
		try {
			FileOutputStream fout = new FileOutputStream("src/main/resources/test1.txt");
			String s = "Welcome to java world";
			fout.write(s.getBytes());
			fout.close();
		}catch(IOException e) { System.err.println(e);}
	}

	private static void writeByte() {
		try {
			FileOutputStream fout = new FileOutputStream("src/main/resources/test2.txt");
			fout.write(65);
			fout.close();
			System.out.println("success");
		}catch(IOException e) { System.err.println(e);}
	}
}
