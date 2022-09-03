package com.coding.test;

import java.util.HashSet;
import java.util.Set;

public class Set_Practice {
	
	public static void main(String[] args) {
		
		Set <String> str = new HashSet<>();
		
		str.add("School");
		str.add("College");
		str.add("Biddalaya");
		str.add("English");
		str.add("School");
		str.add("Bangla");
		str.add(null);
		str.add(null);
		
		for( String newstr:str) {
			System.out.println(newstr);
		}
	}

}
