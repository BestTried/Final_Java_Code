package test;

public class RevStringOnFeb24 {
	
	public static void main(String[] args) {
        String takeString = "Bangladesh";
        String strResult = "";
        for (int i = takeString.length() - 1; i >= 0; i--) {
            strResult = strResult + takeString.charAt(i);
        }
        System.out.println("Reverse of Bangladesh is: " +strResult);
    }

}
