package codingInterview;

import java.util.Arrays;

public class Second_HighestSalaryT {
	
	public static void main(String[] args) {
		int num []= {4,10,25,30,500,300};
		
		int size=num.length;
		Arrays.sort(num);
		int result=num[size-2];
		System.out.println(result);
	}
}
