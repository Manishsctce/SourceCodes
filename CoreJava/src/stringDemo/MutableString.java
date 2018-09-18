package stringDemo;

public class MutableString {

	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder();
		//str1 = str1+"Manish";
		
		str1.append("Manish");
		str1.append(" Agrawal");
		System.out.println(str1);
		
	}

}
