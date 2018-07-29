package com.uvglord.corejava.designpattern.creational.abstractfactory.example1;

public abstract class AbstractFactory {

	abstract Bank getBank(String bank);
	abstract Loan getLoan(String loan);
}
