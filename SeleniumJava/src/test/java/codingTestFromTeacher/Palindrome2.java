package codingTestFromTeacher;

public class Palindrome2 {
	public static void main(String[] args) {

		String name = "LaveL";
		String revname = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			revname = revname + name.charAt(i);

		}
		if (name.equals(revname)) {
			System.out.println("It is a Palindrom :  " + name);
		} else {
			System.out.println("It's Not a Palindrom : " + name);
		}

	}

}
