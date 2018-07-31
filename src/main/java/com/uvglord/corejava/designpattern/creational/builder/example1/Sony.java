package com.uvglord.corejava.designpattern.creational.builder.example1;

public class Sony extends Company{

	@Override
	public String pack() {
		return "Sony CD";
	}
	
	@Override
	public int price() {
		return 20;
	}
}
