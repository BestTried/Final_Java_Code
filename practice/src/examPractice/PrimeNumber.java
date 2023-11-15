package examPractice;

public class PrimeNumber {
	public static void main(String[] args) {
		int num= 12;
		
		for(int i =2;i<num/2; i++) {
			if (num %i ==0) {
				
			break;	
			}else {
				System.out.println("It's a prime number :  "+ num);
				break;
			}
			
		}
	}

}
