package examPractice;

public class IntRevSecond {
	
	public static void main(String[] args) {
        //number
        int n = 123456789;
         
        //variable to hold reversed number
        int reverse = 0;
         
        //reverse n
        while(n!=0) {
            reverse = (reverse * 10) + n%10; //append last digit of n to reverse
            n /= 10;                        //pop last digit of n
        }
         
        System.out.println(reverse);
    }

}
