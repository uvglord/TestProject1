package com.uvglord.corejava.designpattern.creational.abstractfactory.example1;

public class SBI implements Bank {

	private final String BNAME;
	
	public SBI() {
		BNAME = "SBI BANK";
	}
	
	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return BNAME;
	}

}
