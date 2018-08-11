package com.uvglord.corejava.stringexample;

public class ConcatPerformance {

	static int count = 10000;
	public static String concatWithString() {
		String t = "Java";
		for (int i = 0; i < count; i++) {
			t = t + "Tpoint";
		}
		return t;
		//return "";
	}

	public static String concatWithStringBuffer() {
		StringBuffer sb = new StringBuffer("Java");
		for (int i = 0; i < count; i++) {
			sb.append("Tpoint");
		}
		return sb.toString();
	}

	public static String concatWithStringBuilder() {
		StringBuilder sb = new StringBuilder("Java");
		for (int i = 0; i < count; i++) {
			sb.append("Tpoint");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		concatWithStringBuffer();
		System.out.println(
				"Time taken by Concating with  StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
		
		startTime = System.currentTimeMillis();
		concatWithStringBuilder();
		System.out.println(
				"Time taken by Concating with  StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
		
	}
}
