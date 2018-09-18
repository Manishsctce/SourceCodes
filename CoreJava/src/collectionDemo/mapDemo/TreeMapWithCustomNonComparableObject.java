package collectionDemo.mapDemo;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Emp{
	private int id;
	private String name;
	Emp(){		
	}
	Emp(int id, String name){
		this.id = id;
		this.name = name;
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

class EmpComparatorById implements Comparator<Emp>{

	@Override
	public int compare(Emp o1, Emp o2) {
		if(o1.getId() > o2.getId())
			return 1;
		else if (o1.getId() == o2.getId())
			return 0;
		else
			return -1;
	}

	
	
}
public class TreeMapWithCustomNonComparableObject {

	public static void main(String[] args) {
		Map<Emp, Integer> map = new TreeMap<>(new EmpComparatorById());
		map.put(new Emp(8,"Manish"), 1);
		map.put(new Emp(2,"Gaurav"), 2);
		map.put(new Emp(1,"Gaurav"), 3);
		map.put(new Emp(1,"Gaurav"), 4);
		
		for(Map.Entry<Emp, Integer> me : map.entrySet()){
			System.out.println(me.getKey().getId()+":"+me.getKey().getName()+" => "+me.getValue());
		}
		
	}

}
