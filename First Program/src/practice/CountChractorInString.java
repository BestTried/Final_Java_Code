package practice;

public class CountChractorInString {
	
	public static void main(String args[]) {
	    String str = "Victorious team";
	    String str1 = str.replace(" ", "");
	    int count = str1.length();
	    System.out.println("Total number of characters in the string is: " + count);
	  }

}
