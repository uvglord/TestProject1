package com.uvglord.corejava.stringexample;

//String comparison
public class StringExample3 {

	public static void main(String[] args) {
		compare1();
		System.out.println();
		compare2();
		System.out.println();
		compare3();
		System.out.println();
		compare4();
	}

	// equals
	static void compare1() {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = "Saurabh";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}

	// equals ignore case
	static void compare2() {
		String s1 = "Sachin";
		String s2 = "SACHIN";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
	}

	// == operator
	static void compare3() {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		System.out.println(s1 == s2);// true (because both refer to same instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance created in nonpool)
	}

	// compareTo
	static void compare4() {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = "Ratan";
		System.out.println(s1.compareTo(s2));// 0
		System.out.println(s1.compareTo(s3));// 1(because s1>s3)
		System.out.println(s3.compareTo(s1));// -1(because s3 < s1 )
		
		System.out.println("Z".compareTo("@"));
	}

}
