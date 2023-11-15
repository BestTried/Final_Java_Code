package java_code_final;

public class Split_Test {

	public static void main(String[] args) {
		String Str = new String("Welcome-to-String-Tutorial.");
		System.out.println("Return Value is:-");
		for (String retval : Str.split("-")) {
			System.out.println(retval);
		}

	}

}
