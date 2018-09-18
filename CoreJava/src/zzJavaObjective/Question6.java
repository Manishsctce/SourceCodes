package zzJavaObjective;

class Test2015{
	public void display(){
		System.out.println(this);
	}
	/*public String toString(){
		//System.out.println(this);
		return "Test2015";
	}*/
}
class Test2014{
	
}
public class Question6 {
	public static void main(String[] args) {
		
		Test2015 t = new Test2015();	
		System.out.println(t);
		t.display();
		System.out.println(new Test2015());
		
	}

}
