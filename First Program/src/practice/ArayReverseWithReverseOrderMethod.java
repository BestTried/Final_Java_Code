package practice;

import java.util.Arrays;
import java.util.Collections;

public class ArayReverseWithReverseOrderMethod {
	
	public static void main(String[] args) {

		Integer ar[] = {421, 25, 789, 354, 60, 1010 };
	    System.out.println("Before sorting:\n" + Arrays.toString(ar));
	    Arrays.sort(ar, Collections.reverseOrder());
	    System.out.println("\n");
	    System.out.println("After sorting:\n" + Arrays.toString(ar));
		
		
	}	
	

}
