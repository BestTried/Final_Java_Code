package codingTestFromTeacher;

public class StringInfosys {

	public static void main(String[] args) {

		String name = "Infosys", rev = " " ;
		//String rev1 = "";
		for(int i = name.length()-1; i>=0;  i--) {
			rev = rev + (name.charAt(i));
		}
		System.out.println(rev);
	}

}
