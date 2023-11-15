package java_code_final;

public class Duplicate_Find {

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 3, 2 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("dup => " + a[i]);
				}
			}
		}

	}

}
