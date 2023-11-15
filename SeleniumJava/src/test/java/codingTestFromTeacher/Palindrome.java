package codingTestFromTeacher;

public class Palindrome {

	public static void palindrome1() {
		String name = "MOM";
		StringBuffer rev = new StringBuffer(name);
		String text = rev.reverse().toString();
		System.out.println("After reverse:" + text);

		if (name.equals(text)) {
			System.out.println("It is a Palindrome number ");
		} else {
			System.out.println("It is not a Palindrome number: ");
		}

	}
	// =====================================================================

	public static void palindrome2() {
		String name = "Leval";
		String revname = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			revname = revname + name.charAt(i);
			//System.out.println(revname); // we can play around with it.
		}

		if (name.equals(revname)) {

			System.out.println("It is a Palindrom " + name);
		} else {
			System.out.println("It's Not a Palindrom " + name);
		}

	}

	public static void main(String[] args) {
		palindrome2();
		// palindrome1();

	}

}
