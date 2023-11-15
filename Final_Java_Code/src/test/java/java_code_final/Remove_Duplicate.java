package java_code_final;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Remove_Duplicate {

	public static void main(String[] args) {
		List<Integer> remove = Arrays.asList(100, 200, 200, 300, 500, 700, 800);
		List<Object> duplicate = remove.stream().distinct().collect(Collectors.toList());
		System.out.println("Only unique values are: " + duplicate);

	}

}
