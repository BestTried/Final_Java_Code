package codingInterview;

public class Fibonacci {
	
	public static void main(String[] args) {
		// Set it to the number of elements you want in the Fibonacci Series
		 int maxNumber = 10;
		 int previousNumber = 0;
		 int nextNumber = 1;
		 
	        //System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
		 	//System.out.println(maxNumber);
	        for (int i = 1; i <= maxNumber; ++i){
	            System.out.print(previousNumber+" ");
	            
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	        }
	}


}
