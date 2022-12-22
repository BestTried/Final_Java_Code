package codingInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateT {
public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(1);
		list.add(4);
		list.add(4);
		list.add(4);
		list.add(7);
		list.add(9);
		
		List<Integer> unique =list.stream().distinct().collect(Collectors.toList());
		
	    System.out.println("Unique number is : "+ unique);
	    
	   }

}
