package arrays;

public class SplitTest {

	public static void main(String args[]) {
		String str = new String("WelcometoJava Programming");
		System.out.println("Output Value :");
		for (String resn : str.split("-")) {
			System.out.println(resn);
		}
	}

}
