package zzJavaObjective;

public class Quest10 {

	public static void main(String[] args) {
		
		System.out.println(tryCatch());
	}
	
	public static boolean tryCatch(){
		try{
			return true;
		}finally{
			return false;
		}
	}
}
