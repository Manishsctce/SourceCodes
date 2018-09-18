package serialization;
import java.io.*;
/* 
 * 2. Change a field from static to non-static
 * After serialization  Final: 0 Private: 1001 Static: 105
 * After change :  Final: 0 Private: 1001 Static: 0

 */
class SerializableClass2 implements Serializable{
	private int privateIntVar;
	int staticIntVar;
	final int finalIntVar;
	//if this not mark as transient then throw Exception NotSerializableException
	//NonSerializableClass2 nonSerializableClass; 
	private static final long serialVersionUID = 123456789L;
	
	public SerializableClass2() {
		this.finalIntVar = 0;
	}
	public SerializableClass2(int updateFinalVar){
		//this();
		this.finalIntVar = updateFinalVar;
	}
	public int getPrivateIntVar() {
		return privateIntVar;
	}
	public void setPrivateIntVar(int privateIntVar) {
		this.privateIntVar = privateIntVar;
	}
	public  int getStaticIntVar() {
		return staticIntVar;
	}
	public void setStaticIntVar(int staticIntVar) {
		this.staticIntVar = staticIntVar;
	}
	public int getFinalIntVar() {
		return finalIntVar;
	}
	/*public void setFinalVar(int finalvar){
		this.finalIntVar = finalvar;
	}*/
/*	public NonSerializableClass2 getNonSerializableClass() {
		return nonSerializableClass;
	}
	public void setNonSerializableClass(NonSerializableClass2 nonSerializableClass) {
		this.nonSerializableClass = nonSerializableClass;
	}*/
	
	
}

class NonSerializableClass2 {
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class SerializationDemo2 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path_filename = "C:\\Users\\Manish\\Documents\\Programming\\Source Code\\CoreJava\\src\\serialization\\serialize2.txt";
		  
		  NonSerializableClass2 nsc = new NonSerializableClass2();
		  nsc.setId(100);nsc.setName("Manish");
		  
		  SerializableClass2 sc = new SerializableClass2();
		  sc.setPrivateIntVar(1001);
		  sc.setStaticIntVar(105);
		  //sc.setNonSerializableClass(nsc);
		 //persist(path_filename, sc);
		  
		 SerializableClass2 sc2 =  (SerializableClass2) depersist(path_filename);
		  display(sc2);
	}
	
	public static void display(SerializableClass2 sc){
		System.out.println();
		System.out.print(" Final: "+sc.getFinalIntVar());
		System.out.print(" Private: "+sc.getPrivateIntVar());
		System.out.print(" Static: "+sc.getStaticIntVar());
		//NonSerializableClass2 nsc = sc.getNonSerializableClass();
		
		/*System.out.println("Id: "+nsc.getId());
		System.out.print(" Name: "+nsc.getName());*/
		System.out.println();
	}
	public static void persist(String path_filename, SerializableClass2 sc) throws IOException{
		FileOutputStream fout=new FileOutputStream(path_filename );
		  ObjectOutputStream out=new ObjectOutputStream(fout);
		  
		  out.writeObject(sc);
		  out.flush();
		  System.out.println("serialized successfully");
	}
	
	public static Object depersist(String path_filename) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream( path_filename);
		ObjectInputStream in=new ObjectInputStream(fis);
		
		SerializableClass2 sc2 = (SerializableClass2)in.readObject();
		return sc2;
	}
}
