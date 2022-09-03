package firstPack;

public class ReverseString {
	
	public static void main(String[] args) {
        String str = "Bangladesh";
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }
        System.out.println("Reverse of Bangladesh is: " + reverse);
    }

}
