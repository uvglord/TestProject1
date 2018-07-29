package com.uvglord.corejava.designpattern.creational.abstractfactory.example1;

public class LoanFactory extends AbstractFactory{

	@Override
	Bank getBank(String bank) {
		return null;
	}
	
	@Override
	Loan getLoan(String loan) {
		
		if(loan==null)
			return null;
		
		if(loan.equalsIgnoreCase("Home"))
			return new HomeLoan();
		if(loan.equalsIgnoreCase("Business"))
			return new BusinessLoan();
		if(loan.equalsIgnoreCase("Education"))
			return new EducationLoan();
		
		return null;
	}
}
