package codingInterview;

public class FibonacciSelfUpdate {
	public static void main(String[] args) {

	    int n = 13, t1 = 0, t2 = 1;
	    System.out.println("Fibonacci Series of " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(t1 + ", ");

	      // compute the next term
	      int sum = t1 + t2;
	      t1 = t2;
	      t2 = sum;
	    }
	  }

}
