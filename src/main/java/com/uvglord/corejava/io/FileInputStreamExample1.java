package com.uvglord.corejava.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample1 {

	public static void main(String[] args) {
		readChar();
		readString();
	}

	private static void readString() {
		try {
			FileInputStream fis = new FileInputStream("src/main/resources/test1.txt");
			int i = 0;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			fis.close();
		}catch(IOException e) {System.err.println(e);}
	}

	private static void readChar() {
		try {
			FileInputStream fis = new FileInputStream("src/main/resources/test2.txt");
			int i = fis.read();
			System.out.println((char)i);
			fis.close();
		}catch(IOException e) {System.err.println(e);}
	}
}
