package collectionDemo.mapDemo;
import java.util.*;

class TreeMapDemo1
{
	public static void main(String args[]) {
		// Create a tree map guaranteed ordering.
		TreeMap<String, Double> tm = new TreeMap<String, Double>();
		// Put elements to the map. In sorted order
		tm.put("John Doe", new Double(3434.34));
		tm.put("Tom Smith", new Double(123.22));
		tm.put("Jane Baker", new Double(1378.00));
		tm.put("Tod Hall", new Double(99.22));
		tm.put("Ralph Smith", new Double(-19.08));
		
		// Get a set of the entries.
		Set<Map.Entry<String, Double>> set = tm.entrySet();
		
		// Display the elements.
		for(Map.Entry<String, Double> me : set) {
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println("---------------------------------------");
		
		//Display keys in descending order 
		for(String str : tm.descendingKeySet()){
			System.out.println(str);
		}
				
		System.out.println("---------------------------------------");
		/*for(Map.Entry<String, Double> me : tm.descendingMap().entrySet()){
			System.out.println(me.getKey() + ": "+me.getValue());
		}*/
		
		for(Map.Entry<String, Double> me : tm.subMap("John Doe",false,"Tom Smith",true).entrySet()){
			System.out.println(me.getKey() + ": "+me.getValue());
		}
		System.out.println("---------------------------------------");
		//Deposit 1000 into John Doe's account.
		double balance = tm.get("John Doe");
		tm.put("John Doe", balance + 1000);
		System.out.println("John Doe's new balance: " +
				tm.get("John Doe"));
	}
}