package examPractice;

public class Int_Number_Rev {

	public static void main(String[] args) {
		int number = 987654, reverse = 0;
		while (number != 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number / 10;
		}
		System.out.println("The reverse of the given number is: " + reverse);
	}

}

/*public class StringRevInfosys {

	public static void main(String[] args) {
		
		String name = "Infosys", rev = " " ;
		//String rev1 = "";
		for(int i = name.length()-1; i>=0;  i--) {
			rev = rev + (name.charAt(i));
		}
		System.out.println(rev);
      
	}

}
*/