package codingInterview;

public class FibonacciSecond {
	
	public static void main(String[] args) {

	    int n = 10, firstTerm = 0, secondTerm = 1;

	    System.out.println("Fibonacci Series is  " + n + "  term ");

	    for (int i = 1; i <= n; i++) {

	      System.out.print(firstTerm + ", ");

	      // compute the next term

	      int nextTerm = firstTerm + secondTerm;

	      firstTerm = secondTerm;

	      secondTerm = nextTerm;

	    }

	  }


}
