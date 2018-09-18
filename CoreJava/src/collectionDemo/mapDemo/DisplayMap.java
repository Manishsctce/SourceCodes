package collectionDemo.mapDemo;

import java.util.*;

public class DisplayMap {
	public static void display(Map map){		
		Set<Map.Entry<Object,Object>> set = map.entrySet();
		Iterator<Map.Entry<Object,Object>> itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry<Object, Object> mapentry = itr.next();
			System.out.println(mapentry.getKey() +" "+ mapentry.getValue());
		}
	}
	/*public static void displayInLine(Collection col){
		for(Iterator i = col.iterator();i.hasNext();){
			System.out.print(i.next()+"  ");
		}
	}*/
}
