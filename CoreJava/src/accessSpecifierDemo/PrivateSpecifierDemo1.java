package accessSpecifierDemo;

/* We cannot instantiate a class that have private constructor.
 * 
 */

class Company{
	private String compName;
	protected String acctNo;
	String branch;	
}

class Employee extends Company{
	void print(){
		System.out.println(acctNo);
		System.out.println(branch);
	}
}
public class PrivateSpecifierDemo1 {
	public static void main(String[] args) {
		MyClass myobj = new MyClass();
		System.out.println(myobj.proVar1);
		System.out.println(myobj.defVar1);
	}

}
