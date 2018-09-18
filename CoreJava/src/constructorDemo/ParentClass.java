package constructorDemo;

public class ParentClass {
	
	int intValue;
	float floatValue;
	double doubleValue;
	boolean booleanValue;
	long longValue;
	
	ParentClass(){
		System.out.println("Default access specifier constructor in parent class");
		System.out.println(	"Default int Value: "+intValue+"\nDefault float Value: "+floatValue);
		System.out.println("Default double value: "+doubleValue+"\nDefault boolean: "+booleanValue+"\nDefault long Value:"+ longValue);
	}
	
	private ParentClass(String name){
		System.out.println("Private parent class constructor: "+name);
	}
}
