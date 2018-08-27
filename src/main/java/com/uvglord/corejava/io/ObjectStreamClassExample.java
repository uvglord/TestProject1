package com.uvglord.corejava.io;

import java.io.ObjectStreamClass;
import java.util.Calendar;

public class ObjectStreamClassExample {
	public static void main(String[] args) {
		//Create a new objectStream class for integers
		ObjectStreamClass osc = ObjectStreamClass.lookup(Integer.class);
		
		// get the value field from ObjectStreamClass for integers  
        System.out.println("" + osc.getField("price"));  
  
        // create a new object stream class for String  
        ObjectStreamClass osc2 = ObjectStreamClass.lookup(String.class);  
  
        // get the Class instance for osc2  
        System.out.println("" + osc2.getField("value").getType()); 

        // create a new object stream class for Calendar  
        ObjectStreamClass osc3 = ObjectStreamClass.lookup(Calendar.class);  

        // get the Class instance for osc2  
        System.out.println("" + osc3.getField("isTimeSet").getType()); 
		
	}

}
