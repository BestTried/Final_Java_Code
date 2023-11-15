package examPractice;

import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		int[] num = { 40, 10, 70, 30, 20 };

		Arrays.sort(num);

		for (int i = 0; i <= num.length; i++) {

		}
		// int min = num[0];
		int max = num[(num.length) - 1];
		System.out.println(max);
	}

}
