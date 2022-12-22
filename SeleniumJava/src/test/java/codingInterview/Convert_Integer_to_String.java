package codingInterview;

public class Convert_Integer_to_String {

	public static void main(String[] args) {
		
		// Convert_Integer_to_String
		  int num = 123;
		 String str= Integer.toString(num); 
		  System.out.println(7 + str);
		  
		  //========================= or
		 
		  int num1 = 123;
		 String str1= new  Integer(num).toString(); 
		  System.out.println(7 + str1);
		  
		
		
	}

}
