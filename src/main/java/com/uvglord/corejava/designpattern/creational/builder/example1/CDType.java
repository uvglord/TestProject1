package com.uvglord.corejava.designpattern.creational.builder.example1;

import java.util.ArrayList;
import java.util.List;

public class CDType {
	private List<Packing> items = new ArrayList<>();
	public void addItem(Packing packs) {
		items.add(packs);
	}
	public void getCost() {
		for(Packing packs:items) {
			packs.price();
		}
	}

	public void showItems() {
		for(Packing packs:items) {
			System.out.println("CD Name: "+packs.pack());
			System.out.println(", Price: "+packs.price());
		}
	}
}
