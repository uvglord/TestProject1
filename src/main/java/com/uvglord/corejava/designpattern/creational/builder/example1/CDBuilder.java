package com.uvglord.corejava.designpattern.creational.builder.example1;

public class CDBuilder {
	
	public CDType buildSonyCD() {
		CDType cds = new CDType();
		cds.addItem(new Sony());
		return cds;
	}
	
	public CDType buildSamsungCD() {
		CDType cds = new CDType();
		cds.addItem(new Samsung());
		return cds;
	}

}
