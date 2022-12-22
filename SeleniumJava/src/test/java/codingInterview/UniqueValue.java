package codingInterview;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueValue {
	
	public static void main(String[] args) {
		
		
	List<String> list = new ArrayList<>();
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("A");
	list.add("D");
	
	//System.out.println(list.toString());
	
	Set<String> str = new LinkedHashSet<String>(list);
	
	System.out.println(str);

}
}