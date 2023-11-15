package home.work.sel;

public class FibonacchiNumberTanvir {

	public static void main(String[] args) {

		int num = 0;
		int num1 = 1;
		int num2;
		
		
		int i;
		int count = 10;
		
		for (i=0; i<count; i++) {
			num2 = num + num1;
			System.out.println(num2);
			num = num1;
			num1= num2;
			
		}

	}

}
