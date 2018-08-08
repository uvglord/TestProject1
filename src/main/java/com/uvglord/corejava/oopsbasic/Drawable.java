package com.uvglord.corejava.oopsbasic;

public interface Drawable {
	void draw();
	default void msg() {
		System.out.println("drawable msg");
	}
	static int cube(int x) {return x*x*x; }
}
