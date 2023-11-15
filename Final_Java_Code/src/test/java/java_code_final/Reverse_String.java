package java_code_final;

public class Reverse_String {

	public static void main(String[] args) {
		String name = "Bangladesh";
		char[] nm = name.toCharArray();
		for (int i = (nm.length) - 1; i >= 0; i--) {
			System.out.print(nm[i]);
		}

	}

}
