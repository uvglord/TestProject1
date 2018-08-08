package com.uvglord.corejava.oopsbasic.clone;

public class Student implements Cloneable{
	int rollNo;
	String name;
	
	public Student(int rollNo, String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args) {
		try {
			Student st1 = new Student(1, "Yahoo");
			Student st2 = (Student) st1.clone();
			
			System.out.println("st1 ->"+st1.rollNo+", "+st1.name);
			System.out.println("st2 ->"+st2.rollNo+", "+st2.name);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
}
