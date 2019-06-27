package cdp_1_singleton1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

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
	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		Singleton inst1 = Singleton.getInstance();
		Singleton inst2 = Singleton.getInstance();
		Singleton inst3 = (Singleton)inst1.clone();
		
		//Singleton inst4 = createInstance();
		
		
		System.out.println("HashCode of inst1:"+inst1.hashCode());
		System.out.println("HashCode of inst2:"+inst2.hashCode());
		System.out.println("HashCode of inst3:"+inst3.hashCode());
		//System.out.println("HashCode of inst3:"+inst4.hashCode());
	}
	
	
	public static Singleton createInstance() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException{
		Singleton inst;
		Constructor<Singleton> singletonConstructor = Singleton.class.getDeclaredConstructor(new Class[0]);
		singletonConstructor.setAccessible(true);
		
		inst = (Singleton) singletonConstructor.newInstance(new Object[0]);
		return inst;
	}
}
class SingleInstance implements Runnable{
	public void run(){
		
	}
}