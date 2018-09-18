package inheritance;

//multi level inheritance
class P{
	static int i =9;
	static public void defaultmethod(){
		System.out.println("Print i:"+i);
	}
}
class C1 extends P{
	/*protected void defaultmethod(){
		
	}	*/
}
class C2 extends C1{
	
}

public class A {
	public static void main(String[] args) {

       C1 c1 = new C1();
       System.out.println(c1.i);
       C2 c2 = new C2();
       System.out.println(c2.i);
       c2.defaultmethod();
	}

}
