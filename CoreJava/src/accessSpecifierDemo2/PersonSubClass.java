package accessSpecifierDemo2;

public class PersonSubClass extends accessSpecifierDemo.Person{
	
	public String toString(){
		return "Name: "+name/* public specifier*/ 
				+", "+ nickname /*protected specifier*/
				+", "+ getIncome()/* private specifier*/
				+", "+ getState()/* default specifier*/; 
	}
}
