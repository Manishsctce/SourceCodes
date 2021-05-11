package collectionDemo.mapDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

class Empl{
	private int id;
	private String name;
	Empl(){}
	Empl(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		int hash = 2;
		
		Random random = new Random();
		hash = random.nextInt(5);
		
		System.out.println("inserted into hash: "+hash);
		return hash;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj ) return true;
		
		if(obj == null ) return false;
		
		if(obj.getClass()!= getClass()) return false;
		
		Empl that = (Empl)obj;
		
		if(this.id == that.id && this.name.equals(that.name)) return true;
		
		return false;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class HM_withCollision {
	public static void main(String[] args) {
		Empl e1 = new Empl(1,"Manish");
		Empl e2 = new Empl(2, "Kumar");
		Empl e3 = new Empl(3, "Agrawal");

		HashMap<Empl, Integer> empList = new HashMap<>();
		//HashMap<Empl, Integer> empList = new LinkedHashMap<>();
		empList.put(e1, 1000);
		empList.put(e2, 2000);
		empList.put(e3, 3000);
		empList.put(new Empl(4, "Agrawal4"), 4000);
		empList.put(new Empl(5, "Agrawal5"), 5000);
		empList.put(new Empl(6, "Agrawal6"), 6000);
		
		System.out.println(empList);
		
		for(Map.Entry<Empl, Integer> e : empList.entrySet()) {
			System.out.println(e.getKey().getId() +" : " +e.getKey().getName()+", Sal: "+ e.getValue());
		}
		long t1 = System.currentTimeMillis();
		LinkedHashMap<Empl, Integer> lhm = new LinkedHashMap<>();
		lhm.putAll(empList);
		
		System.out.println("-----------------");
		for(Map.Entry<Empl, Integer> e : lhm.entrySet()) {
			System.out.println(e.getKey().getId() +" : " +e.getKey().getName()+", Sal: "+ e.getValue());
		}
		long t2 = System.currentTimeMillis();
		System.out.println("Time elapse: "+ (t2-t1));
	}

}
