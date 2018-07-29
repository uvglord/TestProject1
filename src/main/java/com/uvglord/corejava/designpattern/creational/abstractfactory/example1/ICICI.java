package com.uvglord.corejava.designpattern.creational.abstractfactory.example1;

public class ICICI implements Bank {

	private final String BNAME;
	
	public ICICI() {
		BNAME = "ICICI BANK";
	}
	
	@Override
	public String getBankName() {
		// TODO Auto-generated method stub
		return BNAME;
	}

}
