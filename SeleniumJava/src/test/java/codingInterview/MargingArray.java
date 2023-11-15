package codingInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MargingArray {

	public static void main(String[] args) {

		Integer a[] = { 1, 2, 3, 4, 5 };
		Integer b[] = { 6, 7, 8, 9, 10 };

		List<Integer> list = new ArrayList<>(Arrays.asList(a));

		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();

		System.out.println(Arrays.toString(c));

	}

}
