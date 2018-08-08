package com.uvglord.corejava.oopsbasic;

public class Example4 {
	int rollno;
    String name;
    static String college = "ITS";
    
    static void change(){
    college = "BBDIT";
    }

    Example4(int r, String n){
    rollno = r;
    name = n;
    }

    void display (){
    	final Integer i=10;
    	i.valueOf(2);
    	System.out.println(i);
    	System.out.println(rollno+" "+name+" "+college);
    }
    
	public static void main(String[] args) {
		Example4 example1 = new Example4(1, "a1");
		Example4 example2 = new Example4(2, "a2");
		change();
		Example4 example4 = new Example4(3, "a3");
		example1.display();
		example2.display();
		example4.display();
	}

}
