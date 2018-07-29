package com.uvglord.corejava.designpattern.creational.abstractfactory.example1;

public class HomeLoan extends Loan{

	@Override
	void getInterestRate(double r) {
		rate=r;
	}
}
