package codingTestFromTeacher;

import java.util.Arrays;

public class MinValMaxVal {
	
	public static void ArrayDisAdvantage() {
		//String [] names = {"smart" , "tech" , "batch", "27","prodan vai"};
		
		int [] number = {10,20,22,60,30};
	
		Arrays.sort(number); //10,20,22,60,100
		for (int i=0;i<=number.length;i++) {
			//System.out.println(number[i]);
		}
		
		
		  int min = number[0]; 
		  int max= number[(number.length)-1];
		  
		  System.out.println("The min is from number is "+ min);
		  
		  System.out.println("The max is from number is "+ max);
		 
		
	}
	
	public static void main(String[] args) {
		MinValMaxVal.ArrayDisAdvantage();
		
	}

}
