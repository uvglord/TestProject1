package com.uvglord.corejava.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedInputStream1 {
	public static void main(String[] args) {
		readString();
	}
	
	private static void readString() {
		try {
			FileInputStream fis = new FileInputStream("src/main/resources/test1.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			int i = 0;
			while((i=bis.read())!=-1) {
				System.out.print((char)i);
			}
			bis.close();
			fis.close();
		}catch(IOException e) {System.err.println(e);}
	}

}
