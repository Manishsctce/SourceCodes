package polymorphism;

class Ac{
	
	void m1(){
		
	}
	Integer m2(){
		return 23;
	}
}

class Bc extends Ac{
	 /*void m1(){
		
	}*/
	 /*String m1(){
		 
	 }*/
	
	Number m2(){
		return 23;
	}
}

class Cc extends Bc{
	final void m1(){
		
	}
}

public class MethodOverridingDemo4 {
	public static void main(String[] args) {


	}

}
