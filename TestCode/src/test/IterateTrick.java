package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateTrick {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Ram");
		list.add("Jadu");
		list.add("Madhu");
		
		Iterator<String>iterator =list.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
			iterator.remove();
		}
		System.out.println(list.size());
	}

}
