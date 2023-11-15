package codingInterview;

public class FibonacciSecond {

	public static void main(String[] args) {

		int max=10, prev = 0, next =1;
		//System.out.println("Fibonacci Series is  " + max + "  term ");
		System.out.println( max );


		for (int i = 1; i <= max; i++) {

			System.out.print(prev + ", ");

			// compute the next term;

			int prevNext = prev + next;

			prev = next;

			next = prevNext;

		}

	}

}
