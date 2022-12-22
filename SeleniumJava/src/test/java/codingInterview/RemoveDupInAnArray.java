package codingInterview;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupInAnArray {
	
	public static void main(String[] args) {  
        List<String> list = new ArrayList<String>();  
        list.add("Mango");  
        list.add("Banana");  
        list.add("Mango");  
        list.add("Apple");  
        System.out.println(list.toString());  
        Set<String> s = new LinkedHashSet<String>(list);  
        System.out.println(s);  
    }  

}
