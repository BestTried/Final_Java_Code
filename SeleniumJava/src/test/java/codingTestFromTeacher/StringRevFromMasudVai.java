package codingTestFromTeacher;

public class StringRevFromMasudVai {

	public static void main(String[] args) {


		String original = "XMEXBIXN".toLowerCase();
		String x = "X".toLowerCase();
		String newString = original.replaceAll(x, "");
		System.out.println("String After Remove : " + newString);
		
		String rev = "";
		
		for(int i= newString.length()-1; i>=0; i--) {
			rev= rev+newString.charAt(i);
		}
		System.out.println("After reverse : " + rev);
	}

}
