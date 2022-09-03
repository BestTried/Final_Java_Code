package test;

public class CountTheNumberOfWordsInString {
	
	public static void main(String[] args){
        String str = "GeeksforGeeks password is : 1234";
        int digits = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
                digits++;
        }
        System.out.println("Total number of Digits = " + digits);
    }

}
