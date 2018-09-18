package stringDemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class StringsCoversionDemo1 {

	public static void main(String[] args) throws ParseException {
		
		String intStr = String.valueOf(12345);// convert int into string
		int intvar = Integer.parseInt("123");//convert String into int	
		int a = Integer.valueOf("2147483647");//int : signed 32 bit (–2,147,483,648 to 2,147,483,647) i.e 2^32
		System.out.println("Int:"+a);
		
		Integer intObj = Integer.valueOf("-2147483647");//return sign 32bit int
		System.out.println("IntObj:"+intObj);
		
		String boolStr = String.valueOf(true);
		System.out.println("BoolStr:"+boolStr);
				
		Long longObj = Long.valueOf("98765432111111");
		System.out.println("LongObj:"+longObj);
		
		String iStr = String.valueOf(12);//convert primitive datatype into String
		
		//Converting String into Date
		String myDate = "22-12-2016";		
		//small case “m” represent minutes while “M” represent Month Also “d” represent date in month while “D” represent Day of week.
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(dateFormat.parse(myDate));
		
		
	}	
}
