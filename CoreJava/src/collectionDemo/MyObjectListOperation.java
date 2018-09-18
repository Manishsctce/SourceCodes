package collectionDemo;
/* HashCode() and equals() implementation for custom objects
 * 
 */
import java.util.*;
import java.util.Map.Entry;

final class UserId{
	String userid;
	String password;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userid == null) ? 0 : userid.hashCode());
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
		
		UserId other = (UserId) obj;
		if ((password == null || other.password != null) && !password.equals(other.password)) {		
				return false;
		} 
		if ((userid == null && other.userid != null) || !userid.equals(other.userid)) {
			return false;
		}	
		return true;
	}

	UserId(String userid, String password){
		this.userid =  userid;
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
	public String getUserId(){
		return userid;
	}
}

class Emp{
	public static int empId = 1000;
	public String empName;
	public int age;
	public char sex;
	UserId userId; 
	
	Emp(){
		empId++;
	}
	Emp(String empName,int age,char sex){
		super();
		this.empName = empName;
		this.age = age;
		this.sex = sex;	
	}	
	Emp(String empName,int age,char sex,UserId userId){
		super();
		this.empName = empName;
		this.age = age;
		this.sex = sex;
		this.userId = userId;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + sex;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		
		Emp other = (Emp) obj;
		if (age != other.age)
			return false;
		if ((empName == null && other.empName!= null) || !empName.equals(other.empName)) {
				return false;
		} 
		if (sex != other.sex)
			return false;

		return true;
	}
	
/*	public boolean equals(Object obj){
		boolean equality = false;
		if(this == obj) return true;
		
		if((obj == null) ||(obj.getClass()!=this.getClass())){
			equality = false;
			return equality;
		}
		Emp emp = (Emp)obj;
		if(this.empName.equals(emp.empName) && this.age == emp.age && this.sex==emp.sex){
			equality = true;
			return equality;
		}
				
		return equality;
	}
	public int hashCode(){
		int hash=9;
		hash = (31*hash) + empId;
		hash = 31 * hash + (null==empName?0:empName.hashCode());
		return hash;
	}*/
	
	
}
public class MyObjectListOperation {
	public static void main(String[] args) {
		/*System.out.println("Create your Login Id");
		System.out.println("Enter your email id");
		System.out.println("Enter password: ");
		System.out.println("Confirm Password: ");*/
		UserId u1 = new UserId("manishsctce@gmail.com", "Manish@123");
		UserId u3 = new UserId("gaurav.hitinstru@gmail.com","Gaurav@321");
		UserId u2 = new UserId("rahul.ranjan2108@gmail.com","Password123");
		UserId u4 = new UserId("sweetpriya2208@gmail.com","Priya#198");
		UserId u5 = new UserId("soumya1990@gmail.com","soumya@123");
		Emp e1 = new Emp("Manish",27,'M',u1);
		Emp e2 = new Emp("Rahul",26,'M',u2);
		Emp e3 = new Emp("Gaurav",25,'M',u3);
		Emp e4 = new Emp("Priya",24,'F',u4);
		Emp e5 = new Emp("Priya",24,'F',u4);
		Emp e6 = new Emp("Soumya", 23,'F',u5);
		Emp e7 = new Emp("Soumya", 23,'F',u5);
		
		List<Emp> list = new ArrayList<Emp>();
		list.add(e1);list.add(e2);list.add(e3);list.add(e4);
		list.add(e5);list.add(e6);list.add(e7);
		
		System.out.println("Does the employee exist? "+list.contains((new Emp("Priya",24,'F'))));;
		
		Map<UserId,Emp> map = new HashMap<UserId,Emp>();		
		map.put(u1, e1);map.put(u2, e2);map.put(u3, e3);map.put(u4, e4);
		map.put(u4, e5);map.put(u5, e6);map.put(u5, e7);
		
		System.out.println("Size of Map: " +map.size());
		Set<Map.Entry<UserId, Emp>> set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry<UserId, Emp> mapentry = (Entry<UserId, Emp>) itr.next();
			System.out.println("UserId: "+mapentry.getKey().getUserId()+"\nPassword: "+mapentry.getKey().getPassword());
			System.out.println("Employee Id: "+mapentry.getValue().empId+"\nEmp Name: "+mapentry.getValue().empName+"\n");						
		}
		
		
	}

}
