package zzJavaObjective;
/* TEST CLASS CAST EXCEPTION
 * 
 */
interface foo{
}

class Alpha implements foo{	}
class Beta extends Alpha{ }
class Delta extends Beta{ }

public class BasicQuestion5 extends Beta{
	public static void main(String[] args) {
		Beta x = new Beta();		
		Alpha a = x;
		foo f = (BasicQuestion5)x;//
		foo f2 = (Alpha)x;
		Beta b = (Beta)(Alpha)a;
		
		//Delta d = new Beta();
		Delta d = (Delta)new Beta();
		
		
		
	}

}
