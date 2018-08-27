package com.uvglord.corejava.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream1 {
	public static void main(String[] args) {
		writeString();
	}
	
	private static void writeString() {
		try {
			FileOutputStream fout = new FileOutputStream("src/main/resources/test1.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String s = "Welcome to java world";
			byte []b = s.getBytes();
			bout.write(b);
			bout.flush();
			//fout.write(s.getBytes());
			bout.close();
			fout.close();
		}catch(IOException e) { System.err.println(e);}
	}

}
