package com.uvglord.corejava.designpattern.creational.prototype.example1;

public class PrototypeDemo {

	public static void main(String[] args) {
		EmployeeRecord e1 = new EmployeeRecord(01,"Suresh","Developer",20000D,"Ghaziabad");
		e1.showRecord();
		EmployeeRecord e2 = (EmployeeRecord)e1.getClone();
		e2.showRecord();
	}
}
