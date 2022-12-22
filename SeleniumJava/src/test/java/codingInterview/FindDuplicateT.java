package codingInterview;

public class FindDuplicateT {
	
	public static void main(String[] args) {

		int[] num = { 1, 2, 2, 4, 5, 6, 6, 7, 4, 4, 8, 8,6 };

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println(num[i]);
				}
			}

		}
	}

	

}