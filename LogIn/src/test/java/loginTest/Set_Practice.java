package loginTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Set_Practice {
public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer,String>();
		
		map.put(1,  "Masud");
		map.put(2,  "Mamun");
		map.put(3,  "Ripon");
		map.put(4,  "AZad");
		map.put(5,  "Hamid");
		map.put(6,  "Faruk");
		map.put(7,  "Imran");
		map.put(8,  "null");
		map.put(null,  "null");
		
		for (Entry <Integer,String>info: map.entrySet()) {
			System.out.println(info.getKey() + " " + info.getValue());
		}
		//System.out.println(ref.getKey() + "" + ref.getValue());
	}

}
