package accessSpecifierDemo2;

import accessSpecifierDemo.Person;

public class DefaultSpecifierDemo1 {

	public static void main(String[] args) {
		PersonSubClass p = new PersonSubClass();
		p.name="Manish";
		p.setNickName("Manas");
		p.setIncome("100000000");
		p.setState("MH");
		System.out.println(p)

	}

}
