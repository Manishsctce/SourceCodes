package collectionDemo.mapDemo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

import utilityClasses.DisplayUtility;

public class ConcurrentHashMapDemo1 {

	public static void main(String[] args) {
		ConcurrentHashMap<String, Double> chm = new ConcurrentHashMap<String, Double>();
		// Put elements to the map. In sorted order
		chm.put("John Doe", new Double(3434.34));
		chm.put("Tom Smith", new Double(123.22));
		chm.put("Jane Baker", new Double(1378.00));
		chm.put("Tod Hall", new Double(99.22));
		chm.put("Ralph Smith", new Double(-19.08));
		//chm.put("Ralph Smith", null); //NO NULL Key or value
		
		for(Map.Entry<String, Double> me : chm.entrySet()){
			System.out.println(me.getKey() +":"+me.getValue());
		}
		
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				System.out.println("T1: Salary of John: "+ chm.get("John Doe"));
				System.out.println("T1: Salary of Jane: "+ chm.get("Jane Baker"));
				System.out.println("T1: Salary of Ralph: "+ chm.get("Ralph Smith"));
				
			}
		}, "T1");
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("T2: Old Salary of John: "+ chm.put("John Doe",3500.00));
				System.out.println("T2: Old Salary of Jane: "+ chm.put("Jane Baker", 1234.00));
				System.out.println("T2: old Salary of Ralph: "+ chm.put("Ralph Smith",0.0));
			}
		}, "T2");
	
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("T3: Salary of John: "+ chm.get("John Doe"));
				System.out.println("T3: Old Salary of Jane: "+ chm.put("Jane Baker", 3333.00));
				System.out.println("T3: Salary of Jane: "+ chm.get("Jane Baker"));
				System.out.println("T3: Salary of Ralph: "+ chm.get("Ralph Smith"));
			}
		}, "T3");
		t1.start();
		t2.start();
		t3.start();
	}
}
