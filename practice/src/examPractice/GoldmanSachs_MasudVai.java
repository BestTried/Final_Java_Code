package examPractice;

public class GoldmanSachs_MasudVai {
	String str="aaabccab";
	public static String deEncode(String str ) {
		StringBuffer sbf = new StringBuffer();
		for(int i= 0; i<str.length(); i++) {
			int count = 1;
			while (i<str.length()-1 && str.charAt(i)== str.charAt(i+1)){
				count++;
				i++;
				
			}
			sbf.append(str.charAt(i));
			sbf.append(count);
		}
		return sbf.toString();
		
	}
	public static void main(String[] args) {
		System.out.println(deEncode("aaabccab"));

		
	}
	
// with HashMap Explain it to be!
}
