package com.uvglord.corejava.designpattern.creational.singleton.example1;

public class LazySync {

	private static LazySync lazy;
	private LazySync() {};
	
	public static LazySync getLazy() {
		if(lazy==null) 
			synchronized (LazySync.class) { 
				if(lazy ==null)
					lazy=new LazySync();
			}
		return lazy;
	}
	
	public void doSomething() {
		// This place is for test stuffs
	}
}
