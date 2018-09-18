package collectionDemo.mapDemo;
import zzClasses.Address;

import java.util.*;

class User implements Comparable{
	private String name;
	private Long mob;
	
	public User() {}
	public User(String name, Long mob) {
		super();
		this.name = name;
		this.mob = mob;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMob() {
		return mob;
	}
	public void setMob(Long mob) {
		this.mob = mob;
	}	
	public int compareTo(Object obj){
		User user = (User)obj;
		return this.name.compareTo(user.getName());
	}
	
}
/*class CustomAddress extends Address implements Comparator{	
	
	public int compare(Object o1, Object o2) {
		Address addr1 = (Address) o1;
		Address addr2 = (Address) o2;
		
		return addr1.getState().compareTo(addr2.getState());
	}
	
}*/

class AddressValueComparator implements Comparator{
	Map map;
	public AddressValueComparator(Map map) {
		this.map = map;
	}
	

	public int compare(Object o1, Object o2) {
		User u1 = (User)o1;
		User u2 = (User)o2;
		Address addr1 = (Address)map.get(u1);
		Address addr2 = (Address)map.get(u2);
	
		return addr1.getState().compareTo(addr2.getState());
		
	}
}

public class HashMapDemo2 {
	public static void main(String[] args) {
		//public Address(String line1, String city, String state, String country,Long pin)
		Address addr1 = new Address("Anmol Residency B-51","Pune","Maharashtra","India",411057L);
		Address addr2 = new Address("Anmol Residency B-53","Pune","Maharashtra","India",411057L);
		Address addr3 = new Address("Pandey ji E-25","Patna","Bihar","India",800020L);
		Address addr4 = new Address("Sarita Agrawal E-22","Patna","Bihar","India",800020L);
		Address addr5 = new Address("Manju Niwas MRAB-24, Kaimanam","Trivandrum","Kerala","India",695018L);
		
		User usr1 = new User("Maa",7501183961L);
		User usr2 = new User("B",7501183961l);
		User usr3 = new User("Gaurav",7679838013L);
		User usr4 = new User("C",8087700876L);
		User usr5 = new User("Manish",9975158448L);
		
		Map<Object, Object> map = new HashMap<Object, Object>();
		map.put(usr1, addr1);
		map.put(usr2, addr2);
		map.put(usr3, addr3);
		map.put(usr4, addr4);
		map.put(usr5, addr5);
		
		Map map1 = new TreeMap<Object, Object>(map);
		System.out.println("\n******Map sorted by Key*******");
		display(map1);
		
		System.out.println("\n*******Map sorted by Value*******");
		Map map2 = new TreeMap<Object,Object>(new AddressValueComparator(map));
		map2.putAll(map);
		display(map2);
	}
	
	public static void display(Map map){
		Set<Map.Entry<Object,Object>> set = map.entrySet();
		Iterator<Map.Entry<Object,Object>> itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry<Object, Object> mapentry = itr.next();
			User user = (User)mapentry.getKey();
			Address address = (Address)mapentry.getValue();
			System.out.println("\n"+user.getName() +" : "+user.getMob() );
			System.out.print("Address: "+" "+address.getLine1()+"\n"+address.getCity()+" ");
			System.out.println(address.getState()+" , "+address.getCountry()+" "+address.getPin());
		}
	}

}
