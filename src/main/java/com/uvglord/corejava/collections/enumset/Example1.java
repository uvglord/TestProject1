package com.uvglord.corejava.collections.enumset;

import java.util.EnumSet;
import java.util.Set;

public class Example1 {
	
	enum days{SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THUSRDAY, FRIDAY, SATURDAY};

	public static void main(String[] args) {
		Set<days>set = EnumSet.of(days.TUESDAY, days.FRIDAY, days.TUESDAY);
		
		//traversing element
		set.forEach(e->System.out.println(e));
	}

}
