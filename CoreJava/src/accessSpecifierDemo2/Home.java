package accessSpecifierDemo2;

import accessSpecifierDemo.Person;

public class Home extends Person{
	String name;
	//String nickname;//we can have this
	
	void print(){
		Person p1 = new Person();
		p1.name = "Manish";
		
		p1.setNickName("Golu");
		//p1.nickname = "golu";//cann't use this
		System.out.println(p1);
		System.out.println(nickname);
	}
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "Manish";
		
		p1.setNickName("Golu");
		//p1.ni
		System.out.println(p1);
	}

}
