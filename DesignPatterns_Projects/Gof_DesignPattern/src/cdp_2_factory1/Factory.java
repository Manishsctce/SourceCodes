package cdp_2_factory1;

public class Factory {
	AbstractClass ab = null;
	
	
	public AbstractClass<? extends A> factoryMethod(String str){
		
		if(str==null){
			System.out.println("Please enter something");
			return null;
		}
		if(str.equalsIgnoreCase("a")){
			ab = new A();
		}
		else if(str.equalsIgnoreCase("b")){
			ab = new B();
		}
		else{ 
			C c = new C();
			//return C;
		}	
			ab = null;
		return ab;
	}
}
