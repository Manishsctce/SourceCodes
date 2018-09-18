package stringDemo;
//How to check if the String is null or not?

public class StringDemo3 {

	public static void main(String[] args) {
		String str1 = "";
		String str2 = " ";
		String str3 = "";
		System.out.println(str1.isEmpty());
	//	System.out.println(str3.isEmpty());//1. throw NullPointerException
		
		/* 2. Not Null safe i.e it will throw NullPointerException
		 * if (str3.length()==0){
		 
			System.out.println("String is Empty");
		}*/
		
		//3. 
		if ("".equals(str3))
			System.out.println("String is Empty");
		else if(str3 == null)
			System.out.println("String is null");			
		else if(str3.length()>0)
			System.out.println("String is not null"+str3);
			
	}
}
