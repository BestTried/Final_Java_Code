package codingTestFromTeacher;

import java.util.HashMap;
import java.util.Map;

public class OccuranceMasudVai {

	public static void main(String[] args) {

		String name = "smarttesch"; // compressed string

		// uncompressing the string into a Character Array

		char[] arr = name.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : arr) {

			if (!map.containsKey(ch)) { // if map doesn't contain

				map.put(ch, 1);

			} else if (map.containsKey(ch)) { // if map contains

				map.put(ch, map.get(ch) + 1);
			}
		}

		System.out.println(map);

	}
}
