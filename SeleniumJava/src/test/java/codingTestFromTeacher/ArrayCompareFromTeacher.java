package codingTestFromTeacher;

import java.util.Arrays;

public class ArrayCompareFromTeacher {

	public static void main(String[] args) {

		int[] a = { 23, 56, 44, 34 };
		int[] b = { 23, 56, 44, 34 };
		int[] c = { 23, 56, 67, 34 };

		if (Arrays.equals(a, b)) {
			if (Arrays.equals(b, c)) {
				System.out.println("same value");

				// else {
				// System.out.println(" not same");
			} else {
				System.out.println("not same");
			}

		}
	}
}
