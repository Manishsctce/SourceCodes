package serialization;
/*if super class is not serializable then during serialization f subclass the member variables of object is saved but not of super class
 * it is initialize by super class construcctor during deserialization
 * 
 */
import java.io.*;  
class Depersist{  
 public static void main(String args[])throws Exception{  
	 String path_filename = "C:\\Users\\Manish\\Documents\\Programming\\Source Code\\CoreJava\\src\\serialization\\student.txt";
  ObjectInputStream in=new ObjectInputStream(new FileInputStream(path_filename));  
  Student s=(Student)in.readObject();  
  
  System.out.println("Student Id:\t\t "+s.id+"\nStudent Name:\t\t"+s.name
		  +"\nSchool Name:\t"+s.schoolName+"\nStd: "+s.std);  
 
  
  in.close();  
 }  
}  