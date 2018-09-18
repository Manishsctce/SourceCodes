package generics;

import java.util.ArrayList;
import java.util.List;

//1. Cannot Instantiate Generic Types with Primitive Types
//2. Cannot Create Instances of Type Parameters
//3. No static member can use a type parameter declared
//5. Cannot create a generic array of T
public class GenericRestrictionDemo1 {

	public static void main(String[] args) {
		//List<int> list = new ArrayList<>(); //1. Cannot Instantiate Generic Types with Primitive Types
		
		
		
	}
}

class Geny<T>{
	T t;
	
	T vals[];
	Geny(){
		//t = new T();//2. Cannot Create Instances of Type Parameters
	}
	
	Geny(T[] a){
		vals = a;
	}
	
	/*T[] getTypeArray(){
		//return new String[5];//Cannot convert String[] to T[]
		return new T[5];//5. Cannot create a generic array of T
	}*/
	
	//static T t2;//3. No static member can use a type parameter declared
	
	//3. No static member can use a type parameter declared
	/*static T staticMethod(){
		return "";
	}*/
	
	//3. No static member can use a type parameter declared
	/*static void showT(){
		System.out.println(t);
	}*/
	
	void method(T a){
		if(a instanceof Number){
			
		}
	}
}
