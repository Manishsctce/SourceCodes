package classesDemo;

class TopClass3{
	private String topClassVar;
	private static String staticVar;
	
	interface LocalInterface{
		
	}
	
	static void topClassMethod(){
		/*interface LocalInterface{
			
		}*/
		
		class InnerClasss{
			//String s = topClassVar;
			String s = staticVar;
		}
	}
}



public class LocalInnerClassDemo2 {

	public static void main(String[] args) {
		
	}

	public void methods(){
		
	}
}
