package com.uvglord.corejava.oopsbasic.modifiers.pack2;

import com.uvglord.corejava.oopsbasic.modifiers.pack1.A;

public class B1{

	public static void main(String[] args) {
		A a = new A();
		//A1 not accessible outside package
		//not able to extend - A1 cannot be resolved to a type
		//a.l(); not accessible
		//a.m(); not accessible
		//a.n(); not accessible
		a.o();
	}
}
