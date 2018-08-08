package com.uvglord.corejava.oopsbasic;

public class DefaultInterface implements Drawable{
	
	@Override
	public void draw() {
		System.out.println("drawing rectangle");
	}
	
	public static void main(String[] args) {
		Drawable drawable = new DefaultInterface();
		drawable.draw();
		drawable.msg();
		System.out.println(Drawable.cube(3));
	}
}