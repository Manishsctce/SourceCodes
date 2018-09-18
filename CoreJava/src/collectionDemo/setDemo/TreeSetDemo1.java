package collectionDemo.setDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

/*class Student implements Comparable{
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

public class TreeSetDemo1 {
	public static void main(String[] args) {
		Student s1 = new Student(100,"Manish");
		Student s2 = new Student(100,"Gau");
		Student s3 = new Student(100,"asfdasf");
		Student s4 = new Student(1001,"aaf");
		
		//HashSet ts = new HashSet();
		TreeSet ts = new TreeSet();
		ts.add(s1);
		ts.add(s2);
		//ts.add(null);
		ts.add(s4);ts.add(s3);
		//DisplayCollection.display(ts);
		Iterator it = ts.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			System.out.println(s.name + " "+ s.roll);
		}
		
		
		System.out.println("---------------------");
		Student st = (Student)ts.pollFirst();
		System.out.println(st.name + " "+ st.roll);
		
		System.out.println("---------------------");
		Iterator it2 = ts.iterator();
		while(it2.hasNext()){
			Student s = (Student)it2.next();
			System.out.println(s.name + " "+ s.roll);
		}
	}

}
*/