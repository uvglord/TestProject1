package com.uvglord.corejava.multithreading;

import java.io.IOException;

public class RuntimeTest {

	public static void main(String[] args) throws IOException {
		Runtime r = Runtime.getRuntime();
		//notepad
		//r.exec("notepad");
		//windows shutdown
		//r.exec("shutdown -s -t 0");
		//r.exec("shutdown -r -t 0"); restart
		
		//available processors
		//System.out.println(r.availableProcessors());
		
		//Memory test
		System.out.println("Total memory "+r.totalMemory());
		System.out.println("Fee memory "+r.freeMemory());
		
		for (int i = 0; i < 1000000; i++) {
			new RuntimeTest();
		}

		System.out.println("After creating 1000000 instance, Free Memory: " + r.freeMemory());
		System.gc();
		System.out.println("After gc(), Free Memory: " + r.freeMemory());
	}
}
