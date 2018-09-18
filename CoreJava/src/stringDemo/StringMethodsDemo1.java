package stringDemo;
/* STRING METHODS
 * 
 */
class Student{
	int roll;
	String name;
	public Student(int roll, String name) {
		this.roll = roll;
		this.name = name;
	}	
}
public class StringMethodsDemo1 {
	public static void main(String[] args) {
		String s1 = "Manish Agrawal";
		String s11 = new String ("Manish Agrawal");
		String s2 = "Gaurav Agrawal";
		String s3 = "MANISH AGRAWAL";
		String chk = "AgRawal";
		
		System.out.println(s1);//Manish Agrawal
		System.out.println(s11);//Manish Agrawal				
		
		//equals() compare the value
		System.out.println("s1 equals s2 :"+s1.equals(s2));// FALSE		 
		System.out.println("s1 equals s11 :"+s1.equals(s11));//true
		
		//== compare the reference
		if(s1 == s11)
			System.out.println("s1 equals s11 ");
		else
			System.out.println("s1 not equal to s11 ");//output
		
		//
		System.out.println("s1 equals s3 :"+s1.equalsIgnoreCase(s3));// true
		
		//compare two string return 1 is s1>s2; 0 if s1=s2; -1 if s1<s2
		System.out.println("s1 compareTo s2 : "+s1.compareTo(s2)); //1
		System.out.println("s1 compareTo s11 :"+s1.compareTo(s11));
		System.out.println("s1 compareToIgnoreCase s3 : "+s1.compareToIgnoreCase(s3)); //0
		
		System.out.println("s1 startsWith Ma :"+s1.startsWith("Ma"));//TRUE
		//are s1,s3 endsWith Agrawal??
		System.out.println("s1 startsWith Agrawal :"+s1.toLowerCase().endsWith(chk.toLowerCase()));//True
		
		System.out.println(s1.charAt(0));//M
		System.out.println(s1.charAt(7));//A
		
		/* ss1="SachinTendulkar"
		 *      012345678901234*/
		String ss1="012345678901234";
		System.out.println(ss1.substring(6));//678901234  
		System.out.println(ss1.substring(0,6));//012345
		System.out.println(ss1.substring(3,6));//345
		//System.out.println(ss1.substring(0, ss1.indexOf(" ")));
		//System.out.println(ss1.length() + ss1.s);
		String manish = null;
		System.out.println(manish);//null
		
		
		String nullString1 = "";
		String nullString2 = " ";
		System.out.println("NullString:"+nullString1.isEmpty());
		System.out.println("NullString:"+" ".isEmpty());
		
		StringMethodsDemo1.StringMethods();
		
		System.out.println("Intern:"+nullString2.intern());
	}

	public static void StringMethods(){
		Student s1 = new Student(101, "Hello");
		System.out.println(s1);
		
	}
}
