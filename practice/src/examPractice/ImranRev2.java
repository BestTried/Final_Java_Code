package examPractice;

public class ImranRev2 {

	public static void main(String[] args) {

		int n = 543218;
		int temp = 0;
		while (n>1){
		temp =	temp*10 + (n%10);
		n= n/10;
		}
		System.out.println(temp);
	}

}
