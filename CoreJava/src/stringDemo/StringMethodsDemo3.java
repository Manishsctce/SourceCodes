package stringDemo;
/*  SPLIT METHOD
 * 
 */
public class StringMethodsDemo3 {
	public static final String str = "MAYHEM,INFLICT,RAVISH,RAVAGE ,FORTIFY";
	public static void main(String[] args) {
		String strArray[] = new String[10];
		strArray = str.split(",");
		display(strArray);
	}
	
	public static void display(String str[]){
		for(String temp: str){
			System.out.print(temp+ " \n");
		}
	}

}
