package com.uvglord.corejava.designpattern.creational.factory.example1;

public abstract class Plan {

	protected double rate;
	
	abstract void getRate();
	
	public void calculateBill(int units) {
		System.out.println(units*rate);
	}
}
