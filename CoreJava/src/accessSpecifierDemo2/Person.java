package accessSpecifierDemo2;

public class Person {
	private String name;
	private int id;
	public Person(){
		
	}
	public Person(int id,String name){
		this.name = name;
		this.id = id;		
	}
	
	public String getName(){
		return this.name;
	}
	protected int getId(){
		return this.id;
	}
	
}
