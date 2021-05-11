package cdp_1_singleton1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

public class Singleton implements Runnable, Cloneable{
	public static Singleton instance = null;
	
	private Singleton(){
		if(instance!=null)
			//getInstance();
			throw new InstantiationError("Cannot instantiate another instance for this class");
	}
	public void run(){
		
	}
	public static Singleton getInstance(){
		if(instance==null)
			instance = new Singleton();
		return instance;
	}
	
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Not Supported");
	};
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Singleton inst1 = Singleton.getInstance();
		Singleton inst2 = Singleton.getInstance();
		Singleton inst3 = null;
		try {
			inst3 = (Singleton)inst1.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Exception Occur: "+ e.getLocalizedMessage());			
		}
		
		Singleton inst4 = createInstance();
		
		
		System.out.println("HashCode of inst1:"+inst1.hashCode());
		System.out.println("HashCode of inst2:"+inst2.hashCode());
		
		Optional.ofNullable(inst3).ifPresent(inst -> System.out.println("HashCode of inst3:" + inst.hashCode()));
		
		
		System.out.println("HashCode of inst4:"+Optional.ofNullable(inst4).map(inst -> inst.hashCode()).orElse(0));
	}
	
	
	public static Singleton createInstance() {
		Singleton inst = null;
		try {
			Constructor<Singleton> singletonConstructor = Singleton.class.getDeclaredConstructor(new Class[0]);
			singletonConstructor.setAccessible(true);
			
			inst = (Singleton) singletonConstructor.newInstance(new Object[0]);
		} catch ( IllegalArgumentException| SecurityException |  IllegalAccessException| InvocationTargetException | NoSuchMethodException | InstantiationException e) {
			System.out.println("Using constructor: " + e.getLocalizedMessage());
			
		} 
		return inst;
	}
}
class SingleInstance implements Runnable{
	public void run(){
		
	}
}