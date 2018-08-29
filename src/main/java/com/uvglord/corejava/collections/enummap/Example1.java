package com.uvglord.corejava.collections.enummap;

import java.util.EnumMap;

public class Example1 {
	
	public enum Days{Monday, Tuesday, Wednesday, Thursday};
	
	public static void main(String[] args) {
		//create and populate enum map
		EnumMap<Days, String> map = new EnumMap<>(Days.class);
		map.put(Days.Monday, "1");
		map.put(Days.Tuesday, "2");
		map.put(Days.Wednesday, "3");
		map.put(Days.Thursday, "4");
		
		//print the map
		map.entrySet().forEach(e->System.out.println(e.getKey()+"->"+e.getValue()));
	}

}
