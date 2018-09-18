package zzJavaObjective;

public class ExceptionQuestion1 {

	public static void main(String[] args) {
		System.out.println(method());

	}
	
	public static int method(){
		try{
			//char ac = (char)65;
			//System.out.println(ac);
			System.out.println("try");
			int x = 4/0;
			return 10;
		}
		catch(Exception e){
			System.out.println("Catch");
		}
		finally{
			System.out.println("finally");
			return 88;
		}
	}
}
