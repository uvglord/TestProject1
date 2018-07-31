package com.uvglord.corejava.designpattern.creational.singleton.example1;

public class EarlyInitialize {

	private static EarlyInitialize obj = new EarlyInitialize();//Early, instance will be created at load time
	private EarlyInitialize() {}
	
	public static EarlyInitialize getInstance() {
		return obj;
	}
	
	public void doSomething() {
		//do some learning
	}
}
