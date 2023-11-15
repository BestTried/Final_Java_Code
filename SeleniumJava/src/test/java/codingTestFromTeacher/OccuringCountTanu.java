package codingTestFromTeacher;

import java.util.HashMap;

public class OccuringCountTanu {

	public static void main(String[] args) {

		String str = "United states of America";
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (charCount.containsKey(currentChar)) {
				charCount.put(currentChar, charCount.get(currentChar) + 1);
			} else {
				charCount.put(currentChar, 1);
			}
		}
		System.out.println(charCount);
	}

}
