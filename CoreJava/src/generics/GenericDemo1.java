package generics;

import java.util.ArrayList;

public class GenericDemo1 {

	public static void main(String[] args) {
		
		//here it represent raw ArrayList  in reference part and we assign String ArrayList to it 
		ArrayList arrList1 = new ArrayList<String>();
		arrList1.add(10);arrList1.add("Manish");arrList1.add(0.234);
		arrList1.add(new Integer(23));
		
		Double a = (Double) arrList1.get(2);
		System.out.println(a);
		for(Object obj: arrList1){
			System.out.println(obj);
		}
		
		//String st2 = arrList1.get(1);//type casting is require
		
		//in above Arraylist we can assign Integer ArrayList too
		arrList1 = new ArrayList<Integer>();
		
		//here we Object type is only applicable we cann't bound it to string		
		//ArrayList<Object> arrList2 = new ArrayList<String>();//Inheritance on type parameter is not supported means				
		ArrayList<String> arrList2 = new ArrayList<String>();
		
		
		//here we assigning 1 ArrayList to other not its type
		arrList2 = arrList1;
		
		ArrayList<Integer> arrList3 = new ArrayList<Integer>();		
		//arrList2 = arrList3; //compiler error
		
		//What is the use??
		ArrayList<?> arrList4 = new ArrayList<String>();		
		//arrList4.add("String"); arrList4.add(23.3);
		
		arrList4 = new ArrayList<Integer>();  
		//arrList4.add(new Integer(23)); //compilation error 
		
		arrList4 = arrList2;
		
		//how to do operation on arrList4??
		
		
		
		ArrayList<String> arrList5 = new ArrayList();
		arrList5.add("String");//while fetching no casting require 
		
		//arrList5.add(23.3);//compile error
		
		
		ArrayList<Object> arrList9 = new ArrayList<Object>();
		arrList9.add("Manish");		
		arrList9 = arrList1;
		arrList9.add(arrList5);
		//Array cannot be use with generic
		//Object []ol = new Object<String>[5];
		
	}

}
