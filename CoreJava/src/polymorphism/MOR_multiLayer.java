package polymorphism;
//MULTI LAYER METHOD OVERRIDING

class Ac{
	
	void m1(){
		System.out.println(this.getClass().getName() + " m1" );
	}
	Integer m2(){
		return 23;
	}
	
	public void m3() {
		System.out.println(this.getClass().getName() + " m3" );
		m1();
	}
}

class Bc extends Ac{
	 /*void m1(){
		
	}*/
	 /*String m1(){
		 
	 }*/
	
//	Number m2(){
//		return 23;
//	}
}

class Cc extends Bc{
	final void m1(){
		System.out.println(this.getClass().getName() + " m1" );
		//m3();
	}
}

public class MOR_multiLayer {
	public static void main(String[] args) {

		Ac ac = new Cc();
		ac.m3();
	}

}
