package stringDemo;

public class ReverseWordOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWordOfString("dude manish what the fuck"));
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
}
