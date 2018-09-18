package collectionDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*  COMPARATOR interface 
 * 
 */
//SORT WITHOUT MODIFYING THE STUDENT CLASS

class StudentAgeComparator implements Comparator<Students>{
	
	public int compare(Students o1, Students o2) {
		if(o1.age > o2.age)
			return 1;
		else if (o1.age < o2.age)
			return -1;
		else 
			return 0;
	}
}

class StudentByAgeAndId implements Comparator<Students>{
	public int compare(Students o1, Students o2) {
		if(o1.age == o2.age){
			if(o1.rollno > o2.rollno)
				return 1;
			else if(o1.rollno < o2.rollno)
				return -1;
			else 
				return 0;
		}
		else if(o1.age> o2.age){
			return 1;
		}
		else 
			return -1;
	}
}
class StudentByName implements Comparator<Students>{
	boolean isNull(String str){
		if(str==null)		
			return true;
		else			
			return false;
	}
	public int compare(Students o1, Students o2){
		
		if(isNull(o1.name) && isNull(o2.name)){
			//System.out.println("##"+o1.name + " "+o2.name);
			return 0;
		}
		else if(isNull(o1.name) || isNull(o2.name)){
			if(isNull(o1.name)){
				//System.out.println("#"+o1.name);
				return -1;}
			else{
				//System.out.println("*"+o2.name);
				return 1;}
		}
		else {
			return o1.name.compareTo(o2.name);
		}

	}
}
public class SortingUsingComparatorDemo1 {
	public static void main(String[] args) {
		Students s1 = new Students(176,"Vijay",23);
		Students s2 = new Students(106,"Ajay",27);  
		Students s3 = new Students(105,"Jai",21);  
		Students s4 = new Students(109,null,26);
		Students s5 = new Students(111,null,36);
		Students s6 = new Students(119,"",93);
		Students s7 = new Students(156,"",63);
		Students s8 = new Students(208,"Gaurav",25);
		Students s9 = new Students(101,"Manish",26);
		Students s10 = new Students(121,"Rahul",27);
		Students s11 = new Students(201,"Preeti",26);
		Students s12 = new Students(301,"Sonali",26);
		
		List <Students> studentList = new ArrayList();
		studentList.add(s11);studentList.add(s12);
		studentList.add(s1);studentList.add(s2);studentList.add(s3);
		//studentList.add(s4);studentList.add(s5);studentList.add(s6);studentList.add(s7);
		studentList.add(s8);studentList.add(s9);studentList.add(s10);
		
		
		System.out.println("*****************Sort Student by Age************************");
		Collections.sort(studentList, new StudentAgeComparator());
		
		for(Students stud: studentList){
			System.out.println(stud.name+" "+stud.age+" "+stud.rollno); 
		}

		System.out.println("*****************Sort Student by Name************************");
		Collections.sort(studentList, new StudentByName());
		
		for(Students stud: studentList){
			System.out.println(stud.name+" "+stud.age+" "+stud.rollno); 
		}
		
		System.out.println("*****************Sort Student by Age then id************************");
		Collections.sort(studentList, new StudentByAgeAndId());
		for(Students stud: studentList){
			System.out.println(stud.name+" "+stud.age+" "+stud.rollno); 
		}
		
		
	}

}
