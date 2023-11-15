package codingInterview;

import java.util.Arrays;

public class MinValMaxVal {

	
	public static void main(String[] args) {
		//Max& Min Value	
		int[] number = { 10, 20, 22, 60, 30 };

		Arrays.sort(number); // 10,20,22,60,100
		for (int i = 0; i <= number.length; i++) {
			// system.out.println(number[i]);
		}

		int min = number[0];
		 int max= number[(number.length)-1];

		System.out.println("The min is from number is " + min);

		 System.out.println("The max is from number is "+ max);

	}

}
