
public class StringDemo {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str);
		str = str + " Manish";
		System.out.println(str);
		
		String str2 = "Manish"+str;
		System.out.println(str2);
		
		String str3 = new String("Hello Manish");
		System.out.println(str3);
		
		if(str.equals(str3)){
			System.out.println("str and str3 are equal");
		}
		else
			System.out.println("str and str3 not equal");
		
		System.out.println("str == str3  : "+str==str3);
		str = str + str3;
		System.out.println(str);
		
		String str4 = new String(" Hello World2");
		System.out.println(str3+str4);
		
		
		int i = 1, j = -1; 
		switch (i) 
		{
		//
		//case 0,1 : j = 1; /* Line 4 */
		case 2: j = 2; 
		default: j = 0; 
		} 
		System.out.println("j = " + j);
		
	}

}
