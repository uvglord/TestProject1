package com.uvglord.corejava.designpattern.creational.abstractfactory.example1;

public class FactoryCreator {

	public static AbstractFactory getFactory(String choice) {
		if(choice==null)
			return null;
		
		if(choice.equalsIgnoreCase("Bank"))
			return new BankFactory();
		if(choice.equalsIgnoreCase("Loan"))
			return new LoanFactory();
		
		return null;
	}
}
