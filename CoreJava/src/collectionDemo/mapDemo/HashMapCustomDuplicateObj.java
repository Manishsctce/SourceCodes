package collectionDemo.mapDemo;

import java.util.Map;

class Student implements Comparable{
	int roll;
	String name ;
	Student(int roll,String name){
		this.roll = roll;
		this.name = name;

	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + roll;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (roll != other.roll)
			return false;
		return true;
	}


	@Override
	public int compareTo(Object arg0) {
		Student s = (Student)arg0;
		if(this.roll> s.roll)
			return 1;
		else if(this.roll<s.roll)
			return -1;
		else
			return 0;
	}
	
}

public class HashMapCustomDuplicateObj {

	public static void main(String[] args) {
		Student s1 = new Student(100,"Manish");
		Student s2 = new Student(100,"Gau");
		Student s3 = new Student(100,"asfdasf");
		Student s4 = new Student(1001,"aaf");
		Student s5 = new Student(100,"Gau");//if we don't implement hashCode and equals() then duplicate entry for Gau
		
		HashMap<Student,String> hm = new HashMap<Student,String>();
		hm.put(s1, "1");
		hm.put(s2, "2");
		hm.put(s3, "3");
		hm.put(s4, "4");
		hm.put(s5, "4");
		
		for(Map.Entry<Student,String> m : hm.entrySet()){
			System.out.println(m.getKey().roll+" "+m.getKey().name);
		}
	}

}
