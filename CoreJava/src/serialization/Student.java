package serialization;
import java.io.Serializable;
/* Serialization is a mechanism of writing the state of an object into a byte stream.
 * Serializable is a marker interface 
 * Serializable class associates with a version number called serialVersionUID  during runtime
 * serialVersionUID" that must be static, final, and of type long
 */
class School{
	String schoolName;
	String std;
	School(){
	
	}
	School(String schoolName, String std){
		this.schoolName = schoolName;
		this.std =std;
	}
}
public class Student extends School implements Serializable{

	private static final long serialVersionUID = 2737304494087343675L;
	int id;
	String name;

	public Student(int id, String name, String schoolName,String std) {
		super(schoolName,std);
		this.id = id;
		this.name = name;
	}
}