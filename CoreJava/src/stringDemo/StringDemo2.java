package stringDemo;
/* HASHCODE
 * 
 */
public class StringDemo2 {

	public static void main(String[] args) {
		String str = null;
		String str2 = "Manish";
		String str3 = new String("Manish");
		System.out.println(str);
		
		
		//HashCode 
		System.out.println("T".hashCode());
		System.out.println("M".hashCode());
		System.out.println("TM".hashCode());
		System.out.println(84*31+77);
		Integer i =2681;
		System.out.println(i.hashCode());
		
		//System.out.println("T".);
	}
}
