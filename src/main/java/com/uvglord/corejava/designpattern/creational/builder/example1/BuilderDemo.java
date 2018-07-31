package com.uvglord.corejava.designpattern.creational.builder.example1;

public class BuilderDemo {
	public static void main(String[] args) {
		CDBuilder builder = new CDBuilder();
		CDType cdType1 = builder.buildSonyCD();
		cdType1.showItems();
		
		CDType cdType2 = builder.buildSamsungCD();
		cdType2.showItems();
	}
}
