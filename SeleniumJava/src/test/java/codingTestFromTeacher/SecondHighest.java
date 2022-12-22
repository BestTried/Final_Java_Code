package codingTestFromTeacher;

import java.util.Arrays;

public class SecondHighest {

	public static void main(String[] args) {
	int []age = {1,6,10, 53,23, 58, 100,200};//Initialize the array
	int size = age.length;
	
	Arrays.sort(age);
	
	int sceondNum = age [size-2];
	System.out.println(sceondNum);

	}

}
