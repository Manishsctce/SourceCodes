package serialization;
import java.io.*;
/* USE OF TRANSIENT 
 * If an un-serializable class is serializing as below will throw  NotSerializableException 
 * and can be solve by making it transient
 * 
 * if a class is Serializable but its super class doesnot then super class instance variable will not serialize 
 * and while deserialization it will set as default value
 *  
 * Add fields - When the class being reconstitued has a field that does not occur in the stream, 
 * that field in the object will be initialize to default value for its type.
 */

class SerializableClass implements Serializable{
	private int privateIntVar1;
	private int privateIntVar2;
	 int staticIntVar;
	final int finalIntVar;

	//if this not mark as transient then throw Exception NotSerializableException
	transient NonSerializableClass nonSerializableClass; 
	
	private static final long serialVersionUID = 2737304494087343675L;
	
	public SerializableClass() {
		this.finalIntVar = 0;
	}
	public SerializableClass(int updateFinalVar){
		//this();
		this.finalIntVar = updateFinalVar;
	}
	public int getPrivateIntVar1() {
		return privateIntVar1;
	}
	public void setPrivateIntVar1(int privateIntVar1) {
		this.privateIntVar1 = privateIntVar1;
	}
	public int getPrivateIntVar2() {
		return privateIntVar2;
	}
	public void setPrivateIntVar2(int privateIntVar2) {
		this.privateIntVar1 = privateIntVar1;
	}
	///*
	  public  int getStaticIntVar() {
	 
		return staticIntVar;
	}
	public  void setStaticIntVar(int staticIntVar) {
		//SerializableClass.staticIntVar = staticIntVar;
		this.staticIntVar = staticIntVar;
	}
	 //*/
	public int getFinalIntVar() {
		return finalIntVar;
	}
	/*public void setFinalVar(int finalvar){
		this.finalIntVar = finalvar;
	}*/
	public NonSerializableClass getNonSerializableClass() {
		return nonSerializableClass;
	}
	public void setNonSerializableClass(NonSerializableClass nonSerializableClass) {
		this.nonSerializableClass = nonSerializableClass;
	}
	
	
}

class NonSerializableClass {
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
public class SerializationDemo1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String path_filename = ".\\src\\serialization\\serialize.txt";
		  File file = new File(path_filename);
		  
		  NonSerializableClass nsc = new NonSerializableClass();
		  nsc.setId(100);nsc.setName("Manish");
	
		  //persist(file.getCanonicalPath(), nsc); //throw NotSerializableException
		  
		  
		  SerializableClass sc = new SerializableClass(101);
		  sc.setPrivateIntVar1(1001);
		 // sc.setPrivateIntVar2(1002);
		  sc.setStaticIntVar(105);
		  sc.setNonSerializableClass(nsc);
		  
		  persist(file.getCanonicalPath(), sc);
		  
		SerializableClass sc2 =  (SerializableClass) depersist(file.getCanonicalPath());
		  display(sc2);
	}
	
	public static void display(SerializableClass sc){
		System.out.println();
		System.out.print(" Final: "+sc.getFinalIntVar());
		System.out.println(" Private1: "+sc.getPrivateIntVar1());
		System.out.println(" Private2: "+sc.getPrivateIntVar2());
		System.out.println(" Static: "+sc.getStaticIntVar());
		NonSerializableClass nsc = sc.getNonSerializableClass();
		System.out.println(" Non-serializeclass : "+nsc);
		//System.out.println("Id: "+nsc.getId());
		//System.out.print(" Name: "+nsc.getName());
		System.out.println();
	}
	
	public static void persist(String path_filename, Object sc) throws IOException{
		FileOutputStream fout=new FileOutputStream(path_filename );
		  ObjectOutputStream out=new ObjectOutputStream(fout);
		  
		  out.writeObject(sc);
		  out.flush();
		  System.out.println("serialized successfully");
	}
	
	public static Object depersist(String path_filename) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream( path_filename);
		ObjectInputStream in=new ObjectInputStream(fis);
		
		SerializableClass sc2 = (SerializableClass)in.readObject();
		return sc2;
	}
}
