package interfaceDemo;
/*
 * Here 2 interface hv same method with samesignature cannot lead to diamond problem like display
 * Interface method cannot be static and Final they are by default public and abstract 
 */
public abstract interface Interface1 {
	int roll =1;
	String name ="Manish1";
	
	int returnRoll();
	void display(); //Same method in Interface2
	
	void method1() throws Exception;
	
	public default String method2(){
		return "default method of Iterface1";
	}
	
	//Since Java8
	public static void method3(){
		System.out.println("interface1 method3");
	}
}
