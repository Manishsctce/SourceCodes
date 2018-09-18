package stringDemo;
/* Different way of String initialization
 * 
 */
public class StringInitializationDemo {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = new String(new char[]{'a','b','c'});
		//String str4 = 'a'+'b'+'c';
		String strPassword="Unknown";
		char[] charPassword= new char[]{'U','n','k','w','o','n'};
		System.out.println("String password: " + strPassword);
		System.out.println("Character password: " + charPassword);//[C@2a139a55
		for(int i=0;i<charPassword.length;++i){//array.length and no effect of pre-increment
			System.out.print(charPassword[i]);
			
		}
	}

}
