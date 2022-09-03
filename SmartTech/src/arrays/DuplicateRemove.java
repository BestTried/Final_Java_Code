package arrays;

import java.util.HashSet;
import java.util.Set;

public class DuplicateRemove {
	public static void main(String[] args) {
		
		
		Set <Integer> set = new HashSet<Integer>();
		
		int [] arr = { 1,1,2,3,3,3,4,5,6,7,7,7};
		
		for(int num : arr) {
			set.add(num);
		}
	
		System.out.println(set);
		}

}
