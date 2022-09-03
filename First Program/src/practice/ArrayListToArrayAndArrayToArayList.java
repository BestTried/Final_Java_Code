package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListToArrayAndArrayToArayList {

	public static void main(String[] args) {
		
		List<String> frList = new ArrayList<>();
		frList.add("Mango");
		frList.add("Jacfruit");
		frList.add("Banana");
		frList.add("Apple");
		frList.add("Orange");
				
		System.out.println("Converting ArrayListToArray  :");
		
		String [] arr=frList.toArray(new String[frList.size()]);
		
		for(String st :arr) {
			System.out.println(st);
		}
		System.out.println("*****************************");
		System.out.println("Converting ArrayToArrayList  :");
		
		List <String> list2 = new ArrayList<>();
		list2 = Arrays.asList(arr);
		System.out.println(list2);


	}

}
