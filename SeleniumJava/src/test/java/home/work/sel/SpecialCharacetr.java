package home.work.sel;

public class SpecialCharacetr {
	
	public static void main(String[] args) {
		// How to remove special charecter from String?
		String yourString ="Moh%$^$amm$%edAlam";
		String  result = yourString.replaceAll("[^\\w\\s]","");
		System.out.println(result);




}
}