package examPractice;

public class PrimeNumber {
	public static void main(String[] args) {
		int num= 11;
		
		for(int i =2;i<num/2; i++) {
			if (num %i ==0) {
				
			}else {
				System.out.println("It's a prime number :  "+ num);
				break;
			}
			
		}
	}

}
