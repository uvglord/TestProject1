package com.uvglord.corejava.designpattern.creational.abstractfactory.example1;

public class BankFactory extends AbstractFactory{

	@Override
	Bank getBank(String bank) {
		if(bank==null)
			return null;
		
		if(bank.equalsIgnoreCase("HDFC"))
			return new HDFC();
		if(bank.equalsIgnoreCase("ICICI"))
			return new ICICI();
		if(bank.equalsIgnoreCase("SBI"))
			return new SBI();
		
		return null;
	}
	
	@Override
	Loan getLoan(String loan) {
		return null;
	}
}
