package arrays;

import java.util.Iterator;

public class ArrayPrac {

	public static void main(String[] args) {
		
	String ar [] = new String[5];//array 

		String fName = "Hanmidul";
		String lName = "Islam";
		String address= "2837 Wellman Avenue";
		String city  = "Bronx";
		String zip   = "10461";
		
		//String arr [] = new String[6];
		
		ar [0] = fName;
		ar [1] = lName;
		ar [2] = address;
		ar [3] = city;
		ar [4] = zip;
		
		//System.out.println(ar[1]);
		
		  //System.out.println("Array shows "+ ar.length);
		  
			
			  for(int i=0; i<ar.length; i++) {
				  System.out.println(ar[i]);
			  
			  }
			 
		 
		
		
		
	}

}
