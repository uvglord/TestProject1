package com.uvglord.corejava.stringexample;

import java.util.Collections;

public class Miscellaneous extends ClassLoader{

	public static void main(String[] args) {
		Class<Collections> c = Collections.class;
		System.out.println(c.getClassLoader());  
		System.out.println(Miscellaneous.class.getClassLoader());  
		
		
		boolean bol = true;
		String s = String.valueOf(bol);
		System.out.println(true);
		System.out.println(bol);
		System.out.println(s);
		
		boolean b1=false;  
        byte b2=11;    
        short sh = 12;  
        int i = 13;  
        long l = 14L;  
        float f = 15.5f;  
        double d = 16.5d;  
        char chr[]={'j','a','v','a'};  
        Miscellaneous obj=new Miscellaneous();  
        String s1 = String.valueOf(b1);    
        String s2 = String.valueOf(b2);    
        String s3 = String.valueOf(sh);    
        String s4 = String.valueOf(i);    
        String s5 = String.valueOf(l);    
        String s6 = String.valueOf(f);    
        String s7 = String.valueOf(d);    
        String s8 = String.valueOf(chr);    
        String s9 = String.valueOf(obj);    
        System.out.println(s1);  
        System.out.println(s2);  
        System.out.println(s3);  
        System.out.println(s4);  
        System.out.println(s5);  
        System.out.println(s6);  
        System.out.println(s7);  
        System.out.println(s8);  
        System.out.println(s9); 
	}
	
}
