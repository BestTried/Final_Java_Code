package java_code_final;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Marge_Two_Integer_Array {

	public static void main(String[] args) {
		Integer a[] = { 1, 2, 3, 4 };
		Integer b[] = { 5, 6, 7 };
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));

	}

}
