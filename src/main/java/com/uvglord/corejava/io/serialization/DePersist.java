package com.uvglord.corejava.io.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DePersist {

	public static void main(String[] args) throws Exception {
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/resources/student.txt"));
		
		Student s1 = (Student) in.readObject();
		System.out.println(s1.id+", "+s1.name);
		in.close();
		
	}
}
