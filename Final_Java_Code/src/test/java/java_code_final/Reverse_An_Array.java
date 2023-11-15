package java_code_final;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_An_Array {

	public static void main(String[] args) {
		// Create an array of integers
		Integer arr[] = { 10, 20, 30, 40, 50 };
		System.out.println("Original Array : " + Arrays.toString(arr));
		Collections.reverse(Arrays.asList(arr));
		System.out.println("Modified Array : " + Arrays.toString(arr));

	}

}
