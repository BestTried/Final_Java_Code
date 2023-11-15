package examPractice;

public class RunLengthSequence {
	
	String s1 = "aaabbccd" ;
	//output should be a3b2c2d1
	
	public void compressString(String s1) {
		int count = 0;
		char temp = s1.charAt(0);
		System.out.println(s1.length());
		
		for(int i= 0; i<s1.length(); i++) {
			if (s1.charAt(i)== temp) {
				count++;
				
			}else {
				System.out.print(temp+""+count);
				count = 1;
				temp = s1.charAt(i);
				
			}
		}
		System.out.println(temp + "" + count);
		
	}
	public static void main(String[] args) {
		RunLengthSequence re = new RunLengthSequence();
		re.compressString(re.s1);
		
	}

}
