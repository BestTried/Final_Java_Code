package examPractice;

import java.util.Scanner;

public class RevWithOut {

	public static void revString(char[] ch, int length) {
		if (length > 0) {
			System.out.print(ch[length - 1]);
			length--;// recursive calling method
			revString(ch, length);
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Please enter a String");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();// convert String into character array
		int length = ch.length;// findinf the length of the String
		revString(ch, length);

	}

}
