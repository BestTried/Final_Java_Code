package codingInterview;

import java.util.ArrayList;

public class RemoveDupliArray {
	public static void main(String[] args) {
		
		ArrayList<Object>alist = new ArrayList<Object>();
		
		
		alist.add("java");
		alist.add('a');
		alist.add('b');
		alist.add("java");
		alist.add(10.3);
		alist.add('c');
		alist.add(14);
		alist.add("java");
		alist.add(12);
		
		System.out.println("Before remove duplicate elements : " + alist);
		
		for(int i=0; i<alist.size();i++) {
			for(int j= i+1; j<alist.size(); j++) {
				if (alist.get(i).equals(alist.get(j))) {
					
					alist.remove(j);
					
				}
			}
		}
			
		System.out.println("After remove duplicate elements : " + alist);
		
	}

}
