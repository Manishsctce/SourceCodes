package polymorphism;
/* METHOD OVERLOADING RETURN TYPES
 * primitive data type can be autoboxed an return in respective Wrapper class object
 * 
 */
class AClass{
	public Integer method1() throws Exception{
		return 0;
	}
	public Integer method1(int i) throws Throwable{
		return 0;
	}
	public Float method2(){
		//return 0;//Compilation error cnt convert int -> float
		return 0.0f;
	}
	//This method can return any thing
	public Object method3(){
		Object obj;
		//return 0;
		//return 0.0f;
		//return "String";
		return 'F';
		//return null;
		//return 11111111111l; 
	}
	public Long method4(){
		return 0l;
	}
}
class BClass extends AClass{
	
}
public class MOL_returnTypesDemo2 {
	public static void main(String[] args) {


	}

}
