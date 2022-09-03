package test;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupCharacter {

	public static void main(String[] args) {


		String string = "aabbccdefatafaz";

		char[] chars = string.toCharArray();
		Set<Character> present = new HashSet<>();
		int len = 0;
		for (char c : chars)
		    if (present.add(c))
		        chars[len++] = c;

		System.out.println(new String(chars, 0, len));
	}

}
