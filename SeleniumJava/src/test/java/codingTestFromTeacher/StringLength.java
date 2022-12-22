package codingTestFromTeacher;

public class StringLength {

	public static void stringLenth() {
		String name = "United States of America"; // Initializing a String Object name
		int length = name.length(); // Calling the inbuilt length() method
		System.out.println("The length of the String \"" + name + "\" is: " + length);

		int index = name.indexOf('m');
		System.out.printf("'m' is at index %d\n", index);
	}

	public static void main(String[] args) {
		stringLenth();

	}

}
