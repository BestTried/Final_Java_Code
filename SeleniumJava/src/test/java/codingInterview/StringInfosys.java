package codingInterview;

import java.util.Arrays;
import java.util.Collections;

public class StringInfosys {
	
	public static void main(String[] args) { 
		
		String [] number = { "One", "Two", "Three", "Four"};
		
		//System.out.println(Arrays.toString(number));
		Collections.reverse(Arrays.asList(number));//Reverse String
		//System.out.println(Arrays.toString(number));
		
		String words = "WhatEver";
		String rev = new StringBuffer(words).reverse().toString();
		//System.out.println(rev);
		
		// Underneeth without inbuild method
		
		String name = "Infosys", rev1 = " " ;
		//String rev1 = "";
		for(int i = name.length()-1; i>=0;  i--) {
			rev = rev + (name.charAt(i));
			
		
		}
		System.out.println(rev);
		
		
		
		
		
		
		
	}

}
