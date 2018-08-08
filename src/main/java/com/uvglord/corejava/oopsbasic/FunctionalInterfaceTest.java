package com.uvglord.corejava.oopsbasic;

public class FunctionalInterfaceTest {

	public static void main(String[] args) {
		FunctionalInterface1 t1 = () -> System.out.println("Draw lambda child") ;
		t1.draw();
	}

}
