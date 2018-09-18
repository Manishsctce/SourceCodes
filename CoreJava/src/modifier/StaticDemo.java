package modifier;
/* this use to refer current class instance variable/methods
 * this keyword can be used to call overloaded constructor and this() must be first statement in constructor not in other method 
 * this can be used to refer static member of class but its not best practice
 */
class NormalClass{
	int var1;
	private int var2;	
	static int var3;
	protected int var4 = 5678;
	static int count;
	NormalClass(){
		count++;
	}
	
	NormalClass(int var1){
		this();//this keyword can be used to call overloaded constructor and it must be first statement in constructor this()
		this.var1 = var1;//this use to refer current class instance variable/methods
		this.display();
	}
	NormalClass(int var1,int var2,int var3){
		this();
		this.var1 = var1;
		this.var2 = var2;
		this.var3 = var3;//this can be used to refer static member of class but its not best practice
		this.display();
	}
	
	
	void display(){
		//this();
		int loca = 0;
	}
	
	static void staticMethod(){
		//static int localVariable=0;
		System.out.println("count: "+count);
	}
}
public class StaticDemo {
	public static void main(String[] args) {
		NormalClass inst1 = new NormalClass();
		NormalClass inst2 = new NormalClass(10);
		inst2.staticMethod();
		System.out.println(inst1.var4); 
	}

}
