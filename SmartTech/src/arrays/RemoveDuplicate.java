package arrays;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
	List<Integer > number= new  ArrayList<>(); 
	
	number.add(10);
	number.add(10);
	number.add(20);
	number.add(10);
	number.add(10);
	List <Integer> list = number.stream().distinct().collect(Collectors.toList());
	
	System.out.println(list);
	
	
	
	
	 
		
	
		
	}
	

}
