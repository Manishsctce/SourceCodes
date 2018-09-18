package collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
//EMPLOYEE implement comparable
//STUDENT CANNOT SORT BCZ IT DOES IMPLEMENT COMPARABLE BUT CAN BE SORT WITH COMPARATOR WITHOUT CHANGING STUDENT CLASS

class Students implements Comparable<Students>{
	int rollno;  
	String name;  
	int age;  

	Students(int rollno,String name,int age){  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}
	
	public String toString(){
		return rollno+" "+name+" "+age;
	}

	@Override
	public int compareTo(Students std) {
		int out =0;
		if(this.rollno > std.rollno){
			out = 3;
			return out;		
		}else if(this.rollno < std.rollno){
			out = -3;
			return out;		
		}
		else if(this.rollno == std.rollno){
			out = this.name.compareTo(std.name);
			if(out==0){
				if(this.age > std.age){
					out = 1;
					return out;
				}else if(this.age < std.age){
					out = -1;
					return out;
				}
					
			}
			return out;	
		}
		return out;	
	}
}

public class SortingUsingComparableDemo2 {
	public static void main(String[] args) {
		//Student students[] = new Student[3];
		
		Students s1 = new Students(101,"Vijay",23);
		Students s2 = new Students(106,"Ajay",27);  
		Students s3 = new Students(105,"Jai",21);  
		Students s4 = new Students(100,"Jaiiii",29);
		Students s5 = new Students(105,"Arun",22); 
		Students s6 = new Students(105,"Arun",23);
		Students s7 = new Students(105,"Arun",21);
		Students students[] = {s1,s2,s3,s4,s5,s6,s7};
		
		System.out.println(students);
		List<Students> list = new ArrayList<Students>();
		for(Students stud: students){
			list.add(stud);
			System.out.println(stud.name+" "+stud.age+" "+stud.rollno);
		}
		
		//CANNOT SORT BCZ STUDENT DOES IMPLEMENT COMPARABLE
		//Arrays.sort(students); // java.lang.ClassCastException
		Collections.sort(list);
		System.out.println(list);
		for(Students stud: list){			
			System.out.println(stud.rollno+" "+stud.name+" "+stud.age+" ");
		}
		
		
		
	}
}
