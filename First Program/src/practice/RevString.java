package practice;

public class RevString {
	
	public static void main(String[] args) {
		  String input = "I love Programming";
		  System.out.println("Original string : " + input);
		  String string[] = input.split("\\s");
		  String output = "";
		  //Reverse each word's position
		  for (int i = 0; i < string.length; i++) {
		    if (i == string.length - 1)
		      output = string[i] + output;
		    else
		      output = " " + string[i] + output;
		  }
		  System.out.println("Reversed string : " + output);

	}
}
