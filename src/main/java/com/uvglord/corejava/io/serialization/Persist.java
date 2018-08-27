package com.uvglord.corejava.io.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Persist {
	public static void main(String[] args) throws IOException {
		Student s1 = new Student(24, "Atul");
		
		FileOutputStream fos = new FileOutputStream("src/main/resources/student.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		fos.close();
		System.out.println("Success");
	}

}
