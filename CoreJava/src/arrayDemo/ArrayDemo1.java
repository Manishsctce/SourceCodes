package arrayDemo;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int arr[] = new int[4];
		int arr2[];
				
		//demo1();
		//System.out.println(demo2(9, 2));
		demo5();
		int arrLength = arr.length;
		
		//System.out.println(arr2);
		try{
			MyClass myc = (MyClass) MyClass.class.getClassLoader().loadClass("arrayDemo.MyClass").newInstance();  
			myc.accessSpecifierTesting();
		}catch(Exception e){
			System.out.println("Error in arrayDemo.MyClass.newInstance()");
		}
	}

	//DIFFERENT WAYS OF primitive ARRAYS
	static void demo1(){
		int[] myIntArray1 = new int[3];//For convenience int[] num is preferable because it clearly tells that you are talking here about array. Otherwise no difference
		int myIntArray4[] = new int[4];		
		int[] myIntArray2 = {1,2,3};
		int[] myIntArray3 = new int[]{1,2,3};
		int scores[    ] = {3, 5, 7};
		
		
	}
	
	//Non-primitive array
	static void demo2(){
		String cats[] = {"Fluffy", "Spot", "Zeus"};
		boolean results[ ] = new boolean [] {true, false, true};
		Integer results2[ ] = {new Integer(3), new Integer(5), new Integer(8)};
	}
	
	//MULTI-DIMENSIONAL ARRAY
	static void demo3(){				
		//int [ ][ ] scores = {2,7,6}, {9,3,45};
		int [ ][ ] scores2 = {{2,7,6}, {9,3,45}};
		int[] num[] = new int[5][2];
		//int[] num[2] = new int[5][];
		
		System.out.println(scores2[0][2]);
		
		
	}
	
	//return array type 
	static public int[] demo4(){
		int a[] = {1,2,3};
		//return {1,2,3};//array literals cannot be used for re-assigning an array
		return a;
	}
	
	public static void demo5(){
		int arr1[]={4,4,5};
		int arr2[] = new int[3];
		
		Class c=arr1.getClass();
		String name=c.getName();

		System.out.println("Array1 Class : "+name);//Array Class : [I
		System.out.println("Array2 Class : "+arr2.getClass().getName());
	}
	
	static double demo2(int x, double y){
		return (long)x/y*2;
	}
	
	
}

class MyClass extends accessSpecifierDemo.ProtectedDefaultDemo1{
	/*private String priVar1= "Private variable of MyClass";
	protected String proVar1= "Protected variable of MyClass";
	String defVar1 = "default variable of MyClass";*/
	public void accessSpecifierTesting() {
		System.out.println(proVar1);
		//System.out.println(defVar1);
	}
	
}