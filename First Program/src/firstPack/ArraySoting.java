package firstPack;

import java.util.Arrays;

public class ArraySoting {
	
	public static void main(String[] args){
        String original = "edcba";
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        System.out.println(sorted);
    }

}
