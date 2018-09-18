// A simple example that uses a native method. 
public class NativeDemo { 
	int i; 
	public static void main(String args[]) { 
		NativeDemo ob = new NativeDemo(); 
		ob.i = 10; 
		System.out.println("This is ob.i before the native method:" + ob.i); 
		ob.test(); // call a native method 
		System.out.println("This is ob.i after the native method:" + ob.i); 
	} 
	// declare native method 
	//Native methods are usually used to interface with system calls or libraries written in other programming languages.
	public native void test() ; 
	// load DLL(dynamic link library) that contains static method 
	static {
		//static void loadLibrary(String filename) 
		//here file NativeDemo is having extension .dll
		System.loadLibrary("NativeDemo"); 
		
	} 
} 