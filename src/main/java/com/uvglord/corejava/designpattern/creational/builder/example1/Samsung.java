package com.uvglord.corejava.designpattern.creational.builder.example1;

public class Samsung extends Company{

	@Override
	public String pack() {
		return "Samsung CD";
	}
	
	@Override
	public int price() {
		return 15;
	}
}
