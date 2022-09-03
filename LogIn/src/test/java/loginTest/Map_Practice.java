
package loginTest;

import java.util.HashSet;
import java.util.Set;

public class Map_Practice {
	
public static void main(String[] args) {
	
	Set<String> tools = new HashSet<String>();
	tools.add(null);
	tools.add("Selenium");
	tools.add("Java");
	tools.add("Maven");
	tools.add("Cucumber");
	tools.add("TestNG");
	tools.add("Apochi poi");
	tools.add("Maven");
	tools.add("Selenium");
	tools.add("Cucumber");
	tools.add(null);
	tools.add(null);
	tools.add(null);
	
	for(String newTools : tools) {
		
		System.out.println(newTools);
	}
		
		
		
}	

}
