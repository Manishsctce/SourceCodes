package zzClasses;

public class Emp{
	private int id;
	private String name;
	private Double salary;
	
	public Emp(){}
	public Emp(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public Emp(int id, String name, Double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
//	@Override
//	public int hashCode() {
//		int hash = 2;
//		
//		Random random = new Random();
//		hash = random.nextInt(5);
//		
//		System.out.println("inserted into hash: "+hash);
//		return hash;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj ) return true;
//		
//		if(obj == null ) return false;
//		
//		if(obj.getClass()!= getClass()) return false;
//		
//		Emp that = (Emp)obj;
//		
//		if(this.id == that.id && this.name.equals(that.name)) return true;
//		
//		return false;
//	}
	
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
	
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
	
		return "Emp["+ id + ":" + name+ " : "+ salary + "]";
	}
}