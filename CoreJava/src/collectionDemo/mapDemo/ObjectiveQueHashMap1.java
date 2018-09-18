package collectionDemo.mapDemo;

import java.util.HashMap;
import java.util.Map;

public class ObjectiveQueHashMap1 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<>();
		map.put(new String("A"), "Core");
		map.put(new String("A"), "Java");
		
		System.out.println(map);
	}

}
