package codingInterview;

import org.testng.annotations.Test;

public class FibonacifromTeacher {
	
	@Test
	public void fibonacci() {
		
		int n=7, first=0, second = 1;
		System.out.println("FibonaciSeries " + n + "terms:");
		
		for(int i=1; i<= n; i++) {
			System.out.println(first + " ");
			int next = first + second;
			first= second;
			second = next;
		}
	}

}
