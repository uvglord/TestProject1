package com.uvglord.corejava.io.serialization;

import java.io.Serializable;

public class Student implements Serializable{

	private static final long serialVersionUID = 4122213114015948797L;
	int id;
	String name;
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
}
