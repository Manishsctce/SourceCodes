package stringDemo;

public class ReverseWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(reverseWordOfString("dude manish what the fuck"));
		System.out.println("Reverse:: "+reverseWordOfString2("dude manish what the fuck"));
	}
	
	public static String reverseWordOfString(String str){
		StringBuilder res = new StringBuilder();
		String arr[] = str.split(" ");
		System.out.println(arr.length);
		for(int i=arr.length-1;i>=0;i--){
			System.out.println(arr[i]);
			res.append(arr[i]+" ");
		}
		return res.toString();
	}
	
	public static String reverseWordOfString2(String str) {
		StringBuilder  sb =
				
//				str.chars().mapToObj(c->(char)c)
//				.reduce("", (s,c)-> c+s, (s1,s2)->s2+s1);
		
				str.chars().mapToObj(c->(char)c)
					.reduce(new StringBuilder(), (s,c)-> {
						return new StringBuilder(String.valueOf(c)).append(s);						
						}, (s1,s2)-> s2.append(s1));
//		
		return sb.toString();
	}
}
