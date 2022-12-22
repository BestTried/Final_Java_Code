package codingInterview;

public class CompressedStringFinal {
	
	String str = "aaabbccd";
	public void compressedString(String str) {
		int count =0;
		char temp = str.charAt(0);
		System.out.println(str.length());
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==temp) {
				count++;
			}else {
				System.out.print(temp + "" + count);
				count=1;
				temp = str.charAt(i);
			}
		}
		System.out.print(temp + "" + count);
		
	}
	public static void main(String[] args) {
		
		CompressedStringFinal comfi = new CompressedStringFinal();
		comfi.compressedString(comfi.str);
	}

}
