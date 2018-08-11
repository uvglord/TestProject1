package com.uvglord.corejava.stringexample;

public final class ImmutableEmployee {
	final String pancard;
	
	public ImmutableEmployee(String pancard) {
		this.pancard=pancard;
	}
	
	public String getPanCard() {
		return pancard;
	}

}
