package cloneable;
//If we don't implement Cloneable interface, clone() method generates CloneNotSupportedException.
class Person implements Cloneable{
	private int id;
	private String name;
	public Person(int id,String name) {
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}	
	/*public Person clone() throws CloneNotSupportedException{
		return (Person) super.clone();
	}*/
}

public class CloneDemo1{
	public static void main(String[] args) {
		Person p = new Person(1001,"Sam");
		try {
			// Person class doesn't implement Cloneable but tries to get clone. It fails
			// with CloneNotSupportedException
			Person pClone = (Person) p.clone();
			System.out.println(pClone.getName());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}