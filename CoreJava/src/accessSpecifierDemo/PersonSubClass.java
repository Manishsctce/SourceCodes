package accessSpecifierDemo;

public class PersonSubClass extends accessSpecifierDemo.Person{
	
	public String toString(){
		return "Name: "+name/* public specifier*/ 
				+", "+ nickname /*protected specifier*/
				+", "+ getIncome()/* private specifier*/
				+", "+ state/* default specifier*/; 
	}
}
