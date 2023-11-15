package codingInterview;

public class JumpSpecificNumber {

	public static void main(String[] args) {

		int n = 20;

		for (int i = 1; i <= 20; i++) {

			if (i == 3 || i == 8 || i == 10) {
				continue;
			}
			System.out.println(i);
		}
	}
}
